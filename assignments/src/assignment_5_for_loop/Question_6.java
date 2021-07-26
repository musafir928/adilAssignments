package assignment_5_for_loop;
import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		 System.out.print("please input a valid ineger: ");
		 Scanner sc = new Scanner(System.in);
		 int range = sc.nextInt();
		 
		 int fl = 0, fr = 1;
		 System.out.print(fl + ", " + fr);
		 
		 for (int i = 2; i<= range; i++) {
			 fr += fl;
			 fl = fr - fl;
			 System.out.print(", " + fr);
		 }
	}

}
