### JOBSHEET 5
### SORTING(BUBBLE, SELECTION, DAN INSERTION SORT)

#### Aulia Cahya Briliana (07_2141720092_1G)

##### PRAKTIKUM
###### Pertanyaan 5.2.3
1. Terdapat di method apakah proses bubble sort?
* void bubbleSort() {
  for (int i = 0; i < tkt.length; i++) {
  for (int j = i + 1; j < tkt.length; j++) {
  if (tkt[j].harga > tkt[j - 1].harga) {
  //proses swap atau penukaran
  Tiket tmp = tkt[j];
  tkt[j] = tkt[j - 1];
  tkt[j - 1] = tmp;
2. Terdapat di method apakah proses selection sort?
* void selectionSort() {
  for (int i = 0; i < tkt.length; i++) {
  int idxMin = i;
  for (int j = i + 1; j < tkt.length; j++) {
  if (tkt[j].harga < tkt[idxMin].harga) {
  idxMin = j;
3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan
   proses swap tersebut!
* proses dengan menukar dari besar ke kecil ataupun sebaliknya
4. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
   Untuk apakah proses tersebut?
* menyimpan indeks sementara
5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
   * a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
   * Perulangan i sebagai iterasi pada tahapan bubble sort. Sedangkan perulangan j merupakan
     template dilakukan pengecekan dan swap dari setiap iterasinya
   * b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
   * Merujuk pada tahapan bubble sort yang akan berulang sebanyak listMhs
   * c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
   * Karena perulangan j merupakan bagian dari perulangan I, maka disetiap iterasinya banyak
     data yang akan dicek dan diswap akan selalu berkurang 1, jadi misal pada iterasi pertama
     banyak data yang akan dihitung ataupun swap adalah sebanyak 20, pada iterasi kedua
     sebanyak 19, begitu seterusnya sampai iterasi ke-20 sebanyak 20 data
   * d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
   berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
   * Perulangan I sebanyak 49 kali dan ada deret aritmatika penjumlahan dari 49 + 48 + 47
     +…..+1 menghasilkan 1225 tahapan bubble sort

###### Pertanyaan 5.3.3
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!
* Jadi pengecekan dimulai dari data pertama yaitu dari indeks ke-0 yang akan berakhir di
  indeks ke listMhs.length-1. Lalu dalam outer loop akan ditentukan datanya dari indeks
  minimum dari indeks ke-i (sesuai dengan tingkatan outer loop). Maka dibuatlah inner loop
  yaitu memeriksa sisa-sisa bilangan selanjutnya (j = I +1), jika bilangan setelahnya lebih
  kecil dari dirinya, maka akan ditukar tempat dengannya. Namun jika tidak maka tidak ada
  penukaran, dan Kembali pada outer loop.

###### Pertanyaan 5.4.3
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara ascending atau decending, anda dapat melakukannya dengan menambahkan
parameter pada pemanggilan fungsi insertionSort.
* void insertionSort(boolean asc){
  for (int i = 1; i < listMhs.length; i++){
  Mahasiswa temp = listMhs[i];
  int j = i;
  if (asc){
  while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
  listMhs[j] = listMhs[j - 1];
  j--;
  }
  }else{
  while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
  listMhs[j] = listMhs[j - 1];
  j--;
  }
  }
  listMhs[j] = temp;
* System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
  Scanner sc = new Scanner(System.in);
  System.out.print("Apakah ascending?(true/false) : ");
  boolean asc = sc.nextBoolean();
  list.insertionSort(asc);
  list.tampil();

##### LATIHAN PRAKTIKUM
output
![Op1](Output)
![Op2](Output)
![Op3](Output)
![Op4](Output)
![Op5](Output)