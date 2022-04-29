import java.util.Scanner;

public class MahasiswaMain {
    static void menu(){
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Semua Antrian");
        System.out.println("4. Cek Antrian Terdepan");
        System.out.println("5. Cek Antrian Terbelakang");
        System.out.println("6. Cek Posisi Antrian");
        System.out.println("7. Cari Data Mahasiswa");
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian : ");
        int max = sc1.nextInt();
        QueueMahasiswa antri = new QueueMahasiswa();
        int pilih;
        do {
            menu();
            pilih = sc1.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc2.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc2.nextLine();
                    System.out.print("Absen : ");
                    int absen = sc1.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc1.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk);
                    antri.Enqueue(m);
                    break;
                case 2:
                    Mahasiswa data = antri.Dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.nim) && data.absen != 0 && data.ipk != 0) {
                        System.out.println("Antrian yang keluar : " + data.nim + " " + data.nama + " " + data.absen + " " + data.ipk);
                        break;
                    }
                case 3:
                    antri.print();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan NIM : ");
                    String ceknim = sc2.nextLine();
                    antri.peekPosition(ceknim);
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian : ");
                    int cekantri = sc1.nextInt();
                    antri.printMahasiswa(cekantri);
            }
        }while(pilih>0 && pilih<8);
    }
}
