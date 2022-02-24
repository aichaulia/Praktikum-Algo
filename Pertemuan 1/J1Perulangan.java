import java.util.Scanner;
class J1Perulangan{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan NIM : ");
		int nim = sc.nextInt();
		System.out.println("==============================");
		System.out.print("n : ");
		int n = sc.nextInt();
		
		int i = 10;
		
		if (n < 10){
			n = n + i;
			System.out.println("n = " +n);
		}
		System.out.println("==============================");
		
		for (int x=0; x<n; x++){
			int cek = x%7;
			if (cek == 0){
				System.out.print("Senin");
			}else if (cek == 1){
				System.out.print(", Selasa");
			}else if (cek == 2){
				System.out.print(", Rabu");
			}else if (cek == 3){
				System.out.print(", Kamis");
			}else if (cek == 4){
				System.out.print(", Jumat");
			}else if (cek == 5){
				System.out.print(", Sabtu");
			}else {
				System.out.print(", Minggu, ");
			}
		}
	}
}