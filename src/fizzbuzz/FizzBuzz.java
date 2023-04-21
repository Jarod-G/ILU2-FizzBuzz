package fizzbuzz;

public class FizzBuzz {
	
	private int[] nbSpeciaux = { 3, 5 };
	private String[] valeurSpeciales = { "Fizz", "Buzz" };
	
	public String fizzBuzz(int entree) {
		for(int i = 0; i < nbSpeciaux.length; i++)
		{
			if(entree % nbSpeciaux[i] == 0) {
				return valeurSpeciales[i];
			}
		}
		return Integer.toString(entree);
	}
	
}
