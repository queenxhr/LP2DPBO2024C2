#include <string>
#include "Product.cpp"
using namespace std;

class Clothing : public Product {
protected:
    string size;      // Ukuran pakaian
    string material;  // Bahan pakaian
    string gender;    // Jenis kelamin pakaian

public:
    Clothing() {}

    // Konstruktor
    Clothing(string idProduct, string name, string brand, double price, string size, string material, string gender) : Product(idProduct, name, brand, price) {
        this->size = size;
        this->material = material;
        this->gender = gender;
    }

    // Setter untuk ukuran pakaian
    void setSize(string size) {
        this->size = size;
    }

    // Setter untuk bahan pakaian
    void setMaterial(string material) {
        this->material = material;
    }

    // Setter untuk jenis kelamin pakaian
    void setGender(string gender) {
        this->gender = gender;
    }

    // Getter untuk ukuran pakaian
    string getSize() {
        return size;
    }

    // Getter untuk bahan pakaian
    string getMaterial() {
        return material;
    }

    // Getter untuk jenis kelamin pakaian
    string getGender() {
        return gender;
    }

    ~Clothing(){
        
    }
};
