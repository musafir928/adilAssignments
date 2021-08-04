package collections;

public class UniqueCharacters {
	
	public static void main(String[] args) {
		String str = "abbbbbccccccdeeeeefggggggghiiiiiii";
		String result = "";  //bd
		
		for(int j =0; j <= str.length()-1; j++ ) {
			
			char ch = str.charAt(j); 
			int frequency = 0;
			for(int i=0; i <= str.length()-1; i++) {
				if(str.charAt(i) == ch) {
					frequency++;
				}
			}
			
			if(frequency == 1) { 
				result += ch;
			}	
		}
		System.out.println(result);
	}
}

/*
write a program that can return the unique characters from a string
        ex:
            "aabcccd";
        output:
            bd
            
 */