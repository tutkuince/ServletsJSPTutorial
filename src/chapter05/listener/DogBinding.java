package chapter05.listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class DogBinding implements HttpSessionBindingListener{
	private String breed;
	
	public DogBinding(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		// code to run now that i know i'm in session
	}
	
	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		// code to run now that i know i am not longer part of a session
	}
}
