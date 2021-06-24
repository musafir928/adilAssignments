package assignment_3;

public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float gallonToLitreRate = 3.78541f;
        int gallon = 15;
        double liter = gallon * gallonToLitreRate;
        
        System.out.println(gallon + " gallon is " + liter + " liter");
        System.out.format("%d gallon is %.4f liter", gallon, liter);
	}

}
