##Laporan Praktikum 10 (Jobsheet 8)

####Aulia Cahya Briliana_07_2141720092

###Praktikum 1
1. pada konstruktor, mengapa nilai awal atribut t front dan rear bernilai -1, sementara atribut size
   bernilai 0? 
* menandakan bahwa array dalam queue masih d=kosong dan belum terisi
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
* apabila posisi rear berada pada indeks terakhir array, maka posiis rear akan berpindah atau mengula ke indeks 0
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
* apabila posisi front berada di indeks terakhir array, maka posisi front akan berpindah atau mengulang ke indeks 0
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
   melainkan int i=front?
* karena indeks 0 belum tentu merupakan front. Pada konsep queue yang lebih dahulu masuk berarti
  lebih dahulu kelur, sehingga bisa saya yang baru masuk tidak terletak pada indeks ke-0. Maka
  proses perulangan didahulukan mulai dari front
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
* hampir sama dengan i++, jalannya di i+1, namun dengan kode program tersebut jika nanti i ==
  max maka otomatis i = 0 dan mulai i+1 kembali. Karena jika 1 % (angka lebih besar) = 1, maka
  i+1 sampai angka i belum == max maka i masih sama seperti (i+1) tersebut. Jika sudah sampai
  (i+1) nilainya adalah == max, maka nilai tsb jika di % dengan nilai max hasilnya adalah 0, sehingga
  akan kembali i = 0.
6. Tunjukkan potongan kode program yang merupakan queue overflow!
* if (IsFull()){
    System.out.println("Queue sudah penuh);
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
   dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
   queue overflow dan queue underflow, program dihentikan!
* public void Enqueue (int dt){
  if (IsFull()){
  System.out.println("Queue sudah penuh");
  }else{
  if(IsEmpty()){
  front = rear = 0;
  }else{
  if(rear == max-1){
  rear = 0;
  }else{
  rear++;
  }
  }
  data[rear] = dt;
  size++;
  }
  }
  public int Dequeue(){
  int dt = 0;
  if(IsEmpty()){
  System.out.println("Queue masih kosong");
  }else{
  dt = data[front];
  size--;
  if(IsEmpty()){
  front = rear = -1;
  }else{
  if(front == max -1){
  front = 0;
  }else{
  front++;
  }
  }
  }
  return dt;
  }

###Praktikum 2
1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!
* Berfungsi untuk memastikan bahwa queue tidak kosong dan sudah terisi
2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
   Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
   daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
   dapat dipanggil!
* public void peekRear(){
  if(!IsEmpty()){
  System.out.println("Elemen paling belakang : " + data[rear].nama +" " + data[rear].norek + " " + data[rear].nama + " " +data[rear].alamat + " " + data[rear].umur+""+data[rear].saldo);
  }else {
  System.out.println("Queue mash kosong");
  }
  }
