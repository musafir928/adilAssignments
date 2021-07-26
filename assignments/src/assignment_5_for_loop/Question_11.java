package assignment_5_for_loop;

public class Question_11 {

	public static void main(String[] args) {
		for(int i = 0; i<=3; i++) {
			for(int k =1 ; k<=i; k++) {
				System.out.print("   ");
			}
			for(int j = 4-i; j>=1; j--) {
				System.out.print(j);
				System.out.print("      ");
			}
			System.out.println();
			System.out.println();
			System.out.print(" ");
		}

	}

}
