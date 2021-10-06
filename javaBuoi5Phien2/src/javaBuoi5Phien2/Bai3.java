package javaBuoi5Phien2;
import java.util.Scanner;
import java.lang.Math;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = 0;
		int a,b;
		int s; 
		
		a = 1;
		b = 1;
		
		System.out.println("Nhap n");
		n = input.nextInt();
		
		if(n<= 2) {
			System.out.println("n phai lon hon 2");
		}
		else {
			System.out.print(a+ " "+ b+ " ");
			for(int i = 0; i < n; i++) {
				s = a + b;
				a = b;
				b = s;
				System.out.print(s+ " ");
			}
		}
		
	}

}
