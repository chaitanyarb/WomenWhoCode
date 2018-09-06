package learning.fun;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalsSample<T> {

	public void testOptionals(List<T> list,Predicate<T> p) {
		Optional<T> opts = list.stream().
				filter(t -> p.test(t)).findFirst();
		if (opts.isPresent())
			System.out.println("YEs present "+ opts.get());
		else 
			System.out.println(" NA ");
		
	}
}
