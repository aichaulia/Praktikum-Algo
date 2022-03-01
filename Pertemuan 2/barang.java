//package js2;

public class barang {
    String nama;
    int hargaSatuan;
    int jumlah;

    int hargaTotal(int p, int j) {
        int hatot;
        hatot=p*j;
        return hatot;
    }

    double diskon(int z) {
        double hargaDiskon=0;
        if (z>100000){
            hargaDiskon=z*0.10;
        } else if (z>=50000&&z<=100000){
            hargaDiskon=z*0.05;
        }else {
            hargaDiskon=0;
        }
        return hargaDiskon;
    }

    double hargaBayar(int x, double z) {
        double hargaBayar=0;
        hargaBayar=x-z;
        return hargaBayar;
    }
}
