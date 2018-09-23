package learning.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterSample<T> {

	public List<T> filterSampleWithPredicate(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		list.stream()
			.filter(x-> p.test(x))
			.forEach(x-> returnList.add(x));
		return returnList;
		
	}
	
	public List<T> filterSampleWithPredicateNegate(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		list.stream()
			.filter(x-> p.negate().test(x))
			.forEach(x-> returnList.add(x));
		return returnList;
		
	}
	
	public List<T> filterSampleWithPredicateOr(Predicate<T> p1, Predicate<T> p2,List<T> list) {
		List<T> returnList = new ArrayList<>();
		list.stream()
			.filter(x-> p1.or(p2).test(x))
			.forEach(x-> returnList.add(x));
		return returnList;
		
	}
	
	public List<T> filterSampleWithPredicateAnd(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		List<T> returnList = new ArrayList<>();
		list.stream()
			.filter(x-> p1.and(p2).test(x))
			.forEach(x-> returnList.add(x));
		return returnList;
		
	}
}
