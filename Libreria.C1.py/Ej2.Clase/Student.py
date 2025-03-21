
from person import Person  

class Student(Person):  
    def __init__(self, Nombre, Apellido, Edad, Cel):
        super().__init__(Nombre, Apellido)  
        self.Edad = Edad
        self.Cel = Cel