package fizzbuzz;

public class FizzBuzz {
	
	private int[] nbSpeciaux = { 3, 5 };
	private String[] valeurSpeciales = { "Fizz", "Buzz" };
	
	public String fizzBuzz(int entree) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < nbSpeciaux.length; i++)
		{
			if(entree % nbSpeciaux[i] == 0) {
				sb.append(valeurSpeciales[i]);
			}
		}
		if(sb.length() == 0) {
			sb.append(Integer.toString(entree));
		}
		
		return sb.toString();
	}
	
}
