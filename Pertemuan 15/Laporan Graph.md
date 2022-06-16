####Nama : Aulia Cahya Briliana
####NIM : 2141720092
####Absen : 07
####Kelas : 1G

###LAPORAN JOBSHEET 12 - GRAPH

####2.1.3 Pertanyaan Percobaan
1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah
   kegunaan algoritma-algoritma tersebut?
- Pencarian Melebar (Breadth First Search atau BFS) Untuk Mencari
- Pencarian Mendalam (Depth First Search atau DFS) Untuk Mencari
- Algoritma Bellman-Ford Untuk mencari lintasan terpendek
- Algoritma Boruvska Untuk menentukan pohon penjangkau minimum
2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan
   pembuatan variabel tersebut ?
* Untuk memanggil objek Linkedlist dan mengubahnya menjadi objek array yang mana
  nantinya akan di isi oleh vertex
3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
   jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?
* Alasannya adalah untuk dapat mengenalkan data dari depan
4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge
   pada graph ?
* Dengan cara looping edge, jika vertex lebih besar dari I dan destination sama dengan I maka
  edge akan otomatis di hapus
5. Kenapa pada praktikum 2.1.1 langkah ke-12 untuk menghapus path yang bukan merupakan
   lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?
* Output tidak error tapi data vertex yang di keluarkan mengalami perubahan path / lintasan

####2.2.3 Pertanyaan Percobaan
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
* Directed gaph degree mempunyai nilai yang berbeda karena terdapat in out
  Sedangkan undirected degree mempunyai nilai yang sama karena tidak terdapat in out
2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus
   ditambahkan dengan 1 pada indeks array berikut?
* Karena pada matriks index di mulai dari 0, agar vertex dalam matrix bernilai sama dengan
  vertex yang seharusnya maka harus di tambah +1
3. Apakah kegunaan method getEdge() ?
* Untuk menampilkan apakah vertex tersedia atau tidak
4. Termasuk jenis graph apakah uji coba pada praktikum 2.2?
* Jenis directed graph
5. Mengapa pada method main harus menggunakan try-catch Exception ?
* Agar program yang error dapat tetap berjalan dan tidak terhenti
