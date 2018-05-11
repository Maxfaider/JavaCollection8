package io.amecodelabs.data;

import java.util.ArrayList;
import java.util.List;
import io.amecodelabs.model.Person;

public class SomeComponent {
	
	public static List<Person> getData() {
		
		List<Person> persons = new ArrayList<Person>();
		
		persons.add(Person.PersonBuild("Alan", "M.E", "22"));
		persons.add(Person.PersonBuild("Nerton", "Suarez", "30"));
		persons.add(Person.PersonBuild("Maria", "G.H", "19"));
		persons.add(Person.PersonBuild("Yeisle", "U.I", "25"));
		persons.add(Person.PersonBuild("Lulu", "K.I", "25"));
		persons.add(Person.PersonBuild("Marco", "T.F", "16"));
		
		return persons;
	}

}
