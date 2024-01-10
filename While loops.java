import java.util.Scanner;
public class Main {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//While loops. Interchangeable with for loops.
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int x = sc.nextInt();
		
		while (x != 10) {
		System.out.println("Type 10...");
		System.out.println("Type a number: ");
		x = sc.nextInt();
		}
	}
	
}
