import java.util.ArrayList; // Mengimpor kelas ArrayList dari paket java.util
import java.util.Scanner; // Mengimpor kelas Scanner dari paket java.util

public class Main { // Deklarasi kelas Main
    public static void main(String[] args) { // Deklarasi method main
        ArrayList<Product> products = new ArrayList<>(); // Membuat objek ArrayList untuk menyimpan produk

        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna

        int numberOfProducts; // Deklarasi variabel numberOfProducts
        do { // Memulai do-while loop
            System.out.print("Enter the number of products (minimum 3): "); // Menampilkan pesan untuk meminta jumlah produk
            numberOfProducts = scanner.nextInt(); // Membaca jumlah produk dari pengguna
            scanner.nextLine(); // Konsumsi karakter newline

            if (numberOfProducts < 3) { // Pengecekan apakah jumlah produk kurang dari 3
                System.out.println("Please enter a minimum of 3 products."); // Menampilkan pesan kesalahan jika kurang dari 3
            }
        } while (numberOfProducts < 3); // Loop akan berlanjut selama jumlah produk kurang dari 3

        // Memasukkan data untuk jumlah produk yang ditentukan
        getUserInput(products, numberOfProducts);

        // Menampilkan data dari semua objek Shirt
        displayProductDetails(products);
    }

    public static void getUserInput(ArrayList<Product> products, int numberOfProducts) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna

        for (int i = 0; i < numberOfProducts; i++) { // Loop untuk meminta input untuk setiap produk
            System.out.println("Enter details for Product " + (i + 1) + ":"); // Menampilkan pesan untuk meminta detail produk
            System.out.print("ID: "); // Menampilkan pesan untuk meminta ID produk
            String id = scanner.nextLine(); // Membaca ID produk dari pengguna
            System.out.print("Name: "); // Menampilkan pesan untuk meminta nama produk
            String name = scanner.nextLine(); // Membaca nama produk dari pengguna
            System.out.print("Brand: "); // Menampilkan pesan untuk meminta merek produk
            String brand = scanner.nextLine(); // Membaca merek produk dari pengguna
            System.out.print("Price: "); // Menampilkan pesan untuk meminta harga produk
            double price = scanner.nextDouble(); // Membaca harga produk dari pengguna
            scanner.nextLine(); // Konsumsi karakter newline
            System.out.print("Size: "); // Menampilkan pesan untuk meminta ukuran produk
            String size = scanner.nextLine(); // Membaca ukuran produk dari pengguna
            System.out.print("Material: "); // Menampilkan pesan untuk meminta bahan produk
            String material = scanner.nextLine(); // Membaca bahan produk dari pengguna
            System.out.print("Gender: "); // Menampilkan pesan untuk meminta jenis kelamin produk
            String gender = scanner.nextLine(); // Membaca jenis kelamin produk dari pengguna
            System.out.print("Color: "); // Menampilkan pesan untuk meminta warna produk
            String color = scanner.nextLine(); // Membaca warna produk dari pengguna
            System.out.print("Sleeve Type: "); // Menampilkan pesan untuk meminta jenis lengan produk
            String sleeveType = scanner.nextLine(); // Membaca jenis lengan produk dari pengguna

            // Menambahkan produk baru ke dalam ArrayList
            products.add(new Shirt(id, name, brand, price, size, material, gender, color, sleeveType));
        }
    }

    public static void displayProductDetails(ArrayList<Product> products) { // Deklarasi method untuk menampilkan detail produk
        // Menentukan panjang maksimum untuk setiap kolom
        int idMaxLength = Math.max(2, getColumnMaxLength(products, "ID")); // Panjang minimum untuk kolom ID
        int nameMaxLength = Math.max(4, getColumnMaxLength(products, "Name")); // Panjang minimum untuk kolom Name
        int brandMaxLength = Math.max(5, getColumnMaxLength(products, "Brand")); // Panjang minimum untuk kolom Brand
        int priceMaxLength = Math.max(5, getColumnMaxLength(products, "Price")); // Panjang minimum untuk kolom Price
        int sizeMaxLength = Math.max(4, getColumnMaxLength(products, "Size")); // Panjang minimum untuk kolom Size
        int materialMaxLength = Math.max(8, getColumnMaxLength(products, "Material")); // Panjang minimum untuk kolom Material
        int genderMaxLength = Math.max(6, getColumnMaxLength(products, "Gender")); // Panjang minimum untuk kolom Gender
        int colorMaxLength = Math.max(5, getColumnMaxLength(products, "Color")); // Panjang minimum untuk kolom Color
        int sleeveTypeMaxLength = Math.max(10, getColumnMaxLength(products, "Sleeve Type")); // Panjang minimum untuk kolom Sleeve Type

        // Variabel tambahan untuk menyimpan panjang maksimum setiap atribut
        for (Product product : products) { // Loop untuk menghitung panjang maksimum setiap atribut
            if (product.getIdProduct().length() > idMaxLength) { // Perbandingan panjang ID produk
                idMaxLength = product.getIdProduct().length(); // Memperbarui panjang maksimum ID
            }
            if (product.getName().length() > nameMaxLength) { // Perbandingan panjang nama produk
                nameMaxLength = product.getName().length(); // Memperbarui panjang maksimum nama
            }
            if (product.getBrand().length() > brandMaxLength) { // Perbandingan panjang merek produk
                brandMaxLength = product.getBrand().length(); // Memperbarui panjang maksimum merek
            }
            String priceString = String.format("%.2f", product.getPrice()).replace(".00", ""); // Format harga produk
            if (priceString.length() > priceMaxLength) { // Perbandingan panjang harga produk
                priceMaxLength = priceString.length(); // Memperbarui panjang maksimum harga
            }
            if (((Shirt) product).getSize().length() > sizeMaxLength) { // Perbandingan panjang ukuran produk (hanya untuk produk Shirt)
                sizeMaxLength = ((Shirt) product).getSize().length(); // Memperbarui panjang maksimum ukuran
            }
            if (((Shirt) product).getMaterial().length() > materialMaxLength) { // Perbandingan panjang bahan produk (hanya untuk produk Shirt)
                materialMaxLength = ((Shirt) product).getMaterial().length(); // Memperbarui panjang maksimum bahan
            }
            if (((Shirt) product).getGender().length() > genderMaxLength) { // Perbandingan panjang jenis kelamin produk (hanya untuk produk Shirt)
                genderMaxLength = ((Shirt) product).getGender().length(); // Memperbarui panjang maksimum jenis kelamin
            }
            if (((Shirt) product).getColor().length() > colorMaxLength) { // Perbandingan panjang warna produk (hanya untuk produk Shirt)
                colorMaxLength = ((Shirt) product).getColor().length(); // Memperbarui panjang maksimum warna
            }
            if (((Shirt) product).getSleeveType().length() > sleeveTypeMaxLength) { // Perbandingan panjang jenis lengan produk (hanya untuk produk Shirt)
                sleeveTypeMaxLength = ((Shirt) product).getSleeveType().length(); // Memperbarui panjang maksimum jenis lengan
            }
        }

        // Menampilkan header tabel
        System.out.println("+-" + generateLine('-', idMaxLength) + "-+-" + generateLine('-', nameMaxLength) + "-+-" +
                generateLine('-', brandMaxLength) + "-+-" + generateLine('-', priceMaxLength) + "-+-" +
                generateLine('-', sizeMaxLength) + "-+-" + generateLine('-', materialMaxLength) + "-+-" +
                generateLine('-', genderMaxLength) + "-+-" + generateLine('-', colorMaxLength) + "-+-" +
                generateLine('-', sleeveTypeMaxLength) + "-+");

        System.out.printf("| %-" + idMaxLength + "s | %-" + nameMaxLength + "s | %-" + brandMaxLength + "s | %-" +
                priceMaxLength + "s | %-" + sizeMaxLength + "s | %-" + materialMaxLength + "s | %-" +
                genderMaxLength + "s | %-" + colorMaxLength + "s | %-" + sleeveTypeMaxLength + "s |%n",
                "ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");

        // Menampilkan baris pemisah antara header dan data
        System.out.println("+-" + generateLine('-', idMaxLength) + "-+-" + generateLine('-', nameMaxLength) + "-+-" +
                generateLine('-', brandMaxLength) + "-+-" + generateLine('-', priceMaxLength) + "-+-" +
                generateLine('-', sizeMaxLength) + "-+-" + generateLine('-', materialMaxLength) + "-+-" +
                generateLine('-', genderMaxLength) + "-+-" + generateLine('-', colorMaxLength) + "-+-" +
                generateLine('-', sleeveTypeMaxLength) + "-+");

        // Menampilkan data produk
        for (Product product : products) { // Loop untuk menampilkan detail produk
            if (product instanceof Shirt) { // Pengecekan apakah produk adalah jenis Shirt
                Shirt shirt = (Shirt) product; // Mengkonversi produk menjadi objek Shirt
                String priceString = String.format("%.2f", shirt.getPrice()).replace(".00", ""); // Format harga produk
                System.out.printf("| %-" + idMaxLength + "s | %-" + nameMaxLength + "s | %-" + brandMaxLength +
                        "s | %-" + priceMaxLength + "s | %-" + sizeMaxLength + "s | %-" + materialMaxLength +
                        "s | %-" + genderMaxLength + "s | %-" + colorMaxLength + "s | %-" + sleeveTypeMaxLength +
                        "s |%n", shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), priceString,
                        shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType());
            }
        }

        // Menampilkan baris penutup tabel
        System.out.println("+-" + generateLine('-', idMaxLength) + "-+-" + generateLine('-', nameMaxLength) + "-+-" +
                generateLine('-', brandMaxLength) + "-+-" + generateLine('-', priceMaxLength) + "-+-" +
                generateLine('-', sizeMaxLength) + "-+-" + generateLine('-', materialMaxLength) + "-+-" +
                generateLine('-', genderMaxLength) + "-+-" + generateLine('-', colorMaxLength) + "-+-" +
                generateLine('-', sleeveTypeMaxLength) + "-+");
    }

    // Method untuk menghasilkan string berisi karakter yang diulang sebanyak n kali
    public static String generateLine(char c, int length) { // Deklarasi method generateLine
        return String.format("%-" + length + "s", "").replace(' ', c); // Mengembalikan string dengan karakter yang diulang sebanyak n kali
    }

    // Method untuk mendapatkan panjang maksimum dari suatu kolom dalam daftar anggota DPR
    public static int getColumnMaxLength(ArrayList<Product> products, String columnName) { // Deklarasi method getColumnMaxLength
        int maxLength = columnName.length(); // Panjang awal kolom adalah panjang nama kolom itu sendiri
        for (Product product : products) { // Loop untuk setiap produk dalam daftar
            switch (columnName) { // Switch statement untuk memeriksa nama kolom
                case "ID": // Jika nama kolom adalah "ID"
                    maxLength = Math.max(maxLength, product.getIdProduct().length()); // Bandingkan dan perbarui panjang maksimum
                    break;
                case "Name": // Jika nama kolom adalah "Name"
                    maxLength = Math.max(maxLength, product.getName().length()); // Bandingkan dan perbarui panjang maksimum
                    break;
                case "Brand": // Jika nama kolom adalah "Brand"
                    maxLength = Math.max(maxLength, product.getBrand().length()); // Bandingkan dan perbarui panjang maksimum
                    break;
                case "Size": // Jika nama kolom adalah "Size"
                    maxLength = Math.max(maxLength, ((Shirt) product).getSize().length()); // Bandingkan dan perbarui panjang maksimum (hanya untuk produk Shirt)
                    break;
                case "Material": // Jika nama kolom adalah "Material"
                    maxLength = Math.max(maxLength, ((Shirt) product).getMaterial().length()); // Bandingkan dan perbarui panjang maksimum (hanya untuk produk Shirt)
                    break;
                case "Gender": // Jika nama kolom adalah "Gender"
                    maxLength = Math.max(maxLength, ((Shirt) product).getGender().length()); // Bandingkan dan perbarui panjang maksimum (hanya untuk produk Shirt)
                    break;
                case "Color": // Jika nama kolom adalah "Color"
                    maxLength = Math.max(maxLength, ((Shirt) product).getColor().length()); // Bandingkan dan perbarui panjang maksimum (hanya untuk produk Shirt)
                    break;
                case "Sleeve Type": // Jika nama kolom adalah "Sleeve Type"
                    maxLength = Math.max(maxLength, ((Shirt) product).getSleeveType().length()); // Bandingkan dan perbarui panjang maksimum (hanya untuk produk Shirt)
                    break;
            }
        }
        return maxLength; // Mengembalikan panjang maksimum
    }
}
