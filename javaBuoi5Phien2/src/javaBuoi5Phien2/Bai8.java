package javaBuoi5Phien2;
import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b;
		int s;
		int n = 0;
		boolean isNguyenTo = true;
		
		a = 1;
		b = 1;
		
		System.out.println("Nhap so phan tu cua day Fibo: ");
		n = input.nextInt();
		
		for(int i = 0; i < n; i++) {
			s = a + b;
			a = b;
			b = s;
			//kiem tra ng to
			for(int j = 2; j <= Math.sqrt(s); j++) {
				if(s % j == 0) {
					isNguyenTo = false;
				}
			}
			//
			if(isNguyenTo) {
				System.out.println(s);
			}
			isNguyenTo = true;
		}
	}

}
