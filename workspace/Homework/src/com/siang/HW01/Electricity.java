package com.siang.HW01;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入何種用電？");
		String name = scanner.next();
		System.out.println("請輸入度數？");
		int degree = scanner.nextInt();
		scanner.close();
		double degreed = 0.0;
		if(name.equals("非營業用電")) {
			if(degree <= 120) {
				degreed = degree * 1.63;
				degree =  (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 120 && degree <= 330) {
				degreed = 120 * 1.63 + (degree - 120) * 2.10;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 330 && degree <= 500) {
				degreed = 120 * 1.63 +  210 * 2.10 + (degree - 330) * 2.89;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 500 && degree <= 700) {
				degreed = 120 * 1.63 +  210 * 2.10 + 170 * 2.89 + (degree - 500) * 3.94;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 700 && degree <= 1000) {
				degreed = 120 * 1.63 +  210 * 2.10 + 170 * 2.89 + 200 * 3.94 + (degree - 700) * 4.60;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 1000) {
				degreed = 120 * 1.63 +  210 * 2.10 + 170 * 2.89 + 200 * 3.94 + 300 * 4.60 + (degree - 1000) * 5.03;
				degree = (int) degreed;
				System.out.println(degree);
			}
		}
		else if(name.equals("營業用電")) {
			if(degree <= 330) {
				degreed = degree * 2.12;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 330 && degree <= 700) {
				degreed = 330 * 2.12 + (degree - 330) * 2.91;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 700 && degree <= 1500) {
				degreed = 330 * 2.12 + 370 * 2.91 + (degree - 700) * 3.44;
				degree = (int) degreed;
				System.out.println(degree);
			}
			else if(degree > 1500) {
				degreed = 330 * 2.12 + 370 * 2.91 + 800 * 3.44 + (degree - 1500) * 5.50;
				degree = (int) degreed;
				System.out.println(degree);
			}
		}
		
	}

}
