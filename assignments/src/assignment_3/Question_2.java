package assignment_3;

import java.time.Year;

public class Question_2 {

	public static void main(String[] args) {
        String name = "Adil";
        short birthYear = 1986;
        short currentYear = (short)Year.now().getValue();
        
        System.out.println(" Hello, "+ name + "! Based on your input, your age is "+ (currentYear - birthYear) +" :) ");
	}

}
