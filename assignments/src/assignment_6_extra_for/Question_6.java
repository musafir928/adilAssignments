package assignment_6_extra_for;

public class Question_6 {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			int current  = i;
			for(int j =1; j<=i; j++) {
				System.out.print(current + " ");
				current += 5 - j;
			}
			System.out.println();
		}

	}

}
