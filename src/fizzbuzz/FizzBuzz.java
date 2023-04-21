package fizzbuzz;

public class FizzBuzz {
	
	public static final String UN = "1";
	public static final String DEUX = "2";
	public static final String FIZZ = "fizz";
	public static final String BUZZ = "buzz";
	
	public String fizzBuzz(int entree) {
		if(entree == 3) {
			return FIZZ;
		}
		if(entree == 5) {
			return BUZZ;
		}
		return Integer.toString(entree);
	}
	
}
