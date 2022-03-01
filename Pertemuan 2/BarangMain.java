//package js2;

public class BarangMain {
    public static void main(String[] args) {
        barang b1 = new barang();
        b1.nama = "Ningen";
        b1.hargaSatuan = 200000;
        b1.jumlah = 2;

        System.out.println("Harga total = " + b1.hargaTotal(b1.hargaSatuan, b1.jumlah));
        System.out.println("Diskon = " + b1.diskon(b1.hargaTotal(b1.hargaSatuan, b1.jumlah)));
        System.out.println("Harga bayar = " + b1.hargaBayar(b1.hargaTotal(b1.hargaSatuan, b1.jumlah),
                b1.diskon(b1.hargaTotal(b1.hargaSatuan, b1.jumlah))));
    }
}
