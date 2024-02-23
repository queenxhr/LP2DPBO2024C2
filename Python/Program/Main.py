# Import kelas Shirt dari modul Shirt
from Shirt import Shirt

# Fungsi untuk mendapatkan input dari pengguna
def getUserInput(products, numberOfProducts):
    # Loop untuk meminta detail produk sejumlah numberOfProducts
    for i in range(numberOfProducts):
        print(f"Enter details for Product {i + 1}:")  # Menampilkan pesan untuk meminta detail produk
        id = input("ID: ")  # Meminta ID produk dari pengguna
        name = input("Name: ")  # Meminta nama produk dari pengguna
        brand = input("Brand: ")  # Meminta merek produk dari pengguna
        price = float(input("Price: "))  # Meminta harga produk dari pengguna
        size = input("Size: ")  # Meminta ukuran produk dari pengguna
        material = input("Material: ")  # Meminta bahan produk dari pengguna
        gender = input("Gender: ")  # Meminta jenis kelamin produk dari pengguna
        color = input("Color: ")  # Meminta warna produk dari pengguna
        sleeveType = input("Sleeve Type: ")  # Meminta jenis lengan produk dari pengguna
        # Menambahkan objek Shirt baru ke dalam daftar produk
        products.append(Shirt(id, name, brand, price, size, material, gender, color, sleeveType))

# Fungsi untuk menampilkan detail produk dalam bentuk tabel
def displayProductDetails(products):
    # Header tabel
    headers = ["ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"]

    # Menghitung panjang maksimum untuk setiap kolom
    max_lengths = [len(header) for header in headers]
    for product in products:
        for i, attribute in enumerate([product.getIdProduct(), product.getName(), product.getBrand(), "{:.2f}".format(product.getPrice()).rstrip('0').rstrip('.'), product.getSize(), product.getMaterial(), product.getGender(), product.getColor(), product.getSleeveType()]):
            max_lengths[i] = max(max_lengths[i], len(str(attribute)))

    # Menampilkan garis pembatas antara header dan data
    print_table_separator(max_lengths)
    # Menampilkan baris header tabel
    print_row(headers, max_lengths)
    # Menampilkan garis pembatas antara header dan data
    print_table_separator(max_lengths)

    # Menampilkan data produk
    for product in products:
        print_row([product.getIdProduct(), product.getName(), product.getBrand(), "{:.2f}".format(product.getPrice()).rstrip('0').rstrip('.'), product.getSize(), product.getMaterial(), product.getGender(), product.getColor(), product.getSleeveType()], max_lengths)

    # Menampilkan garis pembatas antara data dan footer
    print_table_separator(max_lengths)

# Fungsi untuk menampilkan baris tabel
def print_row(data, max_lengths):
    row = "|"
    for i, item in enumerate(data):
        row += " {:<{}} |".format(item, max_lengths[i] + 2)
    print(row)

# Fungsi untuk menampilkan garis pembatas antara setiap baris tabel
def print_table_separator(max_lengths):
    separator = "+"
    for length in max_lengths:
        separator += "-" * (length + 4) + "+"
    print(separator)

# Fungsi utama
def main():
    products = []  # Inisialisasi daftar produk kosong

    # Meminta input jumlah produk dari pengguna
    numberOfProducts = int(input("Enter the number of products (minimum 3): "))
    # Validasi jumlah produk
    while numberOfProducts < 3:
        print("Please enter a minimum of 3 products.")
        numberOfProducts = int(input("Enter the number of products (minimum 3): "))

    # Mendapatkan input produk dari pengguna
    getUserInput(products, numberOfProducts)
    # Menampilkan detail produk
    displayProductDetails(products)

# Memastikan bahwa fungsi main() dijalankan jika file dieksekusi secara langsung
if __name__ == "__main__":
    main()
