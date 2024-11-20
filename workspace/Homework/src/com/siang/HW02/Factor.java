package com.siang.HW02;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一個正整數");
		int n = scanner.nextInt();
		scanner.close();
		for(int i = 1; n >= i; i++) {
			if(n % i == 0) {
				System.out.print(n / i + "  ");
			}
		}

	}

}
