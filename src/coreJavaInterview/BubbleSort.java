package coreJavaInterview;

public class BubbleSort {
	public static void doBubbleSort(int[]array) {
		int temp;
		for(int i=0; i<array.length;i++) {
			for(int j=i+1; j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println("After----"+i+"-----Iteration");
			printArray(array);
		}
	}
	public static void printArray(int[] input) {
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[]array= {10, 20, 2, 4, 12};
		doBubbleSort(array);

	}

}
