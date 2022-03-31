import java.util.Scanner;

class Tiket {
    String maskapai, tujuan, asal;
    int harga;
    Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    void tampil(){
        System.out.println("+==========================+");
        System.out.println("|      Aull Airport        |");
        System.out.println("+==========================+");
        System.out.println("Nama Maskapai\t= " + maskapai);
        System.out.println("Harga\t\t\t= " + harga);
        System.out.println("Asal\t\t\t= " + asal);
        System.out.println("Tujuan\t\t\t= " + tujuan);
    }
}

class TiketService {
    Tiket tkt[] = new Tiket[5];
    int a;

    void tambah(Tiket t) {
        if (a < tkt.length) {
            tkt[a] = t;
            a++;
        } else {
            System.out.println("Tiket Habis!");
        }
    }

    void tampil() {
        for (Tiket t : tkt) {
            t.tampil();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < tkt.length; i++) {
            for (int j = i + 1; j < tkt.length; j++) {
                if (tkt[j].harga > tkt[j - 1].harga) {
                    //proses swap atau penukaran
                    Tiket tmp = tkt[j];
                    tkt[j] = tkt[j - 1];
                    tkt[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < tkt.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < tkt.length; j++) {
                if (tkt[j].harga < tkt[idxMin].harga) {
                    idxMin = j;
                }
                Tiket tmp = tkt[idxMin];
                tkt[idxMin] = tkt[i];
                tkt[i] = tmp;
            }
        }
    }
}

public class MainTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiketService list = new TiketService();
        Tiket tkt1 = new Tiket("Super Air Jet\t\t", 556954 ,"Jakarta","Palembang");
        Tiket tkt2 = new Tiket("Citilink \t\t", 700000 ,"Surabaya","Balikpapan");
        Tiket tkt3 = new Tiket("Lion Air \t\t", 3977500 ,"Surakarta","Sorong");
        Tiket tkt4 = new Tiket("Batik Air\t\t", 2039700 ,"Malang","Balikpapan");
        Tiket tkt5 = new Tiket("Indonesia Air Asia \t", 630800 ,"Denpasar","Surabaya");
        list.tambah(tkt1);
        list.tambah(tkt2);
        list.tambah(tkt3);
        list.tambah(tkt4);
        list.tambah(tkt5);
        System.out.println("Data Sebelum Sorting : ");
        list.tampil();
        System.out.println();
        System.out.println();
        System.out.println("\t\tBESAR - KECIL\t\t");
        System.out.println("========Bubble Sort=========");
        list.bubbleSort();
        list.tampil();
        System.out.println();
        System.out.println();
        System.out.println("\t\tKECIL - BESAR\t\t");
        System.out.println("=======Selection Sort=======");
        list.selectionSort();
        list.tampil();
    }
}
