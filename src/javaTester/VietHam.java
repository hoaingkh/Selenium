package javaTester;

import java.util.Locale;
import java.util.Scanner;

public class VietHam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		System.out.print("Nhap so a = ");
//		int a = scanner.nextInt();
//		System.out.print("Nhap so b = ");
//		int b = scanner.nextInt();

//		int x = TimUocChungLonNhat (a, b);
//		System.out.print("UCLN cua a va b la: " + x);

//		CacSoLeNhoHon100();

//		System.out.print("Nhap so a = ");
//		double a = scanner.nextDouble();
//		System.out.print("Nhap so b = ");
//		double b = scanner.nextDouble();
//		System.out.print("Nhap so c = ");
//		double c = scanner.nextDouble();
//		GiaiPTBac2(a, b, c);

//		System.out.print("Nhap 1 thang: ");
//		int thang = scanner.nextInt();
//		ThangThuocQuy (thang);

//		System.out.print("Nhap 1 thang: ");
//		int month = scanner.nextInt();
//		System.out.print("Nhap 1 nam: ");
//		int year = scanner.nextInt();		
//		ThangNam (month, year);

//		System.out.print("Nhap so duong n: ");
//		int n = scanner.nextInt();
//		UocSoChan(n);

//		System.out.print("Nhap so duong n: ");
//		int n = scanner.nextInt();
//		SoDaoNguoc(n);		

//		System.out.print("Nhap so duong n: ");
//		int n = scanner.nextInt();
//		TongCacChuSo(n);

//		System.out.print("Nhap so duong n: ");
//		int n = scanner.nextInt();
//		TichCacSoLe(n);

		System.out.print("Nhap ngay: ");
		int Ngay = scanner.nextInt();
		while (Ngay <= 0 || Ngay > 31) {
			System.out.print("Ngay khong hop le, vui long nhap lai");
			System.out.print("\n Nhap ngay: ");
			Ngay = scanner.nextInt();
		    
		}
		System.out.print("Nhap thang: ");
		int Thang = scanner.nextInt();
		while (Thang <= 0 || Thang > 12) {
			System.out.print("Thang khong hop le, vui long nhap lai");
			System.out.print("\n Nhap thang: ");
			Thang = scanner.nextInt();
		    
		}
		System.out.print("Nhap nam: ");
		int Nam = scanner.nextInt();
		while (Nam <= 0) {
			System.out.print("Nam khong hop le, vui long nhap lai");
			System.out.print("\n Nhap nam: ");
			Nam = scanner.nextInt();
		    
		}
		//Verify tich hop
		if (KiemTraNamNhuan(Nam) == 1 && Thang == 2) {
			if (Ngay >= 30) {
				while (Ngay <= 0 || Ngay >= 30) {
					System.out.print("Ngay khong hop le. Vui long nhap lai");
					Ngay = scanner.nextInt();

				}
			}
		} else if (KiemTraNamNhuan(Nam) == 0 && Thang == 2) {
			if (Ngay >= 29) {
				while (Ngay <= 0 || Ngay >= 29) {
					System.out.print("Ngay khong hop le. Vui long nhap lai");
					Ngay = scanner.nextInt();
				}
			}
		} else if (Thang == 4 || Thang == 6 || Thang == 9 || Thang == 11) {
			if (Ngay > 30) {
				while (Ngay <= 0 || Ngay > 30) {
					System.out.print("Ngay khong hop le. Vui long nhap lai");
					Ngay = scanner.nextInt();
				}
			}
		}
		
		TimNgayKeTiep(Ngay, Thang, Nam);

	}

//	==================== BT32 - Viet ham tim so uoc so chung lon nhat cua 2 so nguyen duong ======================	
	public static int TimUocChungLonNhat(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;

	}

//	==================== BT33 - Viết hàm in ra tất cả các số lẻ nhỏ hơn 100 trừ các số 3, 11, 95 ======================	
	public static void CacSoLeNhoHon100() {
		System.out.print("Cac so le nho hon 100 tru 3, 11, 95 la: ");
		for (int i = 1; i < 100; i += 2) {
			if (i != 3 && i != 11 && i != 95) {
				System.out.print(" " + i);

			}
		}
	}

//==================== BT34 - Viết hàm giải phương trình bậc 2 ======================	
	public static void GiaiPTBac2(double a, double b, double c) {
		if (a == 0) {
			if (b == 0) {
				System.out.print("Phuong trinh vo nghiem");
			} else {
				System.out.print("Phuong trinh co 1 nghiem x =  " + (-c / b));

			}
			return;
		}
		double delta = b * b - 4 * a * c;
		double x1;
		double x2;
		if (delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.print("Phuong trinh co 2 nghiem la: " + "x1 = " + x1 + "va x2 = " + x2);

		} else if (delta == 0) {
			x1 = -b / 2 * a;
			System.out.print("Phuong trinh co 1 nghiem la: " + x1);

		} else {
			System.out.print("Phuong trinh vo nghiem");
		}
	}

//==================== BT35 - Viết hàm nhập vào tháng của 1 năm. Cho biết tháng thuộc quý mấy trong năm ======================	
	public static void ThangThuocQuy(int thang) {
		if (thang == 1 || thang == 2 || thang == 3) {
			System.out.print("Thang " + thang + " thuoc quy 1");
		} else if (thang == 4 || thang == 5 || thang == 6) {
			System.out.print("Thang " + thang + " thuoc quy 2");
		} else if (thang == 7 || thang == 8 || thang == 9) {
			System.out.print("Thang " + thang + " thuoc quy 3");
		} else {
			System.out.print("Thang " + thang + " thuoc quy 4");

		}

	}

//==================== BT36 - Viết hàm nhập tháng, năm. Hãy cho biết tháng đó có bao nhiêu ngày ======================	
	public static void ThangNam(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.print("Thang " + month + " co 31 ngay");

		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.print("Thang " + month + " co 30 ngay");

		}
		if (month == 2 && year % 4 != 0) {
			System.out.print("Thang " + month + " co 28 ngay");
		}
		if (month == 2 && year % 4 == 0) {
			System.out.print("Thang " + month + " co 29 ngay");
		} else {
			System.out.print("Ngay thang khong hop le vui long nhap lai");
		}

	}

//========== BT37 - Viết chương trình nhập vào 1 ngày ( ngày, tháng, năm). Tìm ngày kế ngày vừa nhập (ngày, tháng, năm) ================
	public static int KiemTraNamNhuan(int nam) {
		if (nam % 4 == 0) {
			return 1;
		}
		return 0;
	}

	public static int TimSoNgayTrongThang(int Thang, int Nam) {
		int NgayTrongThang = 0;
		switch (Thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			NgayTrongThang = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			NgayTrongThang = 30;
			break;
		case 2:
			int Check = KiemTraNamNhuan(Nam);
			if (Check == 1) {
				NgayTrongThang = 29;
			} else {
				NgayTrongThang = 28;
			}

		}
		return NgayTrongThang;

	}

	public static void TimNgayKeTiep(int Ngay, int Thang, int Nam) {
		int NgaytrongThang = TimSoNgayTrongThang(Thang, Nam);
		if (Ngay < NgaytrongThang) {
			Ngay++;
		} else if (Thang < 12) {
			Ngay = 1;
			Thang++;
		} else {
			Ngay = Thang = 1;
			Nam++;

		}
		System.out.print("Ngay tiep theo la: ");
		System.out.print(Ngay);
		System.out.print(" " + Thang);
		System.out.print(" " + Nam);

	}

//========== BT39 - Viết hàm đếm số lượng “ước số chẵn” của số nguyên dương n ================
	public static void UocSoChan(int n) {
		System.out.print("So luong cac uoc so chan cua so nguyen duong n la: ");
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 == 0) {
				dem = dem + 1;
			}
		}
		System.out.print(" " + dem);
	}

//========== BT40 - Viết hàm tính tổng các chữ số của số nguyên dương n ================
	public static void TongCacChuSo(int n) {
		int sum = 0;
		while (n > 0) {
			int du = n % 10;
			sum = sum + du;
			n = n / 10;
		}
		System.out.print("Tong cac chu so cua n la: " + sum);
	}

//========== BT41 - Viết hàm tính tích các chữ số lẻ của số nguyên dương n ================
	public static void TichCacSoLe(int n) {
		int temp = 1;
		while (n > 0) {
			int du = n % 10;
			if (du % 2 != 0) {
				temp = temp * du;
			}
			n = n / 10;
		}
		System.out.print("Tich cac so le la: " + temp);
	}

//========== BT42 - Viết hàm tìm số đảo ngược của số nguyên dương n ================
	public static void SoDaoNguoc(int n) {
		int temp = 0;
		while (n > 0) {
			int du = n % 10;
			temp = temp * 10 + du;
			n = n / 10;

		}
		System.out.print("So dao nguoc la: " + temp);
	}
}
