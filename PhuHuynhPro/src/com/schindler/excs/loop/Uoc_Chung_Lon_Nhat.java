package com.schindler.excs.loop;

import java.util.Scanner;

public class Uoc_Chung_Lon_Nhat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = sc.nextInt();
		System.out.print("Nhập b: ");
		int b = sc.nextInt();
		int n = 0;
		if (a < b) {
			for (int i = 1; i < a; i++) {
				if (a % i == 0) {
					n = i;
				}
			}
		} else {
			for (int i = 1; i < b; i++) {
				if (b % i == 0) {
					n = i;
				}
			}
		}
		System.out.println("Ước Chung Lớn Nhất của (a,b) là: " + n);
		sc.close();

	}

}
