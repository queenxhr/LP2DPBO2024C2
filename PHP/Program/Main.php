<?php
require_once 'Shirt.php';

class Main {
    // Method untuk menampilkan daftar produk dalam bentuk tabel
    public static function displayProductsTable($products) {
        echo "<h2>Products List</h2>";
        echo "<div style='margin:auto;'>";
        echo "<table border='1'>";
        echo "<tr><th>ID</th><th>Name</th><th>Brand</th><th>Price</th><th>Size</th><th>Material</th><th>Gender</th><th>Color</th><th>Sleeve Type</th></tr>";
        foreach ($products as $product) {
            echo "<tr>";
            echo "<td>".$product->getIdProduct()."</td>";
            echo "<td>".$product->getName()."</td>";
            echo "<td>".$product->getBrand()."</td>";
            echo "<td>".$product->formatPrice()."</td>";

            if ($product instanceof Clothing) {
                echo "<td>".$product->getSize()."</td>";
                echo "<td>".$product->getMaterial()."</td>";
                echo "<td>".$product->getGender()."</td>";
            } else {
                echo "<td colspan='3'></td>"; // For non-clothing products, span three columns
            }

            if ($product instanceof Shirt) {
                echo "<td>".$product->getColor()."</td>";
                echo "<td>".$product->getSleeveType()."</td>";
            } else {
                echo "<td colspan='2'></td>"; // For non-shirt clothing, span two columns
            }

            echo "</tr>";
        }
        echo "</table>";
        echo "</div>";
    }
}

// Pembuatan objek-objek kemeja
$shirt1 = new Shirt("A1", "T-Shirt", "Nike", 299000, "M", "Cotton", "Male", "Red", "Short");
$shirt2 = new Shirt("A2", "Polo Shirt", "POLO", 399000, "L", "Polyester", "Male", "Blue", "Long");
$shirt3 = new Shirt("A3", "Blouse", "Zara", 199000, "S", "Silk", "Female", "White", "Long");

$products = array($shirt1, $shirt2, $shirt3);

// Menampilkan daftar produk dalam bentuk tabel
Main::displayProductsTable($products);
?>

