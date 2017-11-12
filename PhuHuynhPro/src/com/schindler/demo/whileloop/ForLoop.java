package com.schindler.demo.whileloop;

public class ForLoop {

	public static void main(String[] args) {
		System.out.println("                Bảng Cửu Chương");
		System.out.print("    ");
		for (int i = 1; i <= 9; i++) {
			System.out.print("  " + i);
		}
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + " | ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

	}

}
