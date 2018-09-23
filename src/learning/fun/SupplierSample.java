package learning.fun;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierSample {

	public static void main(String[] args) {
		
		Supplier<Double> s = () -> Math.random();
		
		Supplier<Stream<Integer>> s1 = ()-> Stream.of(1,2,3,4,5).map(Integer::intValue);
		
		s1.get().forEach(System.out::println);
		
		System.out.println(s.get());
		
	}
}
