#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Product {
protected:
    string idProduct;  // ID produk
    string name;       // Nama produk
    string brand;      // Merek produk
    double price;      // Harga produk

public:
    Product() {}

    // Konstruktor
    Product(string idProduct, string name, string brand, double price) {
        this->idProduct = idProduct;
        this->name = name;
        this->brand = brand;
        this->price = price;
    }

    // Setter untuk ID produk
    void setIdProduct(string idProduct) {
        this->idProduct = idProduct;
    }

    // Setter untuk nama produk
    void setName(string name) {
        this->name = name;
    }

    // Setter untuk merek produk
    void setBrand(string brand) {
        this->brand = brand;
    }

    // Setter untuk harga produk
    void setPrice(double price) {
        this->price = price;
    }

    // Getter untuk ID produk
    string getIdProduct() {
        return idProduct;
    }

    // Getter untuk nama produk
    string getName() {
        return name;
    }

    // Getter untuk merek produk
    string getBrand() {
        return brand;
    }

    // Getter untuk harga produk
    double getPrice() {
        return price;
    }
    // Fungsi virtual kosong untuk membuat kelas menjadi polimorfik
    virtual void dummy() {}
    ~Product(){

    }
};
