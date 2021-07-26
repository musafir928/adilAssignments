package assignment_5_for_loop;

public class Question_3 {

	public static void main(String[] args) {
		int initialValue = 5, endValue = 50, step = 1;
		for (int i = initialValue; i<=endValue;i+=step) {
			if(i%2==0) {
				System.out.print(i+" ");
			} 
		}
	}

}
