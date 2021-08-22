package utilities;

import java.util.Arrays;

public class StringUtilities {
	
//    reverse any given string
	public static String reverse(String str) {
		String result = "";
		for(int i = str.length()-1;i>=0;i--) {
			result += str.charAt(i);
		}
		
		return result;
	}
	
	public static boolean isPalindrome(String str) {
		return reverse(str).equalsIgnoreCase(str);
	}
	
	public static String removeDuplication (String str) {
		String result = "";
	      
		for (String each : str.split("")) {
			if(!result.contains(each)) {
				result+= each;
			}
		}
		
		return result;
	}

	// check if given two strings has the same characters with different(or the same) order  
    public static boolean isAnagram (String str1, String str2) {
    	char[] ch1 = str1.toCharArray();
    	char[] ch2 = str2.toCharArray();
    	
    	Arrays.sort(ch1);
    	Arrays.sort(ch2);
    	
    	return Arrays.equals(ch1, ch2);
    }

    public static int frequency (String str, char ch) {
    	int count = 0;
    	
    	for (char each : str.toCharArray()) {
    		if(each == ch) {    			
    			count ++;
    		}
    	}
    	
    	return count;
    }

    public static String uniques (String str) {
    	String result = "";
    	
    	for(char each: removeDuplication(str).toCharArray() ) {
    		if(frequency(str, each) == 1) {
    			result += each;
    		}
    	}
    	
    	return result;
    }

    // aaabbc => a3b2c1
    public static String frequencyOfChars (String str) {
    	String result = "";
    	
    	for(char each: removeDuplication(str).toCharArray() ) {
    		result += each + "" + frequency(str,each);
    	}
    	
    	return result;
    }
}
