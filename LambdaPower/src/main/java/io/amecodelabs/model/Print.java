package io.amecodelabs.model;

@FunctionalInterface
public interface Print<T> {

	void publish(T msg);
	
}
