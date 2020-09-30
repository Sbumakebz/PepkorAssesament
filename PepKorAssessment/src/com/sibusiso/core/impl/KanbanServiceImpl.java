package com.sibusiso.core.impl;

import java.util.Set;

import com.sibusiso.core.IKanbanService;
import com.sibusiso.object.impl.Status;
import com.sibusiso.object.impl.User;
import com.sibusiso.object.impl.WorkItem;

/**
 * KanbanServiceImpl
 * 
 * @author Sibusiso Makebesana
 * @version 1.0
 * @since 25-September-2020
 *
 */
public class KanbanServiceImpl implements IKanbanService {
	private User user;

	public KanbanServiceImpl(User user) {
		super();
		this.user = user;
	}

	public boolean addWorkItemToUser(WorkItem newWorkItem) {
		if (newWorkItem.getStatus().equals(Status.INPROGRESS)) {
			if (user.getWorkItemsMap().get(Status.INPROGRESS) != null
					&& (user.getWorkItemsMap().get(Status.INPROGRESS).size() == 5)) {
				return false;
			}
			return user.getWorkItemsMap().get(newWorkItem.getStatus()).add(newWorkItem);
		}
		return user.getWorkItemsMap().get(newWorkItem.getStatus()).add(newWorkItem);
	}

	public Set<WorkItem> getUserWorkItemsByStatus(Status aStatus) {
		return user.getWorkItemsMap().get(aStatus);
	}

	public boolean updateWorkItemStatus(WorkItem aWorkItem, 
			Status aStatus) {
		for (Set<WorkItem> items : user.getWorkItemsMap().values()) {
		    for (WorkItem workItem : items) {
				if(workItem.equals(aWorkItem)) {
					workItem.setStatus(aStatus);
					return true;
				}
			}
		}
		return false;
	}
}
