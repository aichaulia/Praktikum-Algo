import java.util.Scanner;

class kbs{
    int sisi;

    kbs(int s){
        sisi = s;
    }
    int hitungVolumeKubus(){
        return sisi*sisi*sisi;
    }
    int hitungLuasPermukaanKubus(){
        return 6*sisi;
    }
}
public class Kubus {
    public static void main(String[] args) {
        kbs[] b1Array = new kbs[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("sisi ");
            int s = sc.nextInt();
            b1Array[i] = new kbs(s);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Volume Kubus " + (i+1) + " : " + b1Array[i].hitungVolumeKubus());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Luas Permukaan Kubus " + (i+1) + " : " + b1Array[i].hitungLuasPermukaanKubus());
        }
    }
}