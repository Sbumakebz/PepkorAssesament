package com.sibusiso.object.impl;

import com.sibusiso.object.IEntity;

/**
 * Work Item Object
 * 
 * @author Sibusiso Makebesana
 * @version 1.0
 * @since 25-September-2020
 *
 */
public class WorkItem implements IEntity {
	private String title;
	private String description;
	private User user;
	private Status status;
	
	public WorkItem(String title, String description, User user, Status status) {
		super();
		this.title = title;
		this.description = description;
		this.user = user;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public boolean equals(Object obj) {
		WorkItem other = null;
		if (obj instanceof WorkItem) {
			other = (WorkItem) obj;
			return this.getTitle().equals(other.getTitle()) && 
					this.getDescription().equals(other.getDescription())
					&& this.getUser().getName().equals(other.getUser().getName());
		}
		return false;
	}
}
