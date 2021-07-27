package lab_1;

public class Question_4 {

	public static void main(String[] args) {
		deerPlay(70, false);
		deerPlay(95, false);
		deerPlay(95, true); 
	}
	
	public static void deerPlay (int temperature, boolean isSummer) {
		int upperLimit = isSummer ? 100 : 90;
		if(temperature >=60 && temperature <= upperLimit) {
			System.out.println(true);
		} else {
			System.out.println(false);			
		}
	}

}
