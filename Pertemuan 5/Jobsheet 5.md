###Aulia Cahya Briliana
### 1G_07_2141720092

##BRUTE FORCE DAN DIVIDE CONQUER

#####4.2 Menghitung Nilai Faktorial dengan Algoritma BF dan DC
######4.2.3 Pertanyaan
1. Jelaskan mengenai base line Algoritma DC untuk melakukan pencarian nilai faktorial!
- Karena jika nilai dari n = 1, program akan melakukan return 1, jika tidak maka nilai pada variable n akan dikurang -1, dimana di setiap perulangan yang di lakukan akan dikalikan dengan nilai sebelumnya.
2. Pada implementasi Algoritma DC Faktorial apakah lengkap terdiri dari 3 tahapan divide, conqure, combine? Jelaskamn masing-masing bagiannya pada kode program!
- Divide = faktorialDC(n-1) pengurangan pada nilai n.
- Conquer = n*.faktorialDC(n-1) penyelesaian dengan rekursif.
- Combine = n*faktorialDC(n-1) pengombinasian dengan perkalian.
3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for? Buktikan!
While :

package mainfaktorial;
class Faktorial {
public int nilai;
public int FaktorialBF (int n){
int fakto = 1;
int i = 1;

    while (i<n){
        fakto = fakto *1;
        i++;
    }
    return fakto;
    } 
    public int FaktorialDC (int n){
        if(n ==1){
            return 1;
        }
        else {
            int fakto=n*FaktorialDC(n-1);
            return fakto;
        }
    } 



Do-while :

    package mainfaktorial;
    class Faktorial {
    public int nilai;
    public int FaktorialBF (int n){
    int fakto = 1;
    int i = 1;

    do{
        fakto = fakto *1;
        i++;
    } while (i <= n);

    return fakto;
    } 
    public int FaktorialDC (int n){
        if(n ==1){
            return 1;
        }
        else {
            int fakto=n*FaktorialDC(n-1);
            return fakto;
        }
    } 
}
4. Tambahkan pengecekan waktu eksekusi kedua jenis method tersebut!
- package mainfaktorial;

import java.util.Scanner;

public class MainFaktorial {

 
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("==========================");
        System.out.print ("Masukkan Jumlah Elemen Yang Dihitung : ");
        int elemen=sc.nextInt();
        
        
    Faktorial [] fk = new Faktorial[elemen];
    
    for(int i=0; i<elemen; i++){
        fk[i] = new Faktorial();
        System.out.print ("Masukkan nilai data ke- " +(i+1)+ ":");
        fk[i].nilai=sc.nextInt();
    }
    long start = System.currentTimeMillis();
    System.out.println("===========================");
    System.out.println("Hasil Faktorial dengan BruteForce : ");
    for(int j= 0; j<elemen; j++){
    System.out.println("Faktorial dari nilai " + fk[j].nilai + "adalah : " + fk[j].FaktorialBF(fk[j].nilai));
    }
    long end = System.currentTimeMillis();
    long elapsedtime = end - start;
    System.out.println("Waktu" + String.valueOf(elapsedtime));
    long start1 = System.currentTimeMillis();
    System.out.println("================================");
    System.out.println("Hasil Faktorial dengan Divide dan Conquer");
    for (int k = 0; k < elemen; k++){
    System.out.println("Faktorial dari nilai" + fk[k].nilai+ "adalah :" +fk[k].FaktorialDC(fk[k].nilai));
    }

    long end1 = System.currentTimeMillis();
    long elapsedtime1 = end1 -start1;
    System.out.println("Waktu " + String.valueOf(elapsedtime1));
    System.out.println("================================");
    System.out.println("==========================");
        
    }
5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
- 
#####4.3 Menghitung Hasil Pangkat dengan Algoritma BF dan CD
###### 4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
- method pangkatBF() : menggunakan fungsi yang melakukan proses perulangan terhadap suatu intruksi dan ketika syarat tersebut tidak terpenuhi lagi maka perulangan akan terhenti 
- method pangkatDC() : menggunakan fungsi rekursif yang mana perulangan terjadi akibat pengeksekusian suatu fungsi yang mana fungsi tersebut memanggil dirinya sendiri.
2. Pada method PangkatDC() terdapat potongan program sebagai berikut
Jelaskan arti potongan kode tersebut!
- Maksud dari potongan kode tersebut adalah apabila terdapat suatu bilangan ganjil maka program akan melakukan pembagian terhadap variuable n, yakni di bagi 2 kemudian dikalikan dengan method itu sendiri dan kemudian di kalikan lagi dengan variable a. dan apabila bilangan tersebut genap maka program akan melakukan return dan melakukan pembagian terhadap variable n, yang mana variable n di bagi 2 dan kemudian di kalikan dengan method itu sendiri namun tidak dikalikan dengan nilai daripada variable a
3. Apakah tahap combine sudah termasuk dalam kode tersebut? Tunjukkan!
- Tahap combine sudah terjadi pada kode tersebut, dan lebih tepatnya tahapan tersebut di lakukan pada class Pangkat yang mana lebih tepatnya terletak pada method pangkatDC
4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor
- int elemen = sc.nextInt();
  Pangkat[] png = new Pangkat [elemen];

    for (int i = 0; i< elemen; i++>) { 
    System.out.println("Masukkan nilai yang akan dipangkatkan ke- " +(i+1) + " : ");

    int bil = sc.nextInt();
    System.out.println("Masukkan nilai pangkat ke-" (i+1)+" : ");

    }
5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!
#####4.4 Menghitung Sum Array dengan Algoritma BF dan DC
######4.4.3 Pertanyaan
1. Berikan ilustrasi perbedaan peritungan keuntungan dengan method TotalBF() ataupun TotalDC()
- method TotalBF() : kode program terkesan lebih ringkas dan sederhana, dan menjadikannya lebih mudah untuk di pahami
- method TotalDC() : kode program lebih panjang daripada kode program pada method TotalBF(),method ini juga memiliki keuntungan dapat memecahkan masalah yang sulit.
2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenid algoritma tersebut
- Dengan cara mengganti sintaks println menjadi sintaks printf dan juga menggunakn metode pembatasan karakter.
3. Mengapa terdapat formulasi return value berikut? Jelaskan!
- Return value tersebut berguna untuk mengembalikan nilai dari variable lsum ,variable rsum dan juga arr [mid] yang mana masing-masing nya di jumlah kan terlebih dahulu.
4. Kenapa dibutuhkan variable mid pada method TotalDC()?
- Di butuhkan variable mid pada method TotalDC()dikarenakan variable ini dapat menampng nilai dari perhitungan (1+r)/2 yang akan digunakan sebagai pengisian nilai pada parameter di method TotalDC()
5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan
beberapa bulan untuk beberapa perusahaan (Setiap perusahaan bsa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!
#####4.5 Latihan Praktikum
