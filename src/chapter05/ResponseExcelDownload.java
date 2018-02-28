package chapter05;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/responseexceldownload")
public class ResponseExcelDownload extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/ms-excel");
		resp.setHeader("Content-Disposition", "attachment; filename=text.xlsx");
		
		
		ServletContext context = getServletContext();
		InputStream input = context.getResourceAsStream("download.xlsx");
		
		byte[] bytes = new byte[1000];
		
		ServletOutputStream out = resp.getOutputStream();
		while(input.read(bytes) != -1) {
			out.write(bytes);
		}
		
		out.close();
	}
}
