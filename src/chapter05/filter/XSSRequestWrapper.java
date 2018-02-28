package chapter05.filter;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class XSSRequestWrapper extends HttpServletRequestWrapper{

	public XSSRequestWrapper(HttpServletRequest request) {
		super(request);
	}

	
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name); 
		return htmlEncode(value);
	}
	
	public String htmlEncode(String parameter) {
		for (String key : encodeMap.keySet()) {
			parameter = parameter.replaceAll(key, encodeMap.get(key));
		}
		return parameter;
	}
	
	private static final HashMap<String, String> encodeMap = new HashMap<>();
	
	static {
		encodeMap.put("<", "&#60");
		encodeMap.put(">", "&#62");
		encodeMap.put("/", "&#34");
	}
}
