class Product:
    def __init__(self, idProduct="", name="", brand="", price=0.0):
        self.idProduct = idProduct  #atribut untuk menampung ID produk
        self.name = name            #atribut untuk menampung nama produk
        self.brand = brand          #atribut untuk menampung brand produk
        self.price = price          #atribut untuk menampung harga produk

    #Getter dan Setter
    def setIdProduct(self, idProduct):
        self.idProduct = idProduct

    def setName(self, name):
        self.name = name

    def setBrand(self, brand):
        self.brand = brand

    def setPrice(self, price):
        self.price = price

    def getIdProduct(self):
        return self.idProduct

    def getName(self):
        return self.name

    def getBrand(self):
        return self.brand

    def getPrice(self):
        return self.price
