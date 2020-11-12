package example;

import java.util.Scanner;

public class Bai13 {

	public static void main(String[] args) {
		int n;
		int []soNguyen;
		int Min = 0;

		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập giá trị n: ");
		n = sc.nextInt();
		soNguyen = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ ["+(i+1)+"]");
			soNguyen[i] = sc.nextInt();
		}
		Min = soNguyen[0];
		for(int i =0; i<n; i++) {
			if(soNguyen[i] < Min ) {
				Min = soNguyen[i];
			}
		}
			System.out.println("số bé nhất trong mảng "+Min);
	}
		

}
