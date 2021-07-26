package assignment_5_for_loop;

public class Question_1 {

	public static void main(String[] args) {
		int initialValue = 0, endValue = 1000, step = 10;
		for (int i = initialValue; i<=endValue;i+=step) {
			if(i==endValue) {
				System.out.print(i);
			} else {
				System.out.print(i + ",");
			}
		}

	}

}
