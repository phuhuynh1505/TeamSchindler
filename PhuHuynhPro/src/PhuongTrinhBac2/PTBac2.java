package PhuongTrinhBac2;

import java.util.Scanner;

public class PTBac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, x, x1, x2;
		double delta;
		System.out.print("Nhập a: ");
		a = sc.nextDouble();
		System.out.print("Nhập b: ");
		b = sc.nextDouble();
		System.out.print("Nhập c: ");
		c = sc.nextDouble();
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else {
					System.out.println("Phương trình vô nghiệm");
				}
			} else {
				x = -c / b;
				System.out.println("Phương trình có nghiệm: " + x);
			}
		} else {
			delta = (b * b) - (4 * a * c);

			if (delta < 0) {
				System.out.print("Phương trình vô nghiệm");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.print("Phương trình có nghiệm duy nhất: x = " + x);
			} else {

				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}

		}
	}
}
