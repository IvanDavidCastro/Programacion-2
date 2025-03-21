class Usuarios:

    def __init__(self, nombre, nickname, clave):
        self.nombre = nombre
        self.nickname = nickname
        self.clave = clave

    def mostrar_informacion(self):
        return f"Nombre: {self.nombre}, Nickname: {self.nickname}"
    
class admiUsuarios:
    def __init__(self):
        self.usuarios = []
    
    def agregarUsuario(self, nombre, nickname, clave):
        usuario = Usuarios(nombre, nickname, clave)
        self.usuarios.append(usuario)

    def listaUsuarios(self):
        return [usuario.mostrar_informacion() for usuario in self.usuarios]