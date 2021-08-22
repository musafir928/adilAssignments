package utilities;

public class ArrayUtilities {
	
	// maximum from int array
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for (int each : arr) {
			max = Math.max(each,max);
		}
		
		return max;
	}

	// maximum from double array
	public static double max(double[] arr) {
		double max = Double.MIN_VALUE;
		
		for (double each : arr) {
			max = Math.max(each,max);
		}
		
		return max;
	}
	
	// minimum from int array
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for (int each : arr) {
			min = Math.min(each,min);
		}
		
		return min;
	}
	
	// minimum from double array
	public static double min(double[] arr) {
		double min = Double.MAX_VALUE;
		
		for (double each : arr) {
			min = Math.min(each,min);
		}
		
		return min;
	}

	
	// merge two arrays
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = 0;
		
		for(int each : arr1) {
			arr[i++] = each;
		}
		
		for(int each : arr2) {
			arr[i++] = each;
		}
		return arr;
	}
	
	public static double[] merge(double[] arr1, double[] arr2) {
		double[] arr = new double[arr1.length + arr2.length];
		int i = 0;
		
		for(double each : arr1) {
			arr[i++] = each;
		}
		
		for(double each : arr2) {
			arr[i++] = each;
		}
		return arr;
	}
	
	public static char[] merge(char[] arr1, char[] arr2) {
		char[] arr = new char[arr1.length + arr2.length];
		int i = 0;
		
		for(char each : arr1) {
			arr[i++] = each;
		}
		
		for(char each : arr2) {
			arr[i++] = each;
		}
		return arr;
	}
	
	public static String[] merge(String[] arr1, String[] arr2) {
		String[] arr = new String[arr1.length + arr2.length];
		int i = 0;
		
		for(String each : arr1) {
			arr[i++] = each;
		}
		
		for(String each : arr2) {
			arr[i++] = each;
		}
		return arr;
	}

    // reverse different type of arrays
	public static int[] reverse (int[] arr) {
		int l = arr.length;
		int[] result = new int[l];
		
		for(int i=0; i<l; i++) {
			result[i] = arr[l-1-i];
		}
		
		return result;
	}
	
	public static double[] reverse (double[] arr) {
		int l = arr.length;
		double[] result = new double[l];
		
		for(int i=0; i<l; i++) {
			result[i] = arr[l-1-i];
		}
		
		return result;
	}
	
	public static char[] reverse (char[] arr) {
		int l = arr.length;
		char[] result = new char[l];
		
		for(int i=0; i<l; i++) {
			result[i] = arr[l-1-i];
		}
		
		return result;
	}
	
	public static String[] reverse (String[] arr) {
		int l = arr.length;
		String[] result = new String[l];
		
		for(int i=0; i<l; i++) {
			result[i] = arr[l-1-i];
		}
		
		return result;
	}
}
