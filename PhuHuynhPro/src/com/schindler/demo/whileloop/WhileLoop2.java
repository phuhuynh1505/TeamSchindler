package com.schindler.demo.whileloop;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalValue = 0;
		int i = 0;
		System.out.print("Nhập n: ");
		int n = sc.nextInt();

		while (i < n) {
			totalValue += i;
			++i;
		}

		System.out.println("Giá trị: " + totalValue);
		sc.close();

	}

}
