import java.util.Scanner;
class J1Pemilihan{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Program Menghitung Nilai Akhir");
		System.out.println("==============================");
		System.out.print("Masukkan Nilai Tugas\t: ");
		double tugas = sc.nextDouble();
		System.out.print("Masukkan Nilai UTS\t: ");
		double uts = sc.nextDouble();
		System.out.print("Masukkan Nilai UAS\t: ");
		double uas = sc.nextDouble();
		
		double nAkhir;
		String nHuruf;
		nAkhir = ((tugas*0.2)+(uts*0.35)+(uas*0.45));
		System.out.println("==============================");
		System.out.println("==============================");
		System.out.println("Nilai Akhir : " + nAkhir);
		
		if(nAkhir > 80 && nAkhir <= 100){
			nHuruf = "A";
			System.out.println("Nilai Huruf : " +nHuruf);
		}else if (nAkhir > 73 && nAkhir <= 80){
			nHuruf = "B+";
			System.out.println("Nilai Huruf : " +nHuruf);
		}else if (nAkhir > 65 && nAkhir <= 73){
			nHuruf = "B";
			System.out.println("Nilai Huruf : " +nHuruf);
		}else if (nAkhir > 60 && nAkhir <= 65){
			nHuruf = "C+";
			System.out.println("Nilai Huruf : " +nHuruf);
		}else if (nAkhir > 50 && nAkhir <= 60){
			nHuruf = "C";
			System.out.println("Nilai Huruf : " +nHuruf);
		}else if (nAkhir > 39 && nAkhir <= 50){
			nHuruf = "D";
			System.out.println("Nilai Huruf : " +nHuruf);
		}else{
			nHuruf = "E";
			System.out.println("Nilai Huruf : " +nHuruf);
		}
		System.out.println("==============================");
		System.out.println("SELAMAT LULUS");
	}
}