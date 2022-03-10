import java.util.Scanner;

class blk{
    int panjang, lebar, tinggi;

    blk(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    int hitungVolumeBalok(){
        return panjang*lebar*tinggi;
    }
    int hitungLuasPermukaanBalok(){
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }
}
public class Balok {
    public static void main(String[] args) {
        blk[] b1Array = new blk[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("BALOK " + (i+1));
            System.out.print("Panjang\t: ");
            int p = sc.nextInt();
            System.out.print("Lebar\t: ");
            int l = sc.nextInt();
            System.out.print("Tinggi\t: ");
            int t = sc.nextInt();
            b1Array[i] = new blk(p, l, t);
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Luas Permukaan Balok " + (i+1) + " : " + b1Array[i].hitungLuasPermukaanBalok());
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Balok " + (i+1) + " : " + b1Array[i].hitungVolumeBalok());
        }
    }
}