package javaBuoi5Phien2;

import java.lang.Math;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		boolean isNguyenTo = true;
		
		System.out.println("Nhap phan tu cuoi': ");
		b = input.nextInt();
		
		for(int i = 2; i <= b; i++) {
			//kiem tra ng to
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isNguyenTo = false;
				}
			}
			//
			if(isNguyenTo)
				System.out.println(i);
			isNguyenTo = true;
		}
		
	}

}
