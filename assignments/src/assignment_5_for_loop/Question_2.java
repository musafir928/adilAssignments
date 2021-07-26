package assignment_5_for_loop;

public class Question_2 {

	public static void main(String[] args) {
		int initialValue = 3, endValue = 130, step = 1;
		for (int i = initialValue; i<endValue;i+=step) {
			if(i%2==1) {
				System.out.print(i+" ");
			} 
		}
	}

}
