package assignment_5_for_loop;
import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		int product = 0;
		while(product < 100) {	
	        System.out.print("please input a valid ineger: ");
		    Scanner sc = new Scanner(System.in);
		    product = sc.nextInt()*10;
		    System.out.println("you product is now: " + product);
		    System.out.println();
		}
		
		System.out.println("you product is now grater than or equal to 100, while loop is ended");
		
	}

}

