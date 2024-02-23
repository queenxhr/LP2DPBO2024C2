from Product import Product

class Clothing(Product):
    def __init__(self, idProduct="", name="", brand="", price=0.0, size="", material="", gender=""):
        super().__init__(idProduct, name, brand, price) #super untuk memanggil atribut di class product
        self.size = size                                #atribut untuk menampung size
        self.material = material                        #atribut untuk menampung material
        self.gender = gender                            #atribut untuk menampung gender

    #Getter dan Setter
    def setSize(self, size):
        self.size = size

    def setMaterial(self, material):
        self.material = material

    def setGender(self, gender):
        self.gender = gender

    def getSize(self):
        return self.size

    def getMaterial(self):
        return self.material

    def getGender(self):
        return self.gender
