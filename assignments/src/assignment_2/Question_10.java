package assignment_2;

public class Question_10 {

	public static void main(String[] args) {
		
        byte hour = 12,
             minute = 24,
             second = 33;
        
        String amOrPm = "PM",
        	   stringConvertor = "";
        
        char colonSeparator = ':', 
        	 spaceSeparator = ' ';
        
        System.out.println(stringConvertor + hour + colonSeparator + minute + colonSeparator + second + spaceSeparator + amOrPm);
	}

}
