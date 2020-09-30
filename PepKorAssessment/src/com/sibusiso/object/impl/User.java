package com.sibusiso.object.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sibusiso.object.IEntity;

/**
 * User Object
 * 
 * @author Sibusiso Makebesana
 * @version 1.0
 * @since 25-September-2020
 *
 */
public class User implements IEntity {
	private String name;
	private String email;
	
	private Map<Status, Set<WorkItem>> workItemsMap;
	
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.workItemsMap = new HashMap<Status, Set<WorkItem>>();
		initializeWorksItemsLists(workItemsMap);
	}
	
	private void initializeWorksItemsLists(Map<Status, Set<WorkItem>> workItemsMap) {
		if(workItemsMap.isEmpty()) {
			workItemsMap.put(Status.TODO, new HashSet<WorkItem>());
			workItemsMap.put(Status.INPROGRESS, new HashSet<WorkItem>());
			workItemsMap.put(Status.DONE, new HashSet<WorkItem>());
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Map<Status, Set<WorkItem>> getWorkItemsMap() {
		return workItemsMap;
	}

	public void setWorkItemsMap(Map<Status, Set<WorkItem>> tasksMap) {
		this.workItemsMap = tasksMap;
	}
}
