import java.util.Scanner;
class tnh{
    int p, l;

    public tnh(int a, int b){
        p = a;
        l = b;
    }
    int hitungLuas(){
        int luas = p*l;
        return luas;
    }
}

public class Tanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah tanah : ");
        int hitungan = sc.nextInt();
        System.out.println();
        tnh[] land = new tnh[hitungan];

        for (int i = 0; i < land.length; i++) {
            System.out.println("Tanah " + (i+1));
            System.out.print("Panjang\t: ");
            int a = sc.nextInt();
            System.out.print("Lebar\t: ");
            int b = sc.nextInt();
            land[i] = new tnh(a, b);
            System.out.println();
        }

        int x = 0;
        int z = 0;
        for (int i = 0; i < land.length; i++) {
            if (land[i].hitungLuas() > x) {
                x = land[i].hitungLuas();
                z = i + 1;
            }
        }

        for (int i = 0; i < land.length; i++) {
            System.out.println("Luas tanah " + (i + 1) + " : " + land[i].hitungLuas());
        }
        System.out.println();
        System.out.println("Tanah terluas : " + z);
    }
}