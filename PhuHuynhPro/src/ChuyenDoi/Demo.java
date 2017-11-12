package ChuyenDoi;

import java.util.Scanner;

public class Demo {

	private static Scanner sc;

	public String convert(int dec, int b) {
		int binary[] = new int[40];
		int index = 0;
		while (dec > 0) {
			binary[index++] = dec % b;
			dec = dec / b;
		}
		String str = "";
		for (int i = index - 1; i >= 0; i--) {
			if (b == 16) {
				if (binary[i] == 10)
					str += "A";
				if (binary[i] == 11)
					str += "B";
				if (binary[i] == 12)
					str += "C";
				if (binary[i] == 13)
					str += "D";
				if (binary[i] == 14)
					str += "E";
				if (binary[i] == 15)
					str += "F";
			} else
				str += binary[i];
			System.out.print(binary[i]);
			System.out.print(str);
		}

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
		new Demo().convert(decimalNumber, b);

	}
}