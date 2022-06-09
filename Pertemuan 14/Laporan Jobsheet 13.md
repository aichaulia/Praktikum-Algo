###JOBSHEET 13
Nama : Aulia Cahya Briliana
NIM : 2141720092
Absen : 07
Kelas : 1G

####13.1.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
* karena pada binary search tree semua anak disebelah kiri harus lebih kecil daripada anak disebelah kanan dan parentnya.
sedangkan binary tree biasa tidak. binary search tree adalah binary tree yang seluruh children tiap node terurut sehingga
dalam pencarian data jauh lebih efektif dari awal hingga akhir.
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
* untuk menyimpan indeks. left = menyimpan indeks < root. right = menyimpan indeks > root
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
* Untuk menentukan node pertama yang dibuat dalam tree yang tidak memiliki
  predessesor dan juga sebagai penunjukan
   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
* Nilai root ketika objek tree pertama kali dibuat adalah bernilai null atau kosong
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
* Proses yang akan terjadi adalah proses add dimana node baru tersebut langsung masuk
  dan menjadi root dalam sebuah tree
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
* Ketika data kurang dari current.data kemudian current.left tidak bernilai null, maka
  akan dilakukan current = current.left dan apabila current.left bernilai null, maka proses
  yang dilakukan current.left = new Node(data) atau penambahan node baru dan break
  (berhenti).

####13.2.1 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
* untuk menyimpan data dan idxLast untuk menyimpan batas data saat dilakukan
  print out
2. Apakah kegunaan dari method populateData()?
* untuk menyimpan data yang dimasukkan atau untuk atribut data dan idxLast
3. Apakah kegunaan dari method traverseInOrder()?
* untuk mencetak / menampilkan data
  dengan InOrder
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah
   posisi left child dan rigth child masin-masing?
* Left child dari node tersebut akan berada di index 2i + 1. Right child dari node tersebut
  akan berada di index 2i + 2. Maka left child berada pada index ke-5 dan right child
  berada index ke 6
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
* menentukan batas melakukan print dengan batas indeks yaitu 6
