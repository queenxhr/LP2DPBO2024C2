#include <iostream>
#include <iomanip>
#include <vector>
#include "Shirt.cpp" // Mengimpor definisi kelas Shirt
using namespace std;

// Deklarasi fungsi-fungsi
void getUserInput(vector<Product*>& products, int numberOfProducts); // Fungsi untuk mendapatkan input pengguna
void displayProductDetails(vector<Product*>& products); // Fungsi untuk menampilkan detail produk

int main() {
    vector<Product*> products; // Vektor untuk menyimpan pointer ke objek produk

    int numberOfProducts;
    do {
        cout << "Enter the number of products (minimum 3): ";
        cin >> numberOfProducts; // Meminta pengguna untuk memasukkan jumlah produk
        cin.ignore(); // Menghapus buffer input
        if (numberOfProducts < 3) {
            cout << "Please enter a minimum of 3 products." << endl; // Meminta pengguna untuk memasukkan jumlah produk yang valid jika kurang dari 3
        }
    } while (numberOfProducts < 3); // Loop sampai jumlah produk yang valid dimasukkan

    getUserInput(products, numberOfProducts); // Memanggil fungsi untuk mendapatkan detail produk dari pengguna

    displayProductDetails(products); // Memanggil fungsi untuk menampilkan detail produk

    // Membersihkan memori yang dialokasikan secara dinamis
    for (Product* product : products) {
        delete product;
    }

    return 0;
}

void getUserInput(vector<Product*>& products, int numberOfProducts) {
    for (int i = 0; i < numberOfProducts; i++) {
        cout << "Enter details for Product " << (i + 1) << ":" << endl; // Meminta pengguna untuk memasukkan detail produk
        string id, name, brand, size, material, gender, color, sleeveType;
        double price;

        cout << "ID: ";
        getline(cin, id);
        cout << "Name: ";
        getline(cin, name);
        cout << "Brand: ";
        getline(cin, brand);
        cout << "Price: ";
        cin >> price;
        cin.ignore(); // Menghapus buffer input
        cout << "Size: ";
        getline(cin, size);
        cout << "Material: ";
        getline(cin, material);
        cout << "Gender: ";
        getline(cin, gender);
        cout << "Color: ";
        getline(cin, color);
        cout << "Sleeve Type: ";
        getline(cin, sleeveType);

        // Menambahkan objek Shirt ke vektor produk
        products.push_back(new Shirt(id, name, brand, price, size, material, gender, color, sleeveType));
    }
}

void displayProductDetails(vector<Product*>& products) {
    // Menghitung lebar maksimum kolom
    int idWidth = 4; // Lebar minimum untuk kolom ID
    int nameWidth = 4; // Lebar minimum untuk kolom Nama
    int brandWidth = 5; // Lebar minimum untuk kolom Merek
    int priceWidth = 5; // Lebar minimum untuk kolom Harga
    int sizeWidth = 4; // Lebar minimum untuk kolom Ukuran
    int materialWidth = 8; // Lebar minimum untuk kolom Material
    int genderWidth = 6; // Lebar minimum untuk kolom Gender
    int colorWidth = 5; // Lebar minimum untuk kolom Warna
    int sleeveTypeWidth = 10; // Lebar minimum untuk kolom Jenis Lengan

    // Menemukan lebar maksimum untuk setiap kolom
    for (Product* product : products) {
        idWidth = max(idWidth, (int)product->getIdProduct().length());
        nameWidth = max(nameWidth, (int)product->getName().length());
        brandWidth = max(brandWidth, (int)product->getBrand().length());
        priceWidth = max(priceWidth, (int)to_string(static_cast<int>(product->getPrice())).length());
        if (Shirt* shirt = dynamic_cast<Shirt*>(product)) {
            sizeWidth = max(sizeWidth, (int)shirt->getSize().length());
            materialWidth = max(materialWidth, (int)shirt->getMaterial().length());
            genderWidth = max(genderWidth, (int)shirt->getGender().length());
            colorWidth = max(colorWidth, (int)shirt->getColor().length());
            sleeveTypeWidth = max(sleeveTypeWidth, (int)shirt->getSleeveType().length());
        }
    }

    // Menampilkan garis atas tabel
    cout << "+" << string(idWidth + 2, '-') << "+"
         << string(nameWidth + 2, '-') << "+"
         << string(brandWidth + 2, '-') << "+"
         << string(priceWidth + 2, '-') << "+"
         << string(sizeWidth + 2, '-') << "+"
         << string(materialWidth + 2, '-') << "+"
         << string(genderWidth + 2, '-') << "+"
         << string(colorWidth + 2, '-') << "+"
         << string(sleeveTypeWidth + 2, '-') << "+" << endl;

    // Menampilkan baris header
    cout << "|" << setw(idWidth + 2) << left << " ID"
         << "|" << setw(nameWidth + 2) << left << " Name"
         << "|" << setw(brandWidth + 2) << left << " Brand"
         << "|" << setw(priceWidth + 2) << left << " Price"
         << "|" << setw(sizeWidth + 2) << left << " Size"
         << "|" << setw(materialWidth + 2) << left << " Material"
         << "|" << setw(genderWidth + 2) << left << " Gender"
         << "|" << setw(colorWidth + 2) << left << " Color"
         << "|" << setw(sleeveTypeWidth + 2) << left << " Sleeve Type" << "|" << endl;

    // Menampilkan garis tengah tabel
    cout << "+" << string(idWidth + 2, '-') << "+"
         << string(nameWidth + 2, '-') << "+"
         << string(brandWidth + 2, '-') << "+"
         << string(priceWidth + 2, '-') << "+"
         << string(sizeWidth + 2, '-') << "+"
         << string(materialWidth + 2, '-') << "+"
         << string(genderWidth + 2, '-') << "+"
         << string(colorWidth + 2, '-') << "+"
         << string(sleeveTypeWidth + 2, '-') << "+" << endl;

    // Menampilkan detail produk
    for (Product* product : products) {
        cout << "|" << setw(idWidth + 2) << left << " " + product->getIdProduct()
             << "|" << setw(nameWidth + 2) << left << " " + product->getName()
             << "|" << setw(brandWidth + 2) << left << " " + product->getBrand()
             << "|" << setw(priceWidth + 2) << left << fixed << setprecision(0) << product->getPrice()
             << "|" << setw(sizeWidth + 2) << left << " " + (dynamic_cast<Shirt*>(product) ? dynamic_cast<Shirt*>(product)->getSize() : "")
             << "|" << setw(materialWidth + 2) << left << " " + (dynamic_cast<Shirt*>(product) ? dynamic_cast<Shirt*>(product)->getMaterial() : "")
             << "|" << setw(genderWidth + 2) << left << " " + (dynamic_cast<Shirt*>(product) ? dynamic_cast<Shirt*>(product)->getGender() : "")
             << "|" << setw(colorWidth + 2) << left << " " + (dynamic_cast<Shirt*>(product) ? dynamic_cast<Shirt*>(product)->getColor() : "")
             << "|" << setw(sleeveTypeWidth + 2) << left << " " + (dynamic_cast<Shirt*>(product) ? dynamic_cast<Shirt*>(product)->getSleeveType() : "") << "|" << endl;
    }

    // Menampilkan garis bawah tabel
    cout << "+" << string(idWidth + 2, '-') << "+"
         << string(nameWidth + 2, '-') << "+"
         << string(brandWidth + 2, '-') << "+"
         << string(priceWidth + 2, '-') << "+"
         << string(sizeWidth + 2, '-') << "+"
         << string(materialWidth + 2, '-') << "+"
         << string(genderWidth + 2, '-') << "+"
         << string(colorWidth + 2, '-') << "+"
         << string(sleeveTypeWidth + 2, '-') << "+" << endl;
}
