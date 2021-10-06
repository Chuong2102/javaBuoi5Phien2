package javaBuoi5Phien2;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isNguyenTo = true;
		
		for(int i = 10001; i<= 99999; i++) {
			//kiem tra ng to
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					isNguyenTo = false;
				}
			}
			//
			if(isNguyenTo) {
				System.out.println(i);
			}
			isNguyenTo = true;
		}
	}

}
