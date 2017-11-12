package com.schindler.excs.loop;

import java.util.Scanner;

public class KiemTraChuoi {

	public static boolean soSanhKyTuTrongChuoi(String a) {
		int b = a.length();
		String c = "";
		String d = "";
		boolean e = false;
		for (int i = 0; i < b / 2; i++) {
			c = a.substring(b - 1 - i, b - i);
			d = a.substring(0 + i, 1 + i);
			e = c.equals(d);
			if (e == false) {
				System.out.println("False");
				break;
			}

		}
		if (e == true)
			System.out.println("True");
		return e;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một chuỗi: ");
		String a = sc.next();
		soSanhKyTuTrongChuoi(a);
		sc.close();
	}

}
