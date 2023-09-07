package com.resouce;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Model 
{
	
	private long id;
	private String message;
	private String author;
	
	
	public Model() {
	}
	
	
	public Model(long id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", message=" + message + ", author=" + author +  "]";
	}
	
	

}
