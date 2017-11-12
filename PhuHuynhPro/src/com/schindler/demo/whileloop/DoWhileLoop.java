package com.schindler.demo.whileloop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		String strUserName = "";
		String strPassWord = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập UserName: ");
			strUserName = sc.nextLine();
		} while (strUserName.isEmpty());
		do {
			System.out.println("Nhập PassWord: ");
			strPassWord = sc.nextLine();
		} while (strPassWord.isEmpty());
		if (strUserName.equals("asdfgh") && strPassWord.equals("abcxyz")) {
			System.out.println("OK!");
		} else {
			System.out.println("Wrong!");
		}

	}

}
