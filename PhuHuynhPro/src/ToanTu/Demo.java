package ToanTu;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		/*
		 * int a = 1; String Name = "B"; System.out.println(++a); // Cộng trước làm
		 * sau System.out.println(a++); // Làm xong rồi cộng System.out.println(a);
		 * System.out.println(Name.concat(" C")); // Cộng chuỗi
		 */

		// Tính tổng 2 số
		/*
		 * int b, c; Scanner sc = new Scanner(System.in); // Cú pháp khai báo Scanner
		 * System.out.println("Nhập b: "); b = sc.nextInt();
		 * System.out.println("Nhập c: "); c = sc.nextInt();
		 * System.out.println("Tính tổng b+c: " + tinhTong(a, b)); // Return giá trị
		 * hàm
		 */

		/*
		 * // Hiện thì tên bằng cách gọi hàm Scanner sc = new Scanner(System.in);
		 * System.out.println("Nhập tên: "); String sName = sc.nextLine();
		 * displayInfor(sName);
		 */

		// Cấu trúc If - else
		Scanner sc = new Scanner(System.in);
		if (1 == 1) {
			System.out.println("sai");
		}
		System.out.println("đúng");
		sc.close();

	}

	public static int tinhTong(int a, int b) {
		return a + b;

	}

	static void displayInfor(String sName) {
		System.out.println("Tên là: " + sName);
	}

}
/*
 * Hàm có trả ra kết quả => có 1 kết quả trả về Cú pháp: - Tổng
 * quát: <Kiểu dữ liệu trả về> <Tên Hàm>(parameters - optionals){ code
 * here return <value> }
 */

/*
 * Hàm không trả ra kết quả Cú pháp: void displayInfor(String strName){ }
 */
