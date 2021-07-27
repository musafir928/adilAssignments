package lab_1;

public class Question_6 {

	public static void main(String[] args) {
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);
	}
	
	public static void cigarParty (int count, boolean isWeekend) {
		if(count>=40 && (isWeekend || count <= 60)) {					
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
