package javaTester;

import java.util.Locale;
import java.util.Scanner;

public class Variable {
//	//can co void main thi ham moi chay
	
	public static void main(String[] args) {
//	======================== BT1 =========================	
		Scanner scan3 = new Scanner(System.in);
		System.out.println("So thuc la: ");
		 scan3.useLocale(Locale.ENGLISH);
		 System.out.println("" + scan3.locale());
		float inputData = scan3.nextFloat();
		System.out.print("So thuc vua nhap la:"+ inputData);
		
//		======================== BT2 =========================	
//		Scanner scan1 = new Scanner(System.in);
//		System.out.print("Nhap 1 so:  ");
//		//Scan qua input
//		int inputNum = scan1.nextInt();
//		System.out.print("So vua nhap la: "+ inputNum);
		
//		======================== BT3 =========================
//		Scanner scan2 = new Scanner(System.in);
//		System.out.print("Dien chuoi: ");
//		String input = scan2.nextLine();
//		System.out.print("Chuoi vua nhap la:"+ input);
	}
	
}
