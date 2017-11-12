package com.schindler.demo.whileloop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("Giá trị là " + (i + 10));
			i++;
		}
		System.out.println("Over!");
		sc.close();

	}

}
