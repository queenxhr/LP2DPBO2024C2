public class Product {
    protected String idProduct;  // ID produk
    protected String name;       // Nama produk
    protected String brand;      // Merek produk
    protected double price;      // Harga produk

    Product(){  // Konstruktor kosong
        
    }
    
    // Konstruktor
    public Product(String idProduct, String name, String brand, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Setter untuk ID produk
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    // Setter untuk nama produk
    public void setName(String name) {
        this.name = name;
    }

    // Setter untuk merek produk
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Setter untuk harga produk
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter untuk ID produk
    public String getIdProduct() {
        return idProduct;
    }

    // Getter untuk nama produk
    public String getName() {
        return name;
    }

    // Getter untuk merek produk
    public String getBrand() {
        return brand;
    }

    // Getter untuk harga produk
    public double getPrice() {
        return price;
    }
}
