import java.util.Scanner;

class pgkt {
    public int nilai, pangkat;
    public int pangkatBF(int a, int n){
        int hasil=1;
        for(int i=0; i<n; i++){
            hasil = hasil*a;
        }
        return hasil;
    }
    public int pangkatDC(int a, int n){
        if (n==0){
            return 1;
        }
        else{
            if(n%2==1)
                return(pangkatDC(a,n/2) * pangkatDC(a,n/2)*a);
            else
                return(pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
    }
}
public class Pangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        pgkt[] png = new pgkt[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new pgkt();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("========================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("========================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("=========================================");
    }
}
