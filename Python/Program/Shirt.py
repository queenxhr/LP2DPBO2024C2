from Clothing import Clothing

class Shirt(Clothing):
    def __init__(self, idProduct="", name="", brand="", price=0, size="", material="", gender="", color="", sleeveType=""):
        super().__init__(idProduct, name, brand, price, size, material, gender) #super untuk memanggil atribut di class product dan clothing
        self.color = color                                                      #atribut untuk menampung warna
        self.sleeveType = sleeveType                                            #atribut untuk menampung sleeve type

    #Getter dan Setter
    def setColor(self, color):
        self.color = color

    def setSleeveType(self, sleeveType):
        self.sleeveType = sleeveType

    def getColor(self):
        return self.color

    def getSleeveType(self):
        return self.sleeveType
