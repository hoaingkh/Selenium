package javaTester;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BT_JAVA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		==================== BT1 - S(n)=1+2+3+...+n . (n >= 0) ======================
//		int n;
//		int sum = 0;
//		System.out.print("Nhap n: ");
//		n = scanner.nextInt();
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//
//		}
//		System.out.print("Sum la: " + sum);
		
//		==================== BT2 - S(n)=1+1/2+1/3+...+1/n ======================
//		int n;
//		float reversed = 0;
//		System.out.print("Nhap n = ");
//		n = scanner.nextInt();
//		for (int i = 1; i <= n; i++) {
//			reversed += 1.0/i;
//		}
//		System.out.print("Tong la: " + reversed);
		
//		==================== BT3 - S(n)=1/2+1/4+...+1/2n ======================		
//		int n;
//		float reversed = 0;
//		System.out.print("Nhap n = ");
//		n = scanner.nextInt();
//		for (int i = 1; i <= n; i++) {
//			reversed += 1.0 / 2 * 1.0 / i;
//		}
//		System.out.print("Tong la: " + reversed);
		
//		==================== BT4 - S(n)=1*2*3*...*n ======================		
//		int n;
//		int product = 1;
//		System.out.print("Nhap n = ");
//		n = scanner.nextInt();
//		for(int i = 1; i <= n; i++) {
//			product = product*i;
//		}
//		System.out.print("Tich cac so la: " + product);
		
//		==================== BT5 - Liệt kê tất cả các ước số của số nguyên dương n ======================			
//		int n;
//		System.out.print("Nhap n: ");
//		n = scanner.nextInt();
//		System.out.print("Cac uoc so nguyen duong cua n la: ");
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.print(" " + i);
//			}
//
//		}
		
		ArrayList<Integer> numberList = new ArrayList<>();
		for(int i = 0; i <= 5; i++) {
			System.out.print("Nhap phan tu:");
			int num = scanner.nextInt();
			numberList.add(num);
			
		}
		int n = TimSoChanDauTien(numberList);
		System.out.print("Gia tri chan dau tien la: " + n);
		
		System.out.println("Cac gia tri chan cua day la: ");
		for(int m = 0; m < numberList.size(); m++) {
			if(numberList.get(m) % 2 == 0) {
				System.out.print(numberList.get(m) + " ");
			}
		}
		
       

	}
	
	public static int TimSoChanDauTien(ArrayList<Integer> numList) {
		for(int i = 0; i < numList.size(); i++) {
			if(numList.get(i) % 2 == 0) {
				return numList.get(i);
			}
			
		}
		return -1;
	}
}
