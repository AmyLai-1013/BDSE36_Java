package com.siang.HW01;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入a");
		double a = scanner.nextDouble();
		System.out.println("請輸入b");
		double b = scanner.nextDouble();
		System.out.println("請輸入c");
		double c = scanner.nextDouble();
		scanner.close();
		double judge = (b * b) - (4 * a * c);
		double root1,root2;
		if(judge > 0) {
			root1 = (-b + Math.sqrt(judge)) / (2 * a);
			root2 = (-b - Math.sqrt(judge)) / (2 * a);
			System.out.println("root1 = " + root1);
			System.out.println("root2 = " + root2);
		}
		else if(judge == 0)	{
			root1 = (-b + Math.sqrt(judge)) / (2 * a);
			System.out.println("root = " + root1);
		}
		else if(judge < 0)
			System.out.println("沒有實根");
		
		
		
		
	}

}
