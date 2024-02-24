<?php
require_once 'Clothing.php';

class Shirt extends Clothing {
    protected $color; // Warna kemeja
    protected $sleeve_type; // Jenis lengan kemeja

    // Konstruktor untuk inisialisasi objek kemeja
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type) {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeve_type = $sleeve_type;
    }

    // Getter untuk mendapatkan warna kemeja
    public function getColor() {
        return $this->color;
    }

    // Getter untuk mendapatkan jenis lengan kemeja
    public function getSleeveType() {
        return $this->sleeve_type;
    }

    // Setter untuk mengatur warna kemeja
    public function setColor($color) {
        $this->color = $color;
    }

    // Setter untuk mengatur jenis lengan kemeja
    public function setSleeveType($sleeve_type) {
        $this->sleeve_type = $sleeve_type;
    }

    // Method untuk mendapatkan informasi lengkap tentang kemeja
    public function getInfo() {
        return parent::getInfo() . ", Color: {$this->color}, Sleeve Type: {$this->sleeve_type}";
    }
}
?>
