# POSTTEST 1 PBO
# Manajemen Film dalam Bioskop

## Nama  : Yasmin Alya Aziza
## NIM   : 2309116036
## Kelas : A2

### Deskripsi Umum
Program manajemen film dalam bioskop ini dikembangkan untuk memenuhi kebutuhan pengelolaan daftar film secara efisien dan terorganisir. Dalam dunia perfilman yang terus berkembang, bioskop dan situs film perlu memiliki sistem yang memungkinkan pengguna untuk menambah, mengedit, menampilkan, dan menghapus film dengan mudah. Dengan program ini, pengguna dapat mengelola informasi film dan genre secara terstruktur, sehingga memudahkan dalam mencari dan menyajikan film kepada penonton. Dengan memisahkan logika ke dalam dua package (manajemen_film dan manajemen_genre), program menjadi lebih terstruktur dan mudah dikelola. Penggunaan method, constructor, percabangan, perulangan, dan koleksi seperti ArrayList berkontribusi pada fungsionalitas dan efisiensi program.

### Komponen Utama
Film dan Genre. Film mewakili informasi dasar tentang judul, tahun rilis, dan sutradara, sedangkan genre berfungsi sebagai kategori yang mengelompokkan film berdasarkan tema atau jenisnya.

### Struktur Program
Struktur program terdiri dari beberapa file yang terorganisir dalam folder (package). Dengan cara ini, kode menjadi lebih terstruktur dan mudah dikelola. Pada manajemen film ini terdapat menu utama untuk menjalankan program dan 2 Package yang berfungsi untuk memisahkan logika yang terkait dengan film.

#### File posttest1pbo.java (untuk menjalankan program)
- Fungsi: File ini berisi metode main, yang menjadi titik masuk untuk menjalankan program. Ini berfungsi untuk menampilkan menu pilihan kepada pengguna dan menangani interaksi.
- Percabangan: Menggunakan struktur switch untuk mengelola berbagai pilihan CRUD (Create, Read, Update, Delete). Misalnya, ketika pengguna memilih untuk menambahkan film baru, program akan menangani input tersebut.
- Perulangan: Menggunakan loop while untuk menjaga program tetap berjalan hingga pengguna memilih untuk keluar. Ini memungkinkan pengguna melakukan beberapa operasi tanpa harus menjalankan program berkali-kali.

#### Package
1. manajemen_film
   - Package ini berisi file Movie.java, yang menangani data dan logika terkait film.
   - Class: Movie, yaitu untuk menangani data film. Kelas ini memiliki beberapa properti untuk menyimpan informasi yang relevan untuk film, seperti judul, tahunRilis, dan sutradara.
   - Method & Constructor: Kelas ini memiliki constructor yang menginisialisasi objek Movie dengan nilai-nilai yang diberikan untuk setiap properti saat objek dibuat. Misalnya, saat pengguna menambahkan film baru, constructor akan dipanggil untuk membuat objek Movie.
     
2. manajemen_genrefilm
   - Package ini berisi file Genre.java, yang mengelola kategori film dan kumpulan film dalam genre tertentu.
   - Class: Genre, yaitu untuk menangani kumpulan film dalam kategori tertentu. Kelas ini berfungsi untuk menyimpan daftar film yang termasuk dalam genre tersebut.
   - Method & Constructor: Kelas ini juga memiliki constructor untuk menginisialisasi objek Genre, termasuk properti untuk menyimpan nama genre, deskripsi, dan daftar film.

### Output
