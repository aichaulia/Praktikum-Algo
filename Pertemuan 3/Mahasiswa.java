import java.util.Scanner;

class mhs{
    String nama, jk;
    int nim;
    double ipk;
}
public class Mahasiswa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        mhs[] n1Array = new mhs[3];
        System.out.println("======MASUKKAN DATA MAHASISWA======");
        for(int i=0; i<3; i++){
            n1Array[i] = new mhs();
            System.out.println("Masukkan Data Mahasiswa ke-" +(i+1));
            System.out.print("Masukkan Nama\t\t\t: ");
            n1Array[i].nama = sc.next();
            System.out.print("Masukkan NIM\t\t\t: ");
            n1Array[i].nim = sc.nextInt();
            System.out.print("Masukkan Jenis Kelamin\t: ");
            n1Array[i].jk = sc.next();
            System.out.print("Masukkan IPK\t\t\t: ");
            n1Array[i].ipk = sc.nextDouble();
            System.out.println();
        }
        System.out.println();
        System.out.println("=====HASIL INPUT DATA=====");
        for(int i=0; i<3; i++){
            System.out.println("Data Mahasiswa ke-" +(i+1));
            System.out.println("Nama\t\t\t: " +n1Array[i].nama);
            System.out.println("NIM\t\t\t\t:" +n1Array[i].nim);
            System.out.println("Jenis Kelamin\t: " +n1Array[i].jk);
            System.out.println("IPK\t\t\t\t: " +n1Array[i].ipk);
            System.out.println();
        }
    }
}
