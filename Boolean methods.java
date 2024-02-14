
public class CalculatorHW {

	public static void main(String[] args) {
		String str1 = "uncle";
		boolean answer = false;
		
		answer = isAbecedarian(str1);
		System.out.print(answer);
	}
	public static Boolean isAbecedarian(String str2) {
		char[] toCharArray = str2.toCharArray();
		
		char previous = '\u0000';
		for (char current : toCharArray) {
		
	        if (current < previous)
	            return false;
	        previous = current;
		}
	
		return true;
		
		 
		
