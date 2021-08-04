package collections;

public class FrequencyOfWord {	
	public static void main(String[] args) {
		String sentence = "he is a developer, He likes Java, but he builds his project using PHP";
		
		String word = "he";
		int count =0 ;
				
		for(int i=0; i <= sentence.length()- word.length() ; i++) {
			String each = sentence.substring(i, i+word.length());
			if(each.equalsIgnoreCase(word)) {
				count++;
			}
		}
		
		System.out.println(count);		
	}
}