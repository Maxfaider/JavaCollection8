package io.amecodelabs.model;

public class Person {
	
	private String names;
	private String lastNames;
	private String age;
	
	Person(String names, String lastNames, String age) {
		super();
		this.names = names;
		this.lastNames = lastNames;
		this.age = age;
	}

	public static Person PersonBuild(String names, String lastNames, String age) {
		return new Person(names, lastNames, age);
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
