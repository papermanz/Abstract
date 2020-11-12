package example;

import java.util.Scanner;

public class Bai12 {

	public static void main(String[] args) {
		int n;
		int []soNguyen;
		int Max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào n: ");
		n = sc.nextInt();
		soNguyen = new int [n];
		for(int i = 0; i< n; i++) {
			System.out.println("Nhập phần tử thứ ["+ i+ "]");
			soNguyen[i] = sc.nextInt();
			}
		for(int i = 0; i < n; i++) {
			if(soNguyen[i]>Max) {
				Max = soNguyen[i];
		}
			}
		System.out.println("Số lớn nhất trong mảng là: " + Max);
		}
	

}
