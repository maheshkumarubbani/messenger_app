package org.mighty.temp.messenger.dbobject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Message {
	
	private long id;
	private String message;
	private Date create;
	private String author;
	private Map<Long, Comment> comments = new HashMap<>();
	
	public long getId() {
		return id;
	}
	
	public Message() {
		
	} 
	
	public Message(long id, String message,String author) {
		super();
		this.id = id;
		this.message = message;
		this.create = new Date();
		this.author = author;
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
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@XmlTransient
	public Map<Long,Comment> getComments(){
		return comments;
	}
	
	public void setComment(Map<Long,Comment> comments) {
		this.comments = comments;
	}
}
