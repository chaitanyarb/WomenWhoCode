package learning.fun;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
	 
	public static void main(String[] args) {
		
		Consumer<Integer> consumer = i -> System.out.println(i);
		//Consumer<Integer> consumer1 =  System.out::println;
		
		List<Integer> integerList=Arrays.asList(new Integer(1), 
                new Integer(10), new Integer(200),
                new Integer(101), new Integer(-10),
                new Integer(0));
			
		for(Integer integer:integerList){
			consumer.accept(integer);
		}		
	}
}
