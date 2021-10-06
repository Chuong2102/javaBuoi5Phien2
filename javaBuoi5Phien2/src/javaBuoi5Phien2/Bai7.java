package javaBuoi5Phien2;

import java.util.Scanner;
public class Bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		int dv = 0;
		int s = 0;
		
		System.out.println("Nhap vao so bat ki`: ");
		n = input.nextInt();
		
		while(n != 0) {
			dv = n % 10;
			s+= dv;
			n = n/ 10;
		}
		System.out.println("Tong cua cac chu so la`: "+ s);
	}

}
