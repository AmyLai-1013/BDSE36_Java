package com.siang.HW02;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scanner.nextInt();
		scanner.close();
		for (int i = 2; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}
			}
			if (prime)
				System.out.print(i + "  ");
		}

	}

}