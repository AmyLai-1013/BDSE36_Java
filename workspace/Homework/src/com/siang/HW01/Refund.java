package com.siang.HW01;

import java.util.Scanner;

public class Refund {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入應付金額");
		int  price = scanner.nextInt();
		System.out.println("請輸入實付金額");
		int  pay = scanner.nextInt();
		scanner.close();
		if(price < 0 || pay < 0)
			System.out.println("輸入錯誤");
		else if(pay < price) 
			System.out.println("金額不足");
		else if(pay == price)
			System.out.println("不必找錢");
		else if(pay > price) {
			int money = pay - price;
			int thousand = money/1000;
			money = money - thousand * 1000;
			int fivehundred = money / 500;
			money = money - fivehundred * 500;
			int hundred = money / 100;
			money = money - hundred * 100;
			int fifity = money / 50;
			money = money - fifity * 50;
			int ten = money / 10;
			money = money - ten * 10;
			int five = money / 5;
			money = money - five * 5;
			int one = money;
			System.out.print("找回");
			if (thousand != 0)
				System.out.print("1000元" + thousand + "張 ");
			if (fivehundred != 0)
				System.out.print("500元" + fivehundred + "張 ");
			if (hundred != 0)
				System.out.print("100元" + hundred + "張 ");
			if (fifity != 0)
				System.out.print("50元" + fifity + "個 ");
			if (ten != 0)
				System.out.print("10元" + ten + "個 ");
			if (five != 0)
				System.out.print("5元" + five + "個 ");
			if (one != 0)
				System.out.print("1元" + one + "個 ");
			
		}
	}

}