package com.siang.HW02;

public class PerfectNumber {

	public static void main(String[] args) {
		int sum =0 ;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % i == 0) {
					sum += (j/i);
					//if(j/i==sum)
					System.out.println(sum);
				}
			}
		}
		
	}

}
