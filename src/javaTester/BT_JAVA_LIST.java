package javaTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BT_JAVA_LIST {
	
    public static int TinhTichChuSoLe(int n) {
    	int tich = 1;
		while (n > 0) {
			int du = n % 10;
			if (du % 2 == 1) {
				tich = tich * du;
			}

			n = n / 10;
		}
		return tich;
    }
    
	public static boolean KiemTraSoNguyenTo(int n) {
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				temp += 1;
			}

		}
		if (temp == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Integer> CacSoNguyenToNhoHonN(int n) {
		System.out.println("Cac so nguyen to nho hon n la: ");
		List<Integer> listInt = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			if (KiemTraSoNguyenTo(i) == true) {
				listInt.add(i);

			}
		}
		return listInt;

	}
	
	public static int DaoNguocSoN(int n) {
		int temp = 0;
		int reversed = 0;
		while(n > 0) {
			int digit = n % 10; 
			reversed = reversed*10 + digit;
			n = n/10;
			
		}
		return reversed;
 
	}

	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so n bang: ");
		int n = scanner.nextInt();

//==================== Tinh tong tu 1 toi n ====================
//		List<Integer> list = new ArrayList<>();
//		for (int i = 1; i <= n; i++) {
//			list.add(i);
//		}
//
//		System.out.println("Day so A la: " + list);
//
//		int temp1 = 0;
//		for (int i = 0; i < n; i++) {
//			temp1 = temp1 + list.get(i);
//		}
//		System.out.println("Tong cua day so A la: " + temp1);

//==================== Tinh tong day so tren o dang nghich dao 1/n ====================
//		double temp2 = 0;
//		for (int i = 0; i < n; i++) {
//			temp2 = temp2 + (1.0 / list.get(i));
//
//		}
//		System.out.println("Tong nghich dao cua day so A la: " + temp2);

//==================== Tính S(n)=1/2+1/4+...+1/2n .(n > 0) ====================
//		double temp3 = 0;
//		for (int i = 0; i < n; i++) {
//			temp3 += 1.0 / 2 * 1.0 / list.get(i);
//		}
//		System.out.println("Tong 1/2n cua day so A la: " + temp3);

//==================== Tính S(n)=1*2*3*...*n . (n >= 0) ====================
//		int temp4 = 1;
//		for (int i = 0; i < n; i++) {
//			temp4 = temp4 * list.get(i);
//		}
//		System.out.println("Tich cua day so A la: " + temp4);

//==================== Liệt kê tất cả các ước số của số nguyên dương n. ====================
//		System.out.println("Cac uoc so cua n la: ");
//		for (int i = 0; i < n; i++) {
//			if (n % list.get(i) == 0) {
//				System.out.println(" " + list.get(i));
//			}
//		}

//==================== Kiểm tra số nguyên dương n có phải là số nguyên tố hay không  ====================
//		System.out.println("==================");
//		int temp5 = 0;
//		for (int i = 0; i < n; i++) {
//			if (n % list.get(i) == 0) {
//				temp5 += 1;
//			}
//		}
//		if (temp5 == 2) {
//			System.out.println(n + " la so nguyen to");
//		} else {
//			System.out.println(n + " khong la so nguyen to");
//		}

//==================== Hãy tính tổng các chữ số chẵn của số nguyên dương n. ====================
//		int sum = 0;
//
//		while (n > 0) {
//			int du = n % 10;
//			if (du % 2 == 0) {
//				sum += du;
//			}
//
//			n = n / 10;
//		}
//		System.out.println("Tong cac chu so chan trong so n la: " + sum);

//==================== Hãy tính tích các chữ số lẻ của số nguyên dương n. ====================
//		System.out.println("Tich cac chu so le cua so nguyen duong n la: ");
//		int tichChuSoLe = TinhTichChuSoLe(n);
//		System.out.println(tichChuSoLe);

//==================== Liệt kê tất cả các số nguyên tố nhỏ hơn n . ====================
//		System.out.println("Cac so nguyen to nho hon n la: ");
//		int temp6 = 0;
//		for (int i = 0; i < n; i++) {
//			for (int j = 1; j <= list.get(i); j++) {
//				if (list.get(i) % j == 0) {
//					temp6 = temp6 + 1;
//				}
//				
//				}
//			if (temp6 == 2) {
//				System.out.println(" " + list.get(i));
//				
//				}
//
//			}
//
//		List<Integer> listSoNguyenTo = CacSoNguyenToNhoHonN(n);
//		System.out.println("Truoc khi sap xep: " + listSoNguyenTo);
//		Comparator<Integer> comparatorSNT = Collections.reverseOrder();
//		Collections.sort(listSoNguyenTo, comparatorSNT);
//		System.out.println("Sau khi sap xep: " + listSoNguyenTo);
		
		int SoDaoNguocN = DaoNguocSoN(n);
		System.out.print(SoDaoNguocN);
		}
	}


