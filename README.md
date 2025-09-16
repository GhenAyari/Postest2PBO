## Profil
---
- **Nama:** Ghendida Gantari Ayari
- **NIM:** 2409116080
- **Tema:** Manajemen Daftar Hewan Di Kebun Binatang

## Deskripsi
---
Program ini adalah sebuah program sederhana CRUD dengan tema manajemen daftar hewan kebun binatang. Di program ini user dapat membuat, membaca, mengedit, dan menghapus data hewannya.


## Kode

<img width="388" height="269" alt="image" src="https://github.com/user-attachments/assets/de6941f2-afc1-49d4-b05e-b63dfc2269de" />
<br>
Ini adalah struktur dari package dan class yang dimana terdapat 3 package dan 3 class.<br>
1. Package Model, Class ini adalah blueprint / cetakan objek hewan.<br>
2. Package Service menampung class yang mengatur aturan bisnis / logika program.<br>
3. Package Main dan class Main, ini adalah tampilan/menu yang dipakai user untuk berinteraksi dengan program.<br>
<br>
<img width="985" height="883" alt="image" src="https://github.com/user-attachments/assets/f49e376a-7997-4634-9275-8b47b74a1c1b" />
Program menampilkan menu pilihan ke layar. User masukkan angka (pilihan), lalu disimpan di variabel pilihan.
<br>
case 1 → memanggil tambahHewan() untuk menambah data hewan baru.<br>
case 2 → memanggil lihatHewan() untuk menampilkan daftar hewan.<br>
case 3 → memanggil ubahHewan() untuk mengedit data hewan tertentu.<br>
case 4 → memanggil hapusHewan() untuk menghapus data hewan tertentu.<br>
case 5 → menampilkan pesan keluar program.<br>
default → menangani input yang tidak valid (selain angka 1–5).<br>
<br>
<img width="742" height="914" alt="image" src="https://github.com/user-attachments/assets/fbda05bb-cff6-479e-aa4f-828475546523" />
<br>
Ini adalah class Hewan di package Model class Hewan ini adalah sebuah blueprint untuk merepresentasikan data hewan di kebun binatang. Class ini berada di dalam package model, yang memang khusus menyimpan representasi data atau objek. Di dalamnya terdapat empat properti yaitu nama, jenis, habitat, dan umur, semuanya menggunakan access modifier private agar tidak bisa diakses langsung dari luar class, melainkan melalui metode khusus. Untuk menginisialisasi objek baru, disediakan constructor yang menerima nilai awal dan menyimpannya ke dalam properti menggunakan this. Agar data tetap terjaga tetapi bisa diakses dan diubah, dibuatlah metode getter (ambilNama, ambilJenis, ambilHabitat, ambilUmur) untuk mengambil nilai, dan setter (ubahNama, ubahJenis, ubahHabitat, ubahUmur) untuk mengubah nilai. Terakhir, ada method toString() yang digunakan untuk menampilkan informasi hewan dalam format yang lebih mudah dibaca, karena jika tidak ditulis, ketika objek dicetak hanya akan muncul alamat memori seperti model.Hewan@300ffa5d. Dengan adanya toString(), data hewan bisa langsung terlihat jelas, misalnya Nama: Harimau | Jenis: Karnivora | Habitat: Hutan | Umur: 5 tahun.
<br>
<img width="561" height="629" alt="image" src="https://github.com/user-attachments/assets/4583a2bd-a5a5-4fdb-a98a-8835737becf5" />
<img width="637" height="742" alt="image" src="https://github.com/user-attachments/assets/6c56895b-6992-46df-861b-ce106eda44d4" />
<br>
class HewanService ini berada di package service yang berfungsi untuk menyimpan logika atau operasi CRUD (Create, Read, Update, Delete) terhadap data hewan. Di dalamnya ada ArrayList daftarHewan yang berfungsi sebagai wadah penyimpanan seluruh objek Hewan, serta Scanner input untuk membaca masukan dari pengguna.

Method pertama, tambahHewan(), digunakan untuk menambahkan data hewan baru. Program meminta pengguna mengisi nama, jenis, habitat, dan umur hewan, lalu membuat objek Hewan berdasarkan input tersebut, kemudian menambahkannya ke dalam daftarHewan.

Method kedua, lihatHewan(), digunakan untuk menampilkan seluruh daftar hewan. Jika daftarHewan kosong, akan ditampilkan pesan "Belum ada data hewan", tetapi jika ada, program akan mencetak semua hewan dengan nomor urut menggunakan perulangan for.

Method ketiga, ubahHewan(), berfungsi untuk memperbarui data hewan. Pertama, program menampilkan daftar hewan, kemudian meminta pengguna memilih nomor hewan yang ingin diubah. Jika nomor valid, program meminta data baru (nama, jenis, habitat, umur), membuat objek Hewan baru, lalu menggantikan data lama dengan data baru pada posisi yang dipilih.
Terakhir, hapusHewan() digunakan untuk menghapus data hewan. Program kembali menampilkan daftar hewan dan meminta pengguna memilih nomor yang ingin dihapus. Jika nomor valid, data hewan akan dihapus dari daftarHewan.
Secara keseluruhan, class ini menjadi “otak” yang menangani seluruh operasi terhadap data hewan, sedangkan class Main hanya menyediakan menu untuk memanggil method-method ini, dan class Hewan menyimpan struktur data hewannya.
