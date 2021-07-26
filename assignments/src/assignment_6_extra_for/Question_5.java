package assignment_6_extra_for;

public class Question_5 {

	public static void main(String[] args) {
		int current;
		for(int i =1; i<=7; i++) {
			current =i;
			for(int j =1;j<=7-i;j++) {
				System.out.print(1);
			}
			for(int k =1; k<=i; k++) {
				System.out.print(current);
			}
			System.out.println();
		}
	}

}
