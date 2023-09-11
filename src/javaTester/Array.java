package javaTester;

import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//	==================== BT1 ======================
//		int a[] = { 1, -2, 4, 6, -8 };
//		int max = a[0];
//		for (int i = 0; i < a.length; i++) {
//			if (max < a[i]) {
//				max = a[i];
//			}
//
//		}
//		System.out.print("so lon nhat la: " + max);

//	==================== BT2 ======================
//		int a[] = { 1, -2, 4, 6, -8 };
//		int n = a.length;
//		int sum = a[0] + a[n - 1];
//		System.out.print("Tong so dau va so cuoi la: " + sum);

//	==================== BT3 ======================
//		int a[] = { 1, -2, 3, 6, -8 };
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.println("Cac so chan la: " + a[i]);
//			}
//
//		}

//	==================== BT4 ======================
//		int sum = 0;
//		int a[] = { 1, 2, 6, 8, 9, 11, -2, -5 };
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0 && a[i] > 0) {
//				sum = sum + a[i];
//			}
//		}
//		System.out.print("Tong cac so le > 0 la: " + sum);
//

//	==================== BT5 ======================		
//		int a[] = { 1, 2, 6, 8, 9, 11, -2, -5 };
//		System.out.print("Cac so >= 0 va <10 la: ");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] >= 0 && a[i] <= 10) {
//				System.out.print(" " + a[i]);
//			}
//		}

//	
//	==================== BT6 ======================	
//		int sum = 0;
//		int a[] = { 3, 5, 7, 30, 10, 5, 8, 23, 0, -5 };
//		float length = a.length;
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//
//		}
//		System.out.println("Tong cua day so la: " + sum);
//
//		float TBC = sum / length;
//		System.out.print("TBC cua day so la: " + TBC);
		
		
//		==================== BT12 - Ham nhap/xuat mang ======================
//		double a[] = new double[100];
//		int n = 5;
//		InputArray(a, n);
		
		int a[] = new int[100];
		int n = 5;
		InputArray1(a, n);

//		PrintArray(a, n);
//		
//		System.out.println();	
		
//		NegativePos(a, n);
//		
//		System.out.println();
//		
//		EvenNumber(a, n);
//		
//		System.out.println();
//
//		
//		double SoChanDauTien = TheFirstEven (a, n);
//		
//		System.out.println("So chan dau tien la: " + SoChanDauTien);
//		
//		NegativeNumber(a, n);
		
//		double SoChanCuoiCung = TheLastEven (a, n);
//		System.out.print("So chan cuoi cung la: " + SoChanCuoiCung);
//		
//		int index = MinPositive(a, n);
//		
//		System.out.println("Vi tri So duong nho nhat la: " + index + " Gia tri nho nhat cua no la: " + a[index]);
		
//		boolean Prime = TimSoNguyenTo (5);
//		System.out.print(Prime);
		
//		ViTriSoNguyenTo(a, n);
		
//		SapXepGiaTriTangDan (a, n);
//		System.out.print("Mang sau khi sap xep la: ");
//		PrintArray(a, n);
		
//		double Tong = TinhTong (a, n);
//		System.out.print("Tong cua day so la: " + Tong);

//		double TBCSoNguyenTo = TBCSoNT (a, n);
//		System.out.print("TBC cac so nguyen to la: " + TBCSoNguyenTo);
		
//		System.out.print("Nhap vao gia tri x = ");
//		double x = scanner.nextDouble();
//		double TBC = TBC (a,n, x);
//		System.out.print("TBC cac so lon hon x la: " + TBC);
		
//      double SoNhoNhat = Min(a, n);
//      System.out.print("gia tri nho nhat la: "+ SoNhoNhat);
		
//		dauledautien (a, n);
		
//		SoToanChuSoLe(a, n);
		
//		SapXepDuongTangAmGiam (a, n);
//		System.out.println("Mang moi sau khi noi la: ");
//		PrintArray(a, n);
		
//		dauledautien (a,n);
		
//		SoToanChuSoLe (a, n);
		
		int Tong = TongSoCoChuSoLeDauTien (a, n);	
		System.out.print(Tong);

	}
	
	
//	==================== BT12 - Nhap/xuat 1 chieu cac so thuc ======================	
	
	public static void InputArray(double a[], int n) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vao phan tu thu " + i + ": ");
			a[i] = scanner.nextDouble();
		}
	}

	
	public static void PrintArray(double a[], int n) {
//		System.out.print("Cac so thuoc day tren la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
		
		

//	==================== BT13 - Ham liet ke cac vi tri ma gia tri tai do la am ======================

	public static void NegativePos(double a[], int n) {
		System.out.print("Cac so am co vi tri la: ");
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				System.out.print(i + " ");

			}
		}
	}


		
//		==================== BT15 - Ham liet ke cac gia tri chan ======================	
	public static void EvenNumber(double a[], int n) {
		System.out.print("Cac so chan la: ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
//	========== BT16 - Viết hàm liệt kê các giá trị lẻ trong mảng một chiều các số nguyên =========	
	public static void OddNumber(double a[], int n) {
		System.out.print("Cac so chan la: ");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
		
//	==================== BT17 - Ham tim so chan dau tien ======================	
	public static double TheFirstEven(double a[], int n) {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
			
		}
		return -1;

	}
	
	
	
//	==================== BT18 - Ham liet ke cac gia tri am ======================	
	public static void NegativeNumber(double a[], int n) {
		System.out.print("Cac so am la: ");
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				System.out.print(a[i] + " ");
			}
		}
	}
	
//	==================== BT20 - Tim gia tri nho nhat ======================	
	public static double Min(double a[], int n) {
		double min = a[0];
		for (int i = 1; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
				
			}

		}
		return min;

	}

	
//	==================== BT21 - Ham tim so chan cuoi cung ======================	
	public static double TheLastEven(double a[], int n) {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
		}
		return -1;
	}
	
	
//	==================== BT22 - Gia tri duong nho nhat va vi tri cua no ======================
	public static int MinPositive(double a[], int n) {
		double min = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				min = a[i];
				break;
			}

		}
		for (int i = 0; i < n; i++) {
			if (a[i] > 0 && a[i] < min) {
				min = a[i];
				index = i;
                
			}

		}
		return index;

	}
			

//==================== BT23 - Sap xep thu tu cac so trong mang tang dan ======================
public static void SapXepGiaTriTangDan(double a[], int n) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (a[i] > a[j]) {
				double temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}
		}
	}
}

//==================== BT23.1 - Sap xep thu tu cac so trong mang giam dan ======================
public static void GiaTriGiamDan(double a[], int n) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (a[i] < a[j]) {
				double temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}

}

//==================== BT24 - Sap xep cac so duong tang dan, cac so am giam dan ======================
public static void SapXepDuongTangAmGiam(double a[], int n) {
//Tach mang	
	double Pos[] = new double[100];
	double Nega[] = new double[100];
	int indexPos = 0;
	int indexNega = 0;

	for (int i = 0; i < n; i++) {
		if (a[i] > 0) {
            Pos[indexPos] = a[i];
			indexPos++;
		} else {

			Nega[indexNega] = a[i];
			indexNega++;

		}

	}
	System.out.print("\n Mang positive la: ");
	PrintArray(Pos, indexPos);
	
	System.out.print("\n Mang negative la: ");
	PrintArray(Nega, indexNega);
	
//Sap xep tung mang
	System.out.print("\n Mang positive tang dan la: ");

		SapXepGiaTriTangDan (Pos, indexPos);
		PrintArray(Pos, indexPos);
		

		System.out.print("\n Mang negative giam dan la: ");
		GiaTriGiamDan (Nega, indexNega);
		PrintArray(Nega, indexNega);


//Noi mang duong
		int indexP = 0;
	for (int i = 0; i < indexPos; i++) {
	    a[indexP] = Pos[i];
	    indexP++;
}
		
	for (int i = 0; i < indexNega; i++) {
		 a[indexP] = Nega[i];
		indexP++;
	}
	
	
}







		


//==================== BT25 - Kiem tra so nguyen to ======================
public static boolean TimSoNguyenTo (double a) {
int dem = 0;
for (int i = 1; i <= a; i++ ) {
	if (a%i == 0) {
		dem = dem + 1;
	}
}
if (dem == 2) {
	return true;
}
return false;
}

//==================== BT25.1 - Vi tri la so nguyen to trong mang ======================
public static void ViTriSoNguyenTo(double a[], int n) {
	int count = 0;
	for (int i = 0; i < n; i++) {
		boolean KTraSoNT = TimSoNguyenTo(a[i]);
		if (KTraSoNT == true) {
			System.out.print("\n Vi tri so nguyen to la: " + i);
		}

	}

}

//==================== BT26 - số nguyên có chữ số đầu tiên là chữ số lẻ ======================
public static void InputArray1(int a[], int n) {
	Scanner scanner = new Scanner(System.in);
	for (int i = 0; i < n; i++) {
		System.out.print("Nhap vao phan tu thu " + i + ": ");
		a[i] = scanner.nextInt();
	}
}
public static int chusodaule(int a) {
	while (a >= 10) {
		a = a / 10;
	
	}
	if (a % 2 == 0)
		return 0;
	return 1;
}

public static void dauledautien(int a[], int n) {
	System.out.print("Cac so co chu so dau tien la le la: ");
	for (int i = 0; i < n; i++) {
		if (chusodaule(a[i]) == 1) {
			System.out.print(" " + a[i]);

		}
	}
}
	       
//==================== BT27 -  các giá trị có toàn chữ số lẻ ======================
public static int ToanChuSoLe(int a) {
	int du;
	while (a != 0) {
		du = a % 10;
		a = a / 10;
		if (du % 2 == 0) {
			return 0;
		}

	}
	return 1;

}

public static void SoToanChuSoLe (int a[], int n) {
	System.out.print("So co cac chu so le la: ");
	for (int i = 0; i < n; i++) {
    if (ToanChuSoLe(a[i]) == 1) {
    	System.out.print(" " + a[i]);
    	}
    }
}


//==================== BT28 - Tinh tong cac phan tu ======================
public static double TinhTong(double a[], int n) {
	double sum = 0;
	for (int i = 0; i < n; i++) {
		sum = sum + a[i];
	}
	return sum;
}

//==================== BT29 -  tinh tong cac gia tri ma co chu so dau tien la so le ======================
public static int TongSoCoChuSoLeDauTien (int a[], int n) {
	int sum = 0;
	System.out.print("Tong cac so co chu so le dau tien la: ");
	for (int i = 0; i < n; i++) {
		if (chusodaule(a[i]) == 1) {
			sum = sum + a[i];
		}
		
	}
	return sum;
}


//==================== BT30 - Tinh TBC cac so nguyen to trong mang ======================
public static double TBCSoNT(double a[], int n) {
	double Tong = 0;
	int count = 0;
	for (int i = 0; i < n; i++) {
		boolean KTraSoNT = TimSoNguyenTo(a[i]);
		if (KTraSoNT == true) {
			Tong = Tong + a[i];
			count = count + 1;
			}
		
		}
	return Tong/count;
	
	
}

//==================== BT31 - Tinh TBC cac gia tri lon hon x ======================
public static double TBC(double a[], int n, double x) {
	double Tong = 0;
	int count = 0;
	for (int i = 0; i < n; i++) {
		if (x < a[i]) {
			Tong = Tong + a[i];
			count = count + 1;
			
			
		}
		
		
	}
	return Tong/count;
	
}

}


		



