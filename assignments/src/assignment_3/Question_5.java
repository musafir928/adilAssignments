package assignment_3;

public class Question_5 {

	public static void main(String[] args) {
		int totalSeconds = 3695;
		int hours = totalSeconds/3600;
		int minutes = (totalSeconds%3600)/60;
		int seconds = ((totalSeconds%3600)%60);
		
		System.out.format("inputSecond is %d%n"
				          + "%n"
				          + "%d hours, %d minutes, and %d seconds", 
				          totalSeconds, hours, minutes, seconds);
	}

}
