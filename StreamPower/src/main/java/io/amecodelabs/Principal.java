package io.amecodelabs;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.amecodelabs.data.SomeComponent;
import io.amecodelabs.model.Person;

public class Principal {

	public static void main(String[] args) {
		
		List<Person> persons = SomeComponent.getData();
		
		//Stream Common Operation
		
		persons.stream()
			.filter((p) -> Integer.valueOf(p.getAge()) > 18 )
			.filter((p) -> Integer.valueOf(p.getAge()) <= 25 )
			.forEach(Principal::printPerson);
		
		//Collect Common Operation
		
		IntSummaryStatistics ageSummary = persons
				.stream()
			    .collect(
			        Collectors.summarizingInt(p -> Integer.valueOf(p.getAge()))
			    );
		
		System.out.println(ageSummary.getAverage() + " count ->" + ageSummary.getCount());
		
		Map<String, List<Person>> personsByAge = persons
				.stream()
				.collect(
						Collectors.groupingBy(p -> p.getAge())
				);
		
		personsByAge.forEach((age, info) -> {
			System.out.println("---Age: " + age + "---");
			info.forEach(
					p -> System.out.format("Nombres: %s, Apellidos: %s", 
							p.getNames(), p.getLastNames()).println());
		});
		
		
	}
	
	//some operation on some remote component
	public static void printPerson(Person person) {
		System.out.format("Names: %s, LastNames: %s, Age: %s", 
			person.getNames(), 
			person.getLastNames(), 
			person.getAge()
		).println();
	}

}
