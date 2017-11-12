package com.schindler.excs.loop;

import java.util.Scanner;

public class UocChung {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = sc.nextInt();
		System.out.print("Nhập b: ");
		int b = sc.nextInt();
		System.out.println("Ước chung lớn nhất của a và b là: " + UCLN(a, b));
		sc.close();

	}

	static int UCLN(int a, int b) {
		int r;
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		while (b == 0)
			break;
		return a;
	}

}