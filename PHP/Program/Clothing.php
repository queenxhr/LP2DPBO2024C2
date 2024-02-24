<?php
require_once 'Product.php';

class Clothing extends Product {
    protected $size; // Ukuran pakaian
    protected $material; // Bahan pakaian
    protected $gender; // Jenis kelamin pakaian

    // Konstruktor untuk inisialisasi objek pakaian
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender) {
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    // Getter untuk mendapatkan ukuran pakaian
    public function getSize() {
        return $this->size;
    }

    // Getter untuk mendapatkan bahan pakaian
    public function getMaterial() {
        return $this->material;
    }

    // Getter untuk mendapatkan jenis kelamin pakaian
    public function getGender() {
        return $this->gender;
    }

    // Setter untuk mengatur ukuran pakaian
    public function setSize($size) {
        $this->size = $size;
    }

    // Setter untuk mengatur bahan pakaian
    public function setMaterial($material) {
        $this->material = $material;
    }

    // Setter untuk mengatur jenis kelamin pakaian
    public function setGender($gender) {
        $this->gender = $gender;
    }

    // Method untuk mendapatkan informasi lengkap tentang pakaian
    public function getInfo() {
        return parent::getInfo() . ", Size: {$this->size}, Material: {$this->material}, Gender: {$this->gender}";
    }
}
?>
