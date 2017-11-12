package com.schindler.excs.loop;

import java.util.Scanner;

public class ThapHinhSao {

	public static String hinhSao(int h) {
		String b = "                                                                    ";
		int index = 1;
		String a = "";
		String str = "";
		int i = h;
		System.out.println();
		while (index <= h) {
			a = b.substring(0, i);
			System.out.print(a);
			str += " *";
			System.out.println(str);
			index++;
			--i;
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều cao h: ");
		int h = sc.nextInt();
		hinhSao(h);
		sc.close();

	}

}
