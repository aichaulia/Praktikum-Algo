import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int el = 0;
        System.out.println("=============================");
        System.out.println("Program menghitung keuntungan total");
        System.out.println("Masukkan jumlah bulan : ");
        int jum_peru = sc.nextInt();
        for(int i=0; i<jum_peru; i++){
            System.out.println("Masukkan jumlah bulan perusahaan ke-" +(i+1) +" : ");
            int el = elm;
        }

        Sum sm = new Sum(elm);
        System.out.println("==============================");
        for(int i=0; i<sm.elemen; i++){
            System.out.println("Masukkan untung bulan ke-" +(i+1) +" = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("==============================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " +sm.elemen + " bulan adalah = " +sm.totalBF(sm.keuntungan));
        System.out.println("==============================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perubahan selama " +sm.elemen + " bulan adalah = " +sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}