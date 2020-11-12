package example;

import java.util.Scanner;

/*
 * tìm số fibonaci 
 */
class Fibonaci{
		public int CaculateFibonaci(int n) {
			if(n == 0 ||n == 1) {
				return 1;
			}
			return CaculateFibonaci(n-2) + CaculateFibonaci(n-1);			
		}
}

public class Bai9 {
	public static void main(String[] args) {
		int n;
		int Fi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số n: ");
		n = sc.nextInt();
		Fibonaci fibonaci = new Fibonaci();
		Fi = fibonaci.CaculateFibonaci(n);
		System.out.println("số Fi của "+n+" = "+Fi);
		
		

	}

}
