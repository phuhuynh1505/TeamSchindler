package ToanTu;

import java.util.Scanner;

public class MutilIf {

	public static void main(String[] args) {
		// Mutil IF
		double dMark;
		Scanner sc = new Scanner(System.in);
		dMark = sc.nextDouble();

		if (dMark < 5) {
			System.out.println("Kém");
		} else if (dMark >= 5 && dMark < 7) {
			System.out.println("Trung bình");
		} else if (dMark >= 7 && dMark < 9) {
			System.out.println("Khá");
		} else
			System.out.println("Giỏi");

		sc.close();
	}

}
