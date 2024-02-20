public class Shirt extends Clothing {
    protected String color;        // Warna kemeja
    protected String sleeveType;   // Jenis lengan kemeja

    // Konstruktor
    public Shirt(String idProduct, String name, String brand, double price, String size, String material, String gender, String color, String sleeveType) {
        super(idProduct, name, brand, price, size, material, gender);  // Memanggil konstruktor kelas induk dengan parameter yang sesuai
        this.color = color;
        this.sleeveType = sleeveType;
    }

    // Setter untuk warna kemeja
    public void setColor(String color) {
        this.color = color;
    }

    // Setter untuk jenis lengan kemeja
    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    // Getter untuk warna kemeja
    public String getColor() {
        return color;
    }

    // Getter untuk jenis lengan kemeja
    public String getSleeveType() {
        return sleeveType;
    }
}
