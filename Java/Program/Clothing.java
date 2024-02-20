public class Clothing extends Product {
    protected String size;      // Ukuran pakaian
    protected String material;  // Bahan pakaian
    protected String gender;    // Jenis kelamin pakaian

    Clothing(){  // Konstruktor kosong
        
    }
    
    // Konstruktor
    public Clothing(String idProduct, String name, String brand, double price, String size, String material, String gender) {
        super(idProduct, name, brand, price);  // Memanggil konstruktor kelas induk dengan parameter yang sesuai
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    // Setter untuk ukuran pakaian
    public void setSize(String size) {
        this.size = size;
    }

    // Setter untuk bahan pakaian
    public void setMaterial(String material) {
        this.material = material;
    }

    // Setter untuk jenis kelamin pakaian
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter untuk ukuran pakaian
    public String getSize() {
        return size;
    }

    // Getter untuk bahan pakaian
    public String getMaterial() {
        return material;
    }

    // Getter untuk jenis kelamin pakaian
    public String getGender() {
        return gender;
    }
}
