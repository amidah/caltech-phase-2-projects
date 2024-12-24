package com.java.learning.springexample.bean;

// Bean - Java Object Structure with mandatory public getters, and setters
public class Connection {

	String url;
	String username;
	String password;
	
	public Connection() {
		System.out.println("[Connection] Object Created...");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Lifecycle methods of bean init and destroy
	public void myInit() {
		System.out.println("myInit executed for user: " + username);
	}
	
	public void myDestroy() {
		System.out.println("myDestroy executed for user: " + username);
	}
	
	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	
}
