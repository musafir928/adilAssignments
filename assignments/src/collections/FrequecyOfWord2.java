package collections;

public class FrequencyOfWord2 {
	
	public static void main(String[] args) {
		String sentence = "Java Java Java JAVA JaVA";
		String word = "java";
		
		sentence = sentence.toLowerCase();
		word = word.toLowerCase();
		
		int count =0;
		
		while(sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		
		System.out.println(count);	
	}
}