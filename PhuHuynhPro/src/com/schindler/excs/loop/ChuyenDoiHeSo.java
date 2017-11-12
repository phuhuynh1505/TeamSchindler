package com.schindler.excs.loop;

import java.util.Scanner;

public class ChuyenDoiHeSo {

	private static Scanner sc;

	public String convert(int dec, int b) {
		int var[] = new int[40];
		int index = 0;
		while (dec > 0) {
			var[index++] = dec % b;
			dec = dec / b;
		}
		String str = "";
		for (int i = index - 1; i >= 0; i--) {
			if (b == 16) {
				if (var[i] < 10)
					str += var[i];
				if (var[i] == 10)
					str += "A";
				if (var[i] == 11)
					str += "B";
				if (var[i] == 12)
					str += "C";
				if (var[i] == 13)
					str += "D";
				if (var[i] == 14)
					str += "E";
				if (var[i] == 15)
					str += "F";
			} else
				str += var[i];
		}
		System.out.print(str);
		return str;
	}

	public static void main(String[] args) {
		int decimalNumber;
		int b;
		sc = new Scanner(System.in);
		System.out.print("Nhập 1 số thập phân: ");
		decimalNumber = sc.nextInt();
		System.out.print("Nhập hệ số: ");
		b = sc.nextInt();
		System.out.print("Hệ " + b + " của " + decimalNumber + " là :");
		new ChuyenDoiHeSo().convert(decimalNumber, b);

	}
}
