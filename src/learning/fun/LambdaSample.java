package learning.fun;

public class LambdaSample  {
	
	public static void main(String[] args) {
		
		LambdaSample ls = new LambdaSample();
		
		ls.print((name) -> System.out.println("Hello!! "+name));		
		
	}

	@FunctionalInterface
	public interface FirstInterface {
	 //the abstract method  
	 public void name(String param);
	}
	
	/**
	 * @param name
	 */
	private void print(FirstInterface fi) {
		fi.name("Chai");
	}
}
