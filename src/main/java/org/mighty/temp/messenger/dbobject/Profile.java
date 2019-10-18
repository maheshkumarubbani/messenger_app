package org.mighty.temp.messenger.dbobject;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
	
	private long id;
	private String profileName;
	private String fristName;
	private String lastName;
	private Date created;
	
	public Profile() {
		
	}

	public Profile(long id, String profileName, String fristName, String lastName) {
		super();
		this.id = id;
		this.profileName = profileName;
		this.fristName = fristName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProfileName() {
		return profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	

}
