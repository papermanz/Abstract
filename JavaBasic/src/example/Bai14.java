package example;

import java.util.Scanner;

public class Bai14 {

	public static void main(String[] args) {
		int n;
		int []soNguyen;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập số n: ");
		n = sc.nextInt();
		soNguyen = new int [n];
		for(int i=0; i<n; i++) {
		System.out.println("Nhập giá trị ["+(i+1)+"]");
		soNguyen[i] = sc.nextInt();
		}
		System.out.println("Các phần tử vừa nhập là: ");
		for(int i=0;i<n; i++) {
			System.out.print(soNguyen[i]+" ");
		}
		System.out.println("\nCác phần tử sau khi đảo ngược là: ");
		for(int i=0; i<n/2;i++) {
			int temp = soNguyen[i];
			soNguyen[i] = soNguyen[n-1-i];
			soNguyen[n-1-i] = temp;
		}
		for(int i=0; i<n;i++) {
			System.out.print(soNguyen[i]+" ");
		}
		
	}

}
