package com.siang.HW01;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入工作時數");
		int time = scanner.nextInt();
		scanner.close();
		//int time = 77;
		int Salary;
		double SalaryD;
		if(time <= 60) {
			SalaryD = time * 150;
			Salary = (int)SalaryD;
			System.out.println(Salary);
		}
		else if(time > 60 && time <= 80) {
			SalaryD = (60*150) + (time-60)*150*1.25;
			Salary = (int)SalaryD;
			System.out.println(Salary);
			
		}
		else {
			SalaryD = (60*150) + 20*150*1.25 + (time-80)*150*1.5;
			Salary = (int)SalaryD;
			System.out.println(Salary);
		}
	}

}
