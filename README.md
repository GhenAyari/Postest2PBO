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
