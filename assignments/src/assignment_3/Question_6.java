package assignment_3;

public class Question_6 {

	public static void main(String[] args) {
		int numOfMgs = 500;
		int numOfDrinks = (int)(10/((float)numOfMgs/1000));
		
		System.out.println("Number of milligrams in drink:" + numOfMgs + "\n"
				            + "It would take about " + numOfDrinks + " drinks for a lethal overdose");
	}

}
