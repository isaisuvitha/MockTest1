package com.therinjuko;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int num1 = 0;
		int num2 = 1;
		System.out.println("Fibonacci series upto "+max);
		
		for(int i = 1; i<=max; ++i) {
			System.out.print(num1+" ");
			int next = num1 + num2;
			num1 = num2;
			num2 = next;
		}
	}

}
