import java.util.Scanner;
public class Main {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		
		//if something "tim" then...
		if (s.equals("tim")) {
			System.out.println("You typed tim");
		
			//you can add as many else ifs as you want. 
		}
		else if (s.equals("hello")){
			System.out.println("Hi!");

			
			//else is used to replace if. never use both at once b/c one is if statement, the other is else.
		}
		else {
			System.out.println("Print");
			
		
		}
		

	}
	
}
