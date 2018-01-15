package arrays;

public class ArrayMainClass {
	public static void main(String[] args) {
		int[] arr = {106, 26, 81, 5, 15};
		
		ArrayProcess ar = new ArrayProcess(arr);
		ar.sortIntegers();
		ar.printArray();
	}
}
