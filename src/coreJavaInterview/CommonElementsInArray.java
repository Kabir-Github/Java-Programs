package coreJavaInterview;

public class CommonElementsInArray {

	public static void calculateCommonElements() {
		int[] arr1 = { 2, 3, 5, 10, 30 };
		int[] arr2 = { 5, 3, 6, 12 };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + ",");
				}
			}
		}
	}

	public static void main(String[] args) {
		calculateCommonElements();

	}

}
