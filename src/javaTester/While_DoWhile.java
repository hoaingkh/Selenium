package javaTester;

import java.util.Locale;
import java.util.Scanner;

public class While_DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		==================== BT1 ======================

//		int n;
//		System.out.print("Nhap n = ");
//		n = scanner.nextInt();

//		for (int i = n; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//
//		}
	
//		while(n <= 100) {
//			if (n % 2 == 0) {
//				System.out.print(n + " ");
//			}
//			n++;
//		}
		

//		==================== BT2 ======================

//		int a;
//		System.out.print("Nhap a = ");
//		a = scanner.nextInt();
//
//		int b;
//		System.out.print("Nhap b = ");
//		b = scanner.nextInt();
//		int min;
//		int max;
//
//		if (a >= b) {
//			min = b;
//			max = a;
//		} else {
//			min = a;
//			max = b;
//		}
//
//		int i = min;
//		while (i <= max) {
//			if (i % 15 == 0) {
//				System.out.print(i + " ");
//			}
//			i++;
//
//		}
		
//		==================== BT3 ======================
		
//		int n;
//		System.out.print("Nhap n = ");
//		n = scanner.nextInt();
//		
//		int i = 0;
//		int sum = 0;
//		
//		do { 
//			if (i % 2 == 1) {
//				sum = sum + i;
//			}
//			i++;
//			
//		} while (i <= n);
//		
//		System.out.print("Sum = " +sum);
		
//		==================== BT4 ======================

//		int a;
//		System.out.print("Nhap a = ");
//		a = scanner.nextInt();
//
//		int b;
//		System.out.print("Nhap b = ");
//		b = scanner.nextInt();
//		int min;
//		int max;
//
//		if (a >= b) {
//			min = b;
//			max = a;
//		} else {
//			min = a;
//			max = b;
//		}
//		
//		int i = min;
//		
//		do {
//			if (i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//			i++;
//			
//		} while (i <= max);
		
//		==================== BT5 ======================
		
//		int n;
//		System.out.print("Nhap n = ");
//		n = scanner.nextInt();
//		
//		int i = 1;
//		int m = 1;
//		
//		do { 
//			m = m*i;
//			i++;
//		} while (i <= n);
//		System.out.print("n! = "+ m);
		
//		==================== BT6 ======================		
		int i = 1;
		int n = 10;
		int sum = 0;
		do {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
			
		} while (i <= n);
		System.out.print("sum = " +sum);
		
	}

}
