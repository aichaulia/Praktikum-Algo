import java.util.Scanner;

class limassg{
    double tinggi, luasAlas;

    limassg(double las, double t){
        luasAlas = las;
        tinggi = t;
    }
    double hitungVolumeLimassg(){
        return luasAlas * tinggi * 0.33;
    }
    double hitungLuasPermuLimassg(){
        return luasAlas + (3*(3*luasAlas));
    }
}
public class LimasSegitiga {
    public static void main(String[] args){
        limassg[] l1Array = new limassg[3];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("LIMAS SEGITIGA " +(i+1));
            System.out.print("Luas Alas\t: ");
            int las = sc.nextInt();
            System.out.print("Tinggi\t\t: ");
            int t = sc.nextInt();
            l1Array[i] = new limassg(las, t);
            System.out.println();
        }
        for(int i=0; i<3; i++){
            System.out.println("Luas Permukaan Limas Segitiga " +(i+1) + " : " +l1Array[i].hitungLuasPermuLimassg());
        }
        System.out.println();
        for(int i=0; i<3; i++){
            System.out.println("Volume Limas Segitiga " +(i+1) + " : " +l1Array[i].hitungVolumeLimassg());
        }
    }
}
