package assignment_5_for_loop;

public class Question_7 {

	public static void main(String[] args) {
		int initialValue = 1, endValue = 100, step = 1;
		for(int i = initialValue; i<=endValue; i+= step) {
			if(i%5 != 0) {
				continue;
			} 
//			 else {step = 5;}

			System.out.print(i + " ");
		}

	}

}
