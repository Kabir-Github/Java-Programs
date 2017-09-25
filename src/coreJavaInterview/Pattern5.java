package coreJavaInterview;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input:");
		int number = scanner.nextInt();
		for (int i = 1; i <=number; i++) {
			for (int j = number; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
