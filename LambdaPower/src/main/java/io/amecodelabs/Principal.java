package io.amecodelabs;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

import io.amecodelabs.model.Person;
import io.amecodelabs.model.Print;
import io.amecodelabs.model.SomeModel;

public class Principal {

	public static void main(String[] args) {
		
		Print<String> console = msg -> System.out.println(msg);
		Person laura = Person.PersonBuild(() -> "Smile");
		
		//Reference to a static method
		Person marco = Person.PersonBuild(Principal::anotherAction);
		
		//Reference to a constructor
		someOperation(SomeModel::new);
		
		//Reference to an instance method of an arbitrary object of a particular type
		someOperation2(SomeModel::new);
		
		console.publish(laura.getAction());
		console.publish(marco.getAction());
		
		
		
	}
	
	//another action of some component
	public static String anotherAction() {
		return "To dream";
	}
	
	//some operation on some remote component
	public static <T> void someOperation(Supplier<T> supplier) {
		//...
	}
	
	//some operation on some remote component
	public static <T> void someOperation2(BiFunction<String, String, T> function) {
		//...
	}
	
}
