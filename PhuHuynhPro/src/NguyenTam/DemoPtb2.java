package NguyenTam;

import java.util.Scanner;

public class DemoPtb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Giai ptb2 Ax + Bx + C = 0");
		System.out.println("Nhap vao a \n ");
		int a = sc.nextInt();
		System.out.println("Nhap vao b \n");
		int b = sc.nextInt();
		System.out.println("Nhap vao c \n ");
		int c = sc.nextInt();
		float delta = b * b - 4 * a * c;
		if (delta > 0) {
			System.out.println("pt co 2 nghiem ");
			System.out.println(
					"x1 = " + ((-b - Math.sqrt(delta)) / (2 * a) + " x2 = " + ((-b + Math.sqrt(delta)) / (2 * a))));

		} else {
			if (delta == 0) {
				System.out.println("pt co 1 nghiem ");
				System.out.println("x = " + -b / 2 * a);
			} else {
				System.out.println("pt vo nghiem ");
			}

		}

	}

}
