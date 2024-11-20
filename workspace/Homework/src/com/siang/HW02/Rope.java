package com.siang.HW02;

public class Rope {

	public static void main(String[] args) {
		int rope =3000,day = 1;
		while(rope>5) {
			rope = rope/2;
			day++;
		}
		System.out.println("需要"+day+"天");
	}

}
