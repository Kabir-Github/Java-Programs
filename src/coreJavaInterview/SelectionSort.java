package coreJavaInterview;

public class SelectionSort {
	public static int[] doSelectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[index]) {
					index = j;
				}
			}
			int smallIndex = array[index];
			array[index] = array[i];
			array[i] = smallIndex;
			System.out.println("After----" + i + "-----Iteration");
			printArray(array);
		}
		return array;
	}

	public static void printArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ",");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] array = { 10, 2, 20, 12, 3 };
		System.out.println("Original Array:{10, 2, 20, 12, 3} \n");
		int[] result = doSelectionSort(array);
		System.out.println(result);

	}

}
