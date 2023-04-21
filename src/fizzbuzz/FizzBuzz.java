package fizzbuzz;

public class FizzBuzz {
	
	private int[] nbSpeciaux = { 3, 5 };
	private String[] valeursSpeciales = { "Fizz", "Buzz" };
	
	public String fizzBuzz(int entree) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < nbSpeciaux.length; i++)
		{
			if(entree % nbSpeciaux[i] == 0) {
				sb.append(valeursSpeciales[i]);
			}
		}
		if(sb.length() == 0) {
			sb.append(Integer.toString(entree));
		}
		
		return sb.toString();
	}
	
}
