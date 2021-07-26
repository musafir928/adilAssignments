package assignment_6_extra_for;

public class Question_3 {

	public static void main(String[] args) {
		int step =1;
		for(int i =1 ; i>=1; i+=step) {
			for(int k =1;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j =i ; j<=7; j++) {
				System.out.print(j + " ");
				if (i==7) {
					step =-1;
				};
			}
			System.out.println();
		}
	}

}
