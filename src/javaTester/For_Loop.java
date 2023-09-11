package javaTester;

import java.util.Locale;
import java.util.Scanner;

public class For_Loop {
//	//can co void main thi ham moi chay

	public static void main(String[] args) {
//	======================== BT1 =========================	
//		int n;
		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("Nhap n la: ");
//		n = scanner.nextInt();
//		
//		for (int i = n; i >= 1; i--) {
//			System.out.print(i +" ");
//		}

//	======================== BT2 =========================
//		int a;
//		int b;
//
//		System.out.print("a = ");
//		a = scanner.nextInt();
//
//		System.out.print("b = ");
//		b = scanner.nextInt();
//
//		if (a <= b) {
//			for (int i = a; i <= b; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			for (int i = b; i <= a; i++) {
//				System.out.print(i + " ");
//			}
//
//		}
//	}

//======================== BT3.1 =========================
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.print("Sum = "+ sum);

//======================== BT3.2 =========================	
//		int sum = 0;
//		for (int i = 10; i <= 30; i++) {
//			if (i % 2 == 1) {
//				sum = sum + i;
//			}
//		}
//		System.out.print("Tong so le la: " + sum);

//======================== BT4 =========================
//		int a;
//		int b;
//		int sum = 0;
//
//		System.out.print("a = ");
//		a = scanner.nextInt();
//
//		System.out.print("b = ");
//		b = scanner.nextInt();
//
//		if (a <= b) {
//			for (int i = a; i <= b; i++) {
//				sum = sum + i;
//			}
//			System.out.print("Tong la: " + sum);
//		} else {
//			for (int i = b; i <= a; i++) {
//				sum = sum + i;
//			}
//			System.out.print("Tong la: " + sum);
//		}
		
//======================== BT5.1 =========================
//		int a;
//		int b;
//		
//
//		System.out.print("a = ");
//		a = scanner.nextInt();
//
//		System.out.print("b = ");
//		b = scanner.nextInt();
//
//		if (a <= b) {
//			for (int i = a; i <= b; i++) {
//				if (i % 3 == 0) {
//					System.out.print(i);
//				}
//			}
//		} else {
//			for (int i = b; i <= a; i++) {
//				if (i % 3 == 0) {
//					System.out.print(i);
//				}
//			}
//		}
		
//======================== BT5.2 =========================
//		int a;
//		int b;
//		int min;
//		int max;
//
//		System.out.print("a = ");
//		a = scanner.nextInt();
//
//		System.out.print("b = ");
//		b = scanner.nextInt();
//
//		if (a >= b) {
//			max = a;
//			min = b;
//		} else {
//			max = b;
//			min = a;
//		}
//		for (int i = min; i <= max; i++) {
//			if (i % 3 == 0) {
//				System.out.print(i +" ");
//			}
//		}
		
//======================== BT6 =========================	
//		int a;
//		int b;
//		int min;
//		int max;
//		
//		System.out.print("a = ");
//		a = scanner.nextInt();
//		
//		System.out.print("b = ");
//		b = scanner.nextInt();
//		
//		if (a >= b) {
//			max = a;
//			min = b;
//		} else {
//			max = b;
//			min = a;
//		}
//		
//		for (int i = min; i <= max; i++) {
//			if (i%3 == 0) {
//				System.out.print(i+ " ");
//			}
//		}
		
//======================== BT7 =========================
		int a;
		int pdt= 1;
		System.out.print("a = ");
		a = scanner.nextInt();
		
		for (int i = 1; i <= a; i++) {
			pdt = pdt*i;
		}
		System.out.print("a! = "+ pdt);
	}

}
