package com.sibusiso.object.impl;

public enum Status {
	NOSTATUS("NoStatus", 0), TODO("ToDo", 1), INPROGRESS("In-progress", 2), DONE("Done", 3);
	
	private final String name;
	private final int statusCode;

	private Status(String name, int statusCode) {
		this.name = name;
		this.statusCode = statusCode;
	}
	
	public static Status getDayOfWeek(String aStatus) {
		for (Status status : Status.values()) {
			if (status.name.equals(aStatus))
				return status;
		}
		return Status.NOSTATUS;
	}
}
