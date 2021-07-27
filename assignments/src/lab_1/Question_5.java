package lab_1;

public class Question_5 {

	public static void main(String[] args) {
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
	}
	
	public static void caughtSpeeding (int speed, boolean isBirthday) {
		int extraUpperLimit = isBirthday ? 5 : 0;
		int result = 0;
		if(speed >=81 + extraUpperLimit) {
			result = 2; 
		} else if (speed >=61 + extraUpperLimit){
			result = 1;			
		}
		System.out.println(result);
	}

}
