package com.sibusiso.main;

import static org.junit.Assert.assertTrue;

import com.sibusiso.core.IKanbanService;
import com.sibusiso.core.impl.KanbanServiceImpl;
import com.sibusiso.object.impl.Status;
import com.sibusiso.object.impl.User;
import com.sibusiso.object.impl.WorkItem;

/**
 * PepKorAssessment Entry Class
 * 
 * @author Sibusiso Makebesana
 * @version 1.0
 * @since 25-September-2020
 *
 */
public class PepKorAssessmentMain {

	public static void main(String[] args) {
		User user = new User("sibusiso", "sbumakebz@gmail.com");
		IKanbanService kanbanService = new KanbanServiceImpl(user);
		 
		assertTrue("5 WorkItems are already in progress queue for " + user.getName(), kanbanService.addWorkItemToUser
										(new WorkItem("title", "description", user, Status.INPROGRESS)));
	}
}
