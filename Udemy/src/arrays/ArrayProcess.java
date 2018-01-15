package arrays;

import java.util.Arrays;

public class ArrayProcess {
	int[] array;
	
	public ArrayProcess(int[] arr) {
		array = arr;
	}
	
	public void getIntegers() {
		
	}
	
	public void printArray() {
		for(int i : this.array) {
			System.out.print(i+" ");
		}
	}
	
	public void sortIntegers() {
		Arrays.sort(array);
		  for(int i=0; i<array.length/2;i++) {
			 int temp = array[i];
			 array[i] = array[array.length - i -1];
			 array[array.length-i-1] = temp;
		 } 
	}
}
