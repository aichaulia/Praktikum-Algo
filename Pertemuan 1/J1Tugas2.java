import java.util.Scanner;
class J1Tugas2{
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		double v, s, t;
		String menu;
		
			System.out.println("PROGRAM MENGHITUNG RUMUS KECEPATAN, JARAK, dan WAKTU");
			System.out.println("========PILIH MENU========");
			System.out.println("1. Menghitung Kecepatan");
			System.out.println("2. Menghitung Jarak");
			System.out.println("3. Menghitung Waktu");
			System.out.println("Masukkan Pilihan : ");
			int pilih = sc.nextInt();
			
			if(pilih==1){
				System.out.println("Menghitung Kecepatan(v)");
				System.out.println("Masukkan Jarak(s) : ");
				s = sc.nextDouble();
				System.out.println("Masukkan Waktu(t) : ");
				t = sc.nextDouble();
				v = s/t;
				System.out.print("Hasil : " +v +"m/s");
			}else if(pilih==2){
				System.out.println("Menghitung Jarak(s)");
				System.out.println("Masukkan Kecepatan(v) : ");
				v = sc.nextDouble();
				System.out.println("Masukkan Waktu(t) : ");
				t = sc.nextDouble();
				s = v*t;
				System.out.print("Hasil : " +t +"detik");
			}else if(pilih==3){
				System.out.println("Menghitung Waktu(s)");
				System.out.println("Masukkan Jarak(s) : ");
				s = sc.nextDouble();
				System.out.println("Masukkan Kecepatan(v) : ");
				v = sc.nextDouble();
				t = s/v;
				System.out.print("Hasil : " +t +"detik");
			}else{
				System.out.println("Maaf Inputan Anda Salah");
			}
		}
	}