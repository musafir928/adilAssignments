package assignment_5_for_loop;

public class Question_13 {

	public static void main(String[] args) {
		String current;
        for(int i =0 ; i<=7; i++) {
        	for(int j =0 ; j<=7; j++) {
        		current = (j+i)%2 == 0 ? "W " : "B ";
        		System.out.print(current);
        	}
        	System.out.println();
        }

	}

}
