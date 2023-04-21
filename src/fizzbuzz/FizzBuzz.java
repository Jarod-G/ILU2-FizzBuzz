package fizzbuzz;

public class FizzBuzz {
	
	public static final String UN = "1";
	public static final String DEUX = "2";
	public static final String FIZZ = "fizz";
	
	public String fizzBuzz(int entree) {
		if(entree == 1) {
			return UN;
		}
		if(entree == 2) {
			return DEUX;
		}
		return FIZZ;
	}
	
}
