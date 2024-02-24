#include <string>
#include "Clothing.cpp"
using namespace std;

class Shirt : public Clothing {
protected:
    string color;        // Warna kemeja
    string sleeveType;   // Jenis lengan kemeja

public:
    // Konstruktor
    Shirt(string idProduct, string name, string brand, double price, string size, string material, string gender, string color, string sleeveType) : Clothing(idProduct, name, brand, price, size, material, gender) {
        this->color = color;
        this->sleeveType = sleeveType;
    }

    // Setter untuk warna kemeja
    void setColor(string color) {
        this->color = color;
    }

    // Setter untuk jenis lengan kemeja
    void setSleeveType(string sleeveType) {
        this->sleeveType = sleeveType;
    }

    // Getter untuk warna kemeja
    string getColor() {
        return color;
    }

    // Getter untuk jenis lengan kemeja
    string getSleeveType() {
        return sleeveType;
    }

    ~Shirt(){

    }
};
