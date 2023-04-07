package lamda.practice;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerConcept {

	public void whenNamesPresentConsumeAll(){
	    Consumer<String> printConsumer = t -> System.out.println(t);
	    Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
	    cities.forEach(printConsumer);
	}
	
	public static void main(String[] args) {
		ConsumerConcept c = new ConsumerConcept();
		
		c.whenNamesPresentConsumeAll();
		
	}
}
