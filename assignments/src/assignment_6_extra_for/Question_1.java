package assignment_6_extra_for;

public class Question_1 {

	public static void main(String[] args) {
		int step = 1;
		for (int i =1 ; i>= 1; i+=step) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j + " ");
			}
			if(i==7) {
				step = -1;
			}
			System.out.println();
		}

	}

}
