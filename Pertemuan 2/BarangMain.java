public class BarangMain{
	public static void main (String[] args){
		/*int Barang;
		Barang b1 = new Barang();
		b1.namaBarang = "Corsair 2 GB";
		b1.jenisBarang = "DDR";
		b1.hargaSatuan = 250000;
		b1.stok = 10;
		b1.tambahStok(1);
		b1.kurangiStok(3);
		b1.tampilBarang();
		int hargaTotal = b1.hitungHargaTotal(4);
		System.out.println("Harga 4 buah = " +hargaTotal);
		Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
		b2.tampilBarang();*/
		
		Barang n = new Barang();
		n.nama = "Album";
		n.jumlah = 5;
		n.hargaSatuan = 200000;
		
		System.out.println("Nama Barang\t= " +n.nama);
		System.out.println("Jumlah\t\t= " +n.jumlah);
		System.out.println("Harga\t\t= "+n.hargaSatuan);
		System.out.println("Harga Total\t= " +n.hitungHargaTotal());
		System.out.println("Diskon\t\t= " +n.hitungDiskon());
		System.out.println("Harga Bayar\t= " +n.hitungHargaBayar());
	}
}