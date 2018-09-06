package learning.fun;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Driver {

	public static void main (String args[]) {
		List<String> listOfStrings = Arrays.asList("one","two","three","four","five");
		List<Integer> listOfInterger =  Arrays.asList(3,5,1,6,7,10,2, 15);
		System.out.println("***************Testing with Predicate*****************");
		testingPredicate(listOfInterger,listOfStrings);
		System.out.println("***************Testing with Filter and Predicate*****************");
		testingFilterWithPredicate(listOfInterger,listOfStrings);
		System.out.println("***************Testing with BiFunction*****************");
		testingBiFunction(listOfInterger,listOfStrings);
		System.out.println("**********************Testing optionals***************");
		testOptionals(listOfInterger);
		System.out.println("***********************Chained Consumers*************");
		testChainedConsumers(listOfStrings);
	}


	/**
	 * @param listOfInterger
	 * @param listOfStrings
	 */
	private static void testingBiFunction(List<Integer> listOfInterger, List<String> listOfStrings) {
		//Test Predicate Integer
		BiFunctionSample<Integer> psInt = new BiFunctionSample<Integer>();
		System.out.println("Integres : "+psInt.testBiFunction((x->true), listOfInterger));		
		//Passing lambda to predicate
		System.out.println("even nos #s: "+psInt.testBiFunction(x-> (x % 2) == 0, listOfInterger));		
		
		//Test String Predicate
		BiFunctionSample<String> psString = new BiFunctionSample<String>();
		System.out.println("String starts with t: "+psString.testBiFunction(x-> x.startsWith("t") , listOfStrings));		
		System.out.println("String contains i : "+psString.testBiFunction(x-> x.contains("i"), listOfStrings));		
		
	}

	private static void testingFilterWithPredicate(List<Integer> listOfInterger, List<String> listOfStrings) {
		//Test Predicate Integer
		FilterSample<Integer> psInt = new FilterSample<Integer>();
		System.out.println("Integres : "+psInt.filterSampleWithPredicate(x->true, listOfInterger));		
		//Passing lambda to predicate
		System.out.println("even nos #s: "+psInt.filterSampleWithPredicate(x-> (x % 2) == 0, listOfInterger));		
		
		//Test String Predicate
		FilterSample<String> psString = new FilterSample<String>();
		System.out.println("String starts with t: "+psString.filterSampleWithPredicate(x-> x.startsWith("t") , listOfStrings));		
		System.out.println("String contains i : "+psString.filterSampleWithPredicate(x-> x.contains("i"), listOfStrings));		
		
		//Test Negate Predicate Integer
		System.out.println("Not Integres : "+psInt.filterSampleWithPredicateNegate(x->true, listOfInterger));		
		//Passing lambda to predicate
		System.out.println("Not even nos #s: "+psInt.filterSampleWithPredicateNegate(x-> (x % 2) == 0, listOfInterger));		
		
		//Test Predicate Or condition
		System.out.println("Integres divisible by 2 or 5: "+psInt.filterSampleWithPredicateOr(x-> (x%2 == 0), x->(x%5 == 0),  listOfInterger));		
		
		//Test Predicate And condition
		System.out.println("Integres divisible by 2 and 5: "+psInt.filterSampleWithPredicateAnd(x-> (x%2 == 0), x->(x%5 == 0),  listOfInterger));		
						
	}

	private static void testingPredicate(List<Integer> listOfInterger, List<String> listOfStrings) {
		//Test Predicate Integer
		PredicateSample<Integer> psInt = new PredicateSample<Integer>();
		System.out.println("Integres : "+psInt.predicateTest(x->true, listOfInterger));		
		//Passing lambda to predicate
		System.out.println("even nos #s: "+psInt.predicateTest(x-> (x % 2) == 0, listOfInterger));		
		
		//Test String Predicate
		PredicateSample<String> psString = new PredicateSample<String>();
		System.out.println("String starts with t: "+psString.predicateTest(x-> x.startsWith("t") , listOfStrings));		
		System.out.println("String contains i : "+psString.predicateTest(x-> x.contains("i"), listOfStrings));		
		
		//Test Negate Predicate Integer
		System.out.println("Not Integres : "+psInt.predicateNegateTest(x->true, listOfInterger));		
		//Passing lambda to predicate
		System.out.println("Not even nos #s: "+psInt.predicateNegateTest(x-> (x % 2) == 0, listOfInterger));		
		
		//Test Predicate Or condition
		System.out.println("Integres divisible by 2 or 5: "+psInt.predicateOrTest(x-> (x%2 == 0), x->(x%5 == 0),  listOfInterger));		
		
		//Test Predicate And condition
		System.out.println("Integres divisible by 2 and 5: "+psInt.predicateAndTest(x-> (x%2 == 0), x->(x%5 == 0),  listOfInterger));		
				
	}
	
	private static void testOptionals(List<Integer> listOfInteger) {
		
		OptionalsSample<Integer> osInt = new OptionalsSample<Integer>();
		
		osInt.testOptionals(listOfInteger,x-> x>8);
		osInt.testOptionals(listOfInteger,x-> x>18);
		
	}
	
	
	private static void testChainedConsumers(List<String> listOfStrings) {
		
		ChainedConsumerSample<String> consumerTest = new ChainedConsumerSample<>();
		
		Consumer<String> c1 = (x) -> x.toUpperCase();
	    
		Consumer<String> c2 = (x) -> System.out.println(x);
		
		Consumer<String> chainedConsumer = c1.andThen(c2);
		
	    consumerTest.testChainedConsumer(listOfStrings, chainedConsumer);
	}
}
