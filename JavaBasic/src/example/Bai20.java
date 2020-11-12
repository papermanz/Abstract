package example;

import java.util.Scanner;
/*
 * Viết chương trình cho phép người dùng nhập vào 1 chuỗi, kiểm tra chuỗi này có phù hợp với yêu cầu hay không.
 *	Nếu có thì in ra “Duyệt!”, ngược lại in ra “Không duyệt”.
 *	Yêu cầu về chuỗi là: Có độ dài không quá 20 ký tự, không được chứa ký tự khoảng trắng, 
 *	bắt đầu bằng một ký tự chữ viết hoa (A - Z), kết thúc bằng một số (0 - 9).
 */

public class Bai20 {

	public static void main(String[] args) {
		String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		n = sc.nextLine();
		if(n.matches("^[A-Z][^\\s]{0,18}\\d$")) {
			System.out.println("Chuẩn cmnr");
		}else {
			System.out.println("Sai rồi, Nhập sai là do bạn không chơi đồ đó bạn ạ");
		}

	}

}
