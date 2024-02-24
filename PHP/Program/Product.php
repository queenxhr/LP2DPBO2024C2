<?php
class Product {
    protected $idProduct; // ID produk
    protected $name; // Nama produk
    protected $brand; // Merek produk
    protected $price; // Harga produk

    // Konstruktor untuk inisialisasi objek produk
    public function __construct($idProduct, $name, $brand, $price) {
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    // Method untuk memformat harga ke dalam format Rupiah
    public function formatPrice() {
        return "Rp " . number_format($this->price, 0, ',', '.');
    }

    // Getter untuk mendapatkan ID produk
    public function getIdProduct() {
        return $this->idProduct;
    }

    // Getter untuk mendapatkan nama produk
    public function getName() {
        return $this->name;
    }

    // Getter untuk mendapatkan merek produk
    public function getBrand() {
        return $this->brand;
    }

    // Getter untuk mendapatkan harga produk
    public function getPrice() {
        return $this->price;
    }

    // Setter untuk mengatur ID produk
    public function setIdProduct($idProduct) {
        $this->idProduct = $idProduct;
    }

    // Setter untuk mengatur nama produk
    public function setName($name) {
        $this->name = $name;
    }

    // Setter untuk mengatur merek produk
    public function setBrand($brand) {
        $this->brand = $brand;
    }

    // Setter untuk mengatur harga produk
    public function setPrice($price) {
        $this->price = $price;
    }

    // Method untuk mendapatkan informasi lengkap tentang produk
    public function getInfo() {
        return "ID: {$this->idProduct}, Name: {$this->name}, Brand: {$this->brand}, Price: {$this->formatPrice()}";
    }
}
?>
