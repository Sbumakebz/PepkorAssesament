package com.sibusiso.core;

import java.util.Set;

import com.sibusiso.object.impl.Status;
import com.sibusiso.object.impl.WorkItem;

/**
 * IKanbanService
 * 
 * @author Sibusiso Makebesana
 * @version 1.0
 * @since 25-September-2020
 *
 */
public interface IKanbanService {
	public boolean addWorkItemToUser(WorkItem newWorkItem);
	public Set<WorkItem> getUserWorkItemsByStatus(Status aStatus);
	public boolean updateWorkItemStatus(WorkItem aWorkItem, Status aStatus);
}
