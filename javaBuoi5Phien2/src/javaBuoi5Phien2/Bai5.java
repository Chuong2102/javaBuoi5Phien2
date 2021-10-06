package javaBuoi5Phien2;
import java.lang.Math;
import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		boolean isNguyenTo = true;
		int max = 0;
		int dem = 0;
		b = 2;
		int i = 2;
		
		System.out.println("Nhap so cua so nguyen to can tim: ");
		max = input.nextInt();
		
		while(dem < max) {
			//kiem tra ng to
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isNguyenTo = false;
				}
			}
			//
			if(isNguyenTo) {
				System.out.println(i);
				dem++;
			}
			isNguyenTo = true;
			i++;
		}
		
	}

}
