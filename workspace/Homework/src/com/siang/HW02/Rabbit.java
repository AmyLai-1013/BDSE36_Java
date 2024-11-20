package com.siang.HW02;

public class Rabbit {

	public static void main(String[] args) {
		int rabbit = 1;
		while (rabbit > 0) {
			if (rabbit % 3 == 1 && rabbit % 5 == 1 && rabbit % 7 == 2) {
				System.out.println("兔子最少有" + rabbit + "隻");
				break;
			}
			rabbit++;
		}

	}

}
