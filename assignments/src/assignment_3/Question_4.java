package assignment_3;

public class Question_4 {

	public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println();
       
        System.out.println("------");
        
        // swapping
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        
        System.out.println();
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);

	}

}
