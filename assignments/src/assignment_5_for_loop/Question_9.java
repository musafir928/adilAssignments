package assignment_5_for_loop;

public class Question_9 {

	public static void main(String[] args) {
       int end = 11;
       String output = "1";
       for (int i=2; i<=end; i++) {
    	   output += (i%2==1 ? ", " + i : "");
       }
       
       System.out.println(output);
	}

}
