package ChuyenDoi;

import java.util.Scanner;

public class Demo {

	private static Scanner sc;

	public void convert(int dec) {
		int binary[] = new int[40];
		int index = 0;
		while (dec > 0) {
			binary[index++] = dec % 2;
			dec = dec / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	public static void main(String[] args) {
		int decimalNumber;
		sc = new Scanner(System.in);
		System.out.println("Nhập 1 số thập phân: ");
		decimalNumber = sc.nextInt();
		System.out.print("Hệ nhị phân của " + decimalNumber + " là :");
		new Demo().convert(decimalNumber);
	}
}