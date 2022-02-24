import java.util.Scanner;
class J1Fungsi{
    public static void main(String[] args){
        int[][] royalG = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9 }
        };
        int aglo = 0, kela = 0, aloc = 0, mawar = 0;
        int pendapatan;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (j == 0){
                    aglo += royalG[i][j];
                }else if (j == 1) {
                    kela += royalG[i][j];
                }else if (j == 2) {
                    aloc += royalG[i][j];
                }else {
                    mawar += royalG[i][j];
                }
            }
        }
        pendapatan = ((10-1)*75000) + ((5-2)*50000) + (15*60000) + ((7-5)*10000);
        System.out.println("===Jumlah Stock Bunga===");
        System.out.println("Jumlah Stock Aglonema\t: " + aglo);
        System.out.println("Jumlah Stock Keladi\t: " + kela);
        System.out.println("Jumlah Stock Alocasia\t: " + aloc);
        System.out.println("Jumlah Stock Mawar\t: " + mawar);
		System.out.println("===================================================");
        System.out.println("Pendapatan RoyalGarden1 (terjual habis) : Rp" +pendapatan);
    }
}