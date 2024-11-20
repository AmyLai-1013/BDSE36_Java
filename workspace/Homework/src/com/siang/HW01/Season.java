package com.siang.HW01;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		scanner.close();
		//int month = 15;
		switch(month) {
		case(1) : case(2) : case(3) :
			System.out.println("春");
			break;
		case(4) : case(5) : case(6) : 
			System.out.println("夏");
			break;
		case(7) : case(8) : case(9) : 
			System.out.println("秋");
			break;
		case(10) : case(11) : case(12) : 
			System.out.println("冬");
			break;
		default :
			System.out.println("輸入錯誤");
		}
		

	}

}
