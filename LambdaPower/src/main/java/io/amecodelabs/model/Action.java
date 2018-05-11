package io.amecodelabs.model;

@FunctionalInterface
public interface Action {

	public static String ActionInfo() {
		return "Version 1.0";
	}
	
	default String defaultDoit() {
		return delegate();
	}
	
	private static String delegate() {
		return "Default Beihavior";
	}
	
	boolean doit(int param);
	
	default Action andDoit(Action after) {
		return param -> doit(param) && after.doit(param);
	}
	
}
