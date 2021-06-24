package assignment_3;

public class Question_7 {

	public static void main(String[] args) {
          int price = 95,
        	  quarters = (100 - price)/25,
        	  dimes = (100 - price)%25/10,
        	  nickles = (100 - price)%25%10/5;
          
          
         System.out.println("Price in cents : " + price + "\n"
         		+ "\n"
         		+ "Your change is " 
         		+ quarters + " quarters, "
         		+ dimes + " dimes, and " 
         		+ nickles + " nickles"); 
	}

}
