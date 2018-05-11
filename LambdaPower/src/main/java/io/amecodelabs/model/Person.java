package io.amecodelabs.model;

public class Person {
	
	private HumanAction action;
	
	private Person(HumanAction action) {
		this.action = action;
	}
	
	public static Person PersonBuild(HumanAction action) {
		return new Person(action);
	}
	
	public void setAction(HumanAction action) {
		this.action = action;
	}
	
	public String getAction() {
		return this.action.doit();
	}

}
