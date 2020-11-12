package example;

import java.util.Scanner;
import java.util.StringTokenizer;
/*
 * Kiểm tra có kí tự cần tìm trong chuỗi hay không và xuất hiện bao nhiêu lần.
 */

public class Bai19 {

	public static void main(String[] args) {
		String n;
		char a;
		int dem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		n = sc.nextLine();
		System.out.println("Nhập vào kí tự cần tìm:");
		a = sc.nextLine().charAt(0);
		if(n.contains(a+"")==true) {
			System.out.println("Trong chuỗi có kí tự "+a+" đấy mọi người ạ");
		}
		char Mangkitu[]= n.toCharArray();
		for(int i =0; i<Mangkitu.length;i++) {
			
			if(a == Mangkitu[i]) {
				dem++;
			}
		}
		System.out.println("Kí tự "+a+" xuất hiện trong chuỗi "+dem+" lần.");
		
		
	}

}
