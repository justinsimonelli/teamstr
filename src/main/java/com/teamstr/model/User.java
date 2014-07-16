package com.teamstr.model;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	@Override
    public String toString() {
        return String.format(
                "User[id=%s, userName='%s']",
                id, userName);
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
