# LP2DPBO2024C2

# Janji
Saya Ratu Syahirah Khairunnisa [2200978] 
mengerjakan Latihan Praktikum 2
dalam mata kuliah DPBO
untuk keberkahanNya maka saya tidak melakukan kecurangan 
seperti yang telah dispesifikasikan. 
Aamiin

# Bahasa yang dibahas Java

# Desain Kelas (Diagram)
![DIAGRAM LP2 drawio](https://github.com/queenxhr/LP2DPBO2024C2/assets/135084798/23b6c43c-5824-4b63-87bc-eb8f89eb8fff)

# Desain Program :
Desain program yang dirancang terdiri dari 4 file yaitu Product.java, Clothing.java, Shirt.java, dan Main.java

1. **Class `Product`:**
   - Representasi dasar dari sebuah produk.
   - Atribut: `idProduct`, `name`, `brand`, `price`.

2. **Class `Clothing` :**
   - Subclass dari `Product`.
   - Atribut: `size`, `material`, `gender`.

3. **Class `Shirt` :**
   - Subclass dari `Clothing`.
   - Menambahkan atribut: `color`, `sleeveType`.

4. **Class `Main`:**
   - Kelas utama yang berisi metode `main`.
   - Method `getUserInput`: Meminta input dari pengguna untuk membuat objek produk.
   - Method `displayProductDetails`: Menampilkan detail produk yang telah dimasukkan dalam bentuk tabel.
   - Method utilitas: `generateLine` untuk membuat baris pemisah, `getColumnMaxLength` untuk mendapatkan panjang maksimum kolom.

# Penjelasan Alur Program:

1. Program dimulai dari metode `main` di kelas `Main`.
2. Pengguna diminta untuk memasukkan jumlah produk yang ingin dimasukkan.
3. Jika jumlah produk kurang dari 3, program akan terus meminta hingga jumlah produk yang dimasukkan minimal 3.
4. Setelah jumlah produk yang valid dimasukkan, metode `getUserInput` dipanggil untuk meminta detail produk dari pengguna.
5. Setiap detail produk dimasukkan ke dalam ArrayList.
6. Setelah semua produk dimasukkan, metode `displayProductDetails` dipanggil untuk menampilkan detail produk.
7. Program menentukan panjang maksimum untuk setiap kolom.
8. Detail produk ditampilkan dalam bentuk tabel dengan menyesuaikan panjang maksimum yang sudah ditentukan (panjang header tabel dan inputan user).
9. Program selesai.

# Dokumentasi
<img width="530" alt="PRODUCT JAVA" src="https://github.com/queenxhr/LP2DPBO2024C2/assets/135084798/c7c7b59f-9da9-4f15-acc4-bc1a52ff40be">

