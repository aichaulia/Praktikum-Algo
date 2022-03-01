public class J2Barang{
	
		String namaBarang, jenisBarang;
		int stok, hargaSatuan;
	
		void tampilBarang(){
			System.out.println("Nama Barang\t: " +namaBarang);
			System.out.println("Jenis Barang\t: " +jenisBarang);
			System.out.println("Stok Barang\t: " +stok);
			System.out.println("Harga Barang\t: " +hargaSatuan);
		}
		void tambahStok(int n){
			stok = stok + n;	
		}
		void kurangiStok(int n){
			if(n>0){
			stok = stok - n;	
			}
		}
		int hitungHargaTotal (int jumlah){
			return jumlah*hargaSatuan;
		}
	}
}