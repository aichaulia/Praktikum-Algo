## Laporan Praktikum Pertemuan 3
#### Aulia Cahya Briliana (2141720092 - 1G)

### Subbab 3.2
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
* tidak harus memiliki method tetapi harus memiliki atribut. karena pada percobaan diatas diharuskan untuk memasukkan panjang dan lebar yang merupakan atribut dari objek tersebut
2. Apakah class PersegiPanjang memiliki konstruktor? Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
* untuk membuat objek PersegiPanjang ke index array 1
3. Apa yang dimaksud dengan kode berikut ini :
* untuk membuat ppArray dapat menampung 3 objek PersegiPanjang
4. Apa yang dimaksud dengan kode berikut ini :
* agar dapat digunakan untuk instansiasi objek, membuat objek PersegiPanjang ke index array 1 dan untuk mengisi atribut array index i dengan panjang = 80 dan lebar = 40
5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
* tujuannya agar lebih fleksibel dan dapat dengan mundah mencerminkan class dan objek tersebut

### Subbab 3.3
1. Apakah array of object dapat diimplementasikan pada array 2 dimensi?
* bisa
2. Jika soal no satu iya, berikan contohmya! Jika tidak, jelaskan!
* ``` java
     kucing[][] m = new kucing[2][2];
     k[0][0] = new kucing();
     ```  
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe int, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?
* karena belum membuat objek pada inder array 5 yang seharusnya setelah line 1 terdapat line seperti berikut :
*  ``` java
    pgArray[5] = new Persegi();
    ```  
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
* ``` java
    System.out.print("Masukkan panjang array : ");
    int arrLength = sc.nextInt();
    PersegiPanjang[] ppArray = new PersegiPanjang[arrLength];
    ```
5. Apakah boleh jika terjadi duplikasi instansiasi array of object, misalkan saja instansi dilakukan pada ppArray[i] sekaligus ppArray[0]? Jelaskan!
* boleh. karena sesuai uji coba yang telah dilakukan, setelah menginstansiasi objek mhs[0]=new mahasiswa; meskipun dilakukan berkali-kali akan tetapi tidak terjadi error, akan tetapi program menjadi kurang efektif

### Subbab 3.4
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
* dapat
* ``` java
    public class Drakor{
        int episode;
        public Drakor(){

        }
        public Drakor(int i) {
            episode = i;
        }
    }
    ```
* berdasarkan contoh tersebut menujukkan bahwa konstruktor tidak berparameter dan konstruktor berparameter
2. Jika diketahui class Segitiga seperti berikut ini. Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t, yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi
* ``` java
    public class Segitiga{
        public int alas;
        public int tinggi;
        
        public Segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }
    }
    ```
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga tersebut
* ``` java
    public class Segitiga{
        public int alas;
        public int tinggi;
        
        public Segitiga(int a, int t){
            alas = a;
            tinggi = t;
        }

        int hitungLuas(){
            int luas = (alas*tinggi)/2;
            return luas;
        }

        double hitungKeliling(){
            double keliling = Math.sqrt(((alas*0.5)*(alas*0.5))+(tinggi*tinggi))*2+alas;
        }
    }
    ```  
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut :
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
*  ``` java
        public class SegitigaMain{
            public static void main(String[] args){
                Segitiga[] sgArray = new Segitiga[4];
                for (int i = 0 ; i < sgArray.length ; i++){
                    sgArray[i] = new Segitiga();
                }
                sgArray[0].alas = 10;
                sgArray[0].tinggi = 4;
                sgArray[1].alas = 20;
                sgArray[1].tinggi = 10;
                sgArray[2].alas = 15;
                sgArray[2].tinggi = 6;
                sgArray[3].alas = 25;
                sgArray[3].tinggi = 10;
            }
        }
    ```
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKeliling()
*  ``` java
        public class SegitigaMain{
            public static void main(String[] args){
                Segitiga[] sgArray = new Segitiga[4];
                for (int i = 0 ; i < sgArray.length ; i++){
                    sgArray[i] = new Segitiga();
                }
                sgArray[0].alas = 10;
                sgArray[0].tinggi = 4;
                sgArray[1].alas = 20;
                sgArray[1].tinggi = 10;
                sgArray[2].alas = 15;
                sgArray[2].tinggi = 6;
                sgArray[3].alas = 25;
                sgArray[3].tinggi = 10;

                for (int i = 0 ; i < sgArray.length ; i++){
                    System.out.println("Luas Segitiga ke - " + (i+1) + " adalah : " + 
                    sgArray[i].hitungLuas());
                    System.out.println("Keliling Segitiga ke - " + (i+1) + " adalah : " + 
                    sgArray[i].hitungKeliling());

                }
            }
        }

    ```
### Subbab 3.5
1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang
   (minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun
   ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut
   yang ada menggunakan konstruktor semua bangun ruang tersebut.
   Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan
   luas permukaan dan volume dari tiap jenis bangun ruang tersebut.
* KUBUS
![](../../../Algo/Praktikum-Algo/Pertemuan 3/Output/P3_Kubus.png)
* BALOK
![](../../../Algo/Praktikum-Algo/Pertemuan 3/Output/P3_Balok.png)
* LIMAS SEGITIGA
![](../../../Algo/Praktikum-Algo/Pertemuan 3/Output/P3_Limas.png)
2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas
   tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas
   tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang
   ada.
![](../../../Algo/Praktikum-Algo/Pertemuan 3/Output/P3_Tanah.png)
3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama,
   nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi
   tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
   dimisalkan terdapat 3 data mahasiswa yang tersedia.
![](../../../Algo/Praktikum-Algo/Pertemuan 3/Output/P3_Mhs1.png)
![](../../../Algo/Praktikum-Algo/Pertemuan 3/Output/P3_Mhs2.png)