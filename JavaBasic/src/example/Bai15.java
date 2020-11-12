package example;

import java.util.Scanner;

public class Bai15 {

	public static void main(String[] args) {
		String[] Mssv = new String [5];
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<5; i++) {
		System.out.println("Nhập mã số sinh viên thứ ["+i+"]");
		Mssv[i] = sc.nextLine();
		}
		for(int i=1; i<5; i++) {
		if(Mssv[i].matches("00YL\\d{4}")) {
			System.out.println("Nhập đúng mã sinh viên rồi");
		}else {
			System.out.println("Nhập sổ số kiên thiến miền bắc à ?");
		}
		}
	}

}
