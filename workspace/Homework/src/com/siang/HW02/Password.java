package com.siang.HW02;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("請輸入密碼");
		int password0 = 12333;
		Scanner scanner = new Scanner(System.in);
		do {
			int password1 = scanner.nextInt();
			if (password1 == password0) {
				System.out.println("密碼輸入正確，歡迎使用本系統！");
				break;
			} 
			else if (password1 != password0 && i < 3) {
				System.out.println("再次輸入密碼");
			}
			else {
				System.out.println("密碼輸入超過三次！");
				break;
			} 
			i++;
		} while (i <= 3);
		scanner.close();
	}

}
