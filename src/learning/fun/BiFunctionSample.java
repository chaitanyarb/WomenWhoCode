package learning.fun;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionSample<T> {
	
	public List<T> testBiFunction(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		//here filter is a BiFunction that act as a higher order Function it takes a list, predicate
	    // as a argument
		BiFunction<List, Predicate, List> filter;
	    
	    filter = (listOfIntegers, predicate) -> {
	    	returnList.addAll((Collection<? extends T>) list.stream().filter(predicate).collect(Collectors.toList()));
	    	return returnList;
	    };
	    //called the apply method of BiFunction and sent list and predicate as argument
	    filter.apply(list, p);
	    return returnList;
		
	}

}
