package assignment_6_extra_for;

public class Question_4 {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int j =1; j<=i; j++) {
				int current = j%2==0 ? 0 : 1;
				System.out.print(current);
			}
			System.out.println();
		}

	}

}
