# POSTTEST 2 PBO
# Manajemen Film dalam Bioskop

## Nama  : Yasmin Alya Aziza
## NIM   : 2309116036
## Kelas : A2

### Deskripsi Umum
Program manajemen film dalam bioskop ini dikembangkan untuk memenuhi kebutuhan pengelolaan daftar film secara efisien dan terorganisir. Dalam dunia perfilman yang terus berkembang, bioskop dan situs film perlu memiliki sistem yang memungkinkan pengguna untuk menambah, mengedit, menampilkan, dan menghapus film dengan mudah. Dengan program ini, pengguna dapat mengelola informasi film dan genre secara terstruktur, sehingga memudahkan dalam mencari dan menyajikan film kepada penonton. Dengan memisahkan logika ke dalam dua package (manajemen_film dan manajemen_genre), program menjadi lebih terstruktur dan mudah dikelola. Penggunaan method, constructor, percabangan, perulangan, koleksi seperti ArrayList, inheritance, encapsulation, abstraction, interface, dan final keyword berkontribusi pada fungsionalitas dan efisiensi program.

### Komponen Utama
Film dan Genre. Film mewakili informasi dasar tentang judul, tahun rilis, dan sutradara, sedangkan genre berfungsi sebagai kategori yang mengelompokkan film berdasarkan tema atau jenisnya.

### Struktur Program
Struktur program terdiri dari beberapa file yang terorganisir dalam folder (package). Dengan cara ini, kode menjadi lebih terstruktur dan mudah dikelola. Pada manajemen film ini terdapat menu utama untuk menjalankan program dan 3 Package yang berfungsi untuk memisahkan logika yang terkait dengan film. Berikut adalah 3 Package utama:

#### 1. Package MainBioskop
- Package ini berisi kelas utama yang menghubungkan dan mengelola interaksi antara aplikasi dengan pengguna aplikasi.
- Percabangan: Menggunakan struktur switch untuk mengelola berbagai pilihan CRUD (Create, Read, Update, Delete). Misalnya, ketika pengguna memilih untuk menambahkan film baru, program akan menangani input tersebut.
- Perulangan: Menggunakan loop while untuk menjaga program tetap berjalan hingga pengguna memilih untuk keluar. Ini memungkinkan pengguna melakukan beberapa operasi tanpa harus menjalankan program berkali-kali.

##### Kelas: Bioskop
Fungsi: File ini berisi metode main, yang menjadi titik masuk untuk menjalankan program. Ini berfungsi untuk menampilkan menu pilihan kepada pengguna dan menangani interaksi.

##### Metode Utama:
- public static void main(String[] args) : Metode ini menjalankan program utama yang menangani input dari pengguna untuk operasi CRUD yang bisa melakukan looping, yaitu kembali ke menu utama.

#### 2. Package manajemen_film

#### 3. Package manajemen_genrefilm

============================================================================


#### Package
1. manajemen_film
   - Package ini berisi file Movie.java, yang menangani data dan logika terkait film.
   - Class: Movie, yaitu untuk menangani data film. Kelas ini memiliki beberapa properti untuk menyimpan informasi yang relevan untuk film, seperti judul, tahunRilis, dan sutradara.
   - Method & Constructor: Kelas ini memiliki constructor yang menginisialisasi objek Movie dengan nilai-nilai yang diberikan untuk setiap properti saat objek dibuat. Misalnya, saat pengguna menambahkan film baru, constructor akan dipanggil untuk membuat objek Movie.
     
2. manajemen_genrefilm
   - Package ini berisi file Genre.java, yang mengelola kategori film dan kumpulan film dalam genre tertentu.
   - Class: Genre, yaitu untuk menangani kumpulan film dalam kategori tertentu. Kelas ini berfungsi untuk menyimpan daftar film yang termasuk dalam genre tersebut.
   - Method & Constructor: Kelas ini juga memiliki constructor untuk menginisialisasi objek Genre, termasuk properti untuk menyimpan nama genre, deskripsi, dan daftar film.
============================================================================

### Output
1. Menu Utama

   ![Screenshot 2024-09-30 030122](https://github.com/user-attachments/assets/1e7d9ebc-6f82-4ebc-aaa3-72e094d2393c)

2. Pilih Opsi
   1) Opsi 1
      Tambah film

      ![image](https://github.com/user-attachments/assets/6383fc93-87f6-48b0-98f9-bf563d68e6e2)

      Looping ke menu utama

      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)

   2) Opsi 2
      Tampilkan daftar film

      ![image](https://github.com/user-attachments/assets/d41fb9cb-c693-4931-94f3-c26a30ec14c5)

      Looping ke menu utama
      
      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)
      
   3) Opsi 3
      Hapus film
  
      ![image](https://github.com/user-attachments/assets/e59c56d9-ff62-476a-8158-c523e43c21bd)

      Looping ke menu utama
      
      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)

      
   5) Opsi 4
      Update film
  
      ![image](https://github.com/user-attachments/assets/ae7be4d7-3d9e-4647-875b-22692ffcb260)

      Looping ke menu utama
      
      ![image](https://github.com/user-attachments/assets/5794877a-b0ae-4094-bd1c-af6309c41e1c)

      
   7) Opsi 5
      Keluar

      ![image](https://github.com/user-attachments/assets/9481e90c-fce3-4fa5-a4eb-204f31ce6e9b)
