public class Barang{
		/*String namaBarang, jenisBarang;
		int stok, hargaSatuan;
		
		Barang(){
		}
		Barang(String nm, String jn, int st, int hs){
			namaBarang = nm;
			jenisBarang = jn;
			stok = st;
			hargaSatuan = hs;
		}
		
		void tampilBarang(){
			System.out.println("Nama = " +namaBarang);
			System.out.println("Jenis = " +jenisBarang);
			System.out.println("Stok = " +stok);
			System.out.println("Harga Satuan = " +hargaSatuan);
		}
		void tambahStok(int n){
			stok = stok + n;
		}
		void kurangiStok(int n){
			stok = stok - n;
		}
		int hitungHargaTotal(int jumlah){
			return jumlah*hargaSatuan;*/
			
		String nama;
		int hargaSatuan, jumlah;
		
		int hitungHargaTotal(){
			return jumlah * hargaSatuan;
		}
		int hitungDiskon(){
			if (hitungHargaTotal() > 100000){
				return hitungHargaTotal() * 10/100;
			}else if (hitungHargaTotal() > 50000 || hitungHargaTotal() <= 100000){
				return hitungHargaTotal() * 5/100;
			}else{
				return hitungHargaTotal();
			}
		}
		int hitungHargaBayar(){
			return hitungHargaTotal() - hitungDiskon();
		}
}