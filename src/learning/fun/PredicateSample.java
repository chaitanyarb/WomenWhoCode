package learning.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample<T> {
	
	public List<T> predicateTest(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for(T testObj : list) {
			if(p.test(testObj)) returnList.add(testObj);
		}
		return returnList;
		
	}

	public List<T> predicateNegateTest(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for(T testObj : list) {
			if(p.negate().test(testObj)) returnList.add(testObj);
		}
		return returnList;
		
	}
	
	public List<T> predicateOrTest(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for(T testObj : list) {
			if(p1.or(p2).test(testObj)) returnList.add(testObj);
		}
		return returnList;
		
	}
	
	public List<T> predicateAndTest(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for(T testObj : list) {
			if(p1.and(p2).test(testObj)) returnList.add(testObj);
		}
		return returnList;
		
	}
}
