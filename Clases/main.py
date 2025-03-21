import tkinter as tk
from tkinter import messagebox

class Usuarios:
    def __init__(self, nombre, nickname, clave):
        self.nombre = nombre
        self.nickname = nickname
        self.clave = clave

    def mostrar_info(self):
        return f"Nombre: {self.nombre}, Nickname: {self.nickname}"
    
    def guardarUsuario(self, gestor):
        gestor.agregarUsuario(self)
    
    def listarUsuarios(self, gestor):
        return gestor.listaUsuarios()

class AdmiUsuarios:
    def __init__(self):
        self.usuarios = []
    
    def agregarUsuario(self, usuario):
        self.usuarios.append(usuario)
    
    def listaUsuarios(self):
        return [usuario.mostrar_info() for usuario in self.usuarios]

class FormularioUsuarios:
    def __init__(self, ventana, gestor):
        self.gestor = gestor
        self.ventana = ventana
        self.ventana.title("Actividad 1 Listas")
        self.ventana.geometry("600x400")
        self.ventana.configure(bg="blue")
        
        tk.Label(ventana, text="Registro de Usuarios", font=("Arial", 20), bg="yellow", fg="blue").place(x=40, y=10)
        tk.Label(ventana, text="Nombre:").place(x=40, y=60)
        tk.Label(ventana, text="Nickname:").place(x=40, y=100)
        tk.Label(ventana, text="Clave:").place(x=40, y=140)
        
        self.nombre_entry = tk.Entry(ventana)
        self.nickname_entry = tk.Entry(ventana)
        self.clave_entry = tk.Entry(ventana, show="*")
        
        self.nombre_entry.place(x=150, y=60)
        self.nickname_entry.place(x=150, y=100)
        self.clave_entry.place(x=150, y=140)
        
        tk.Button(ventana, text="Guardar Usuario", command=self.guardar_usuario).place(x=40, y=180)
        tk.Button(ventana, text="Listar Usuarios", command=self.listar_usuarios).place(x=180, y=180)
        
        self.panel_usuarios = tk.Text(ventana, height=5, width=50, state=tk.DISABLED, bg="white")
        self.panel_usuarios.place(x=40, y=220)
        
    def guardar_usuario(self):
        nombre = self.nombre_entry.get()
        nickname = self.nickname_entry.get()
        clave = self.clave_entry.get()
        
        if nombre and nickname and clave:
            usuario = Usuarios(nombre, nickname, clave)
            usuario.guardarUsuario(self.gestor)
            messagebox.showinfo("Éxito", "Usuario en lista")
            self.nombre_entry.delete(0, tk.END)
            self.nickname_entry.delete(0, tk.END)
            self.clave_entry.delete(0, tk.END)
        else:
            messagebox.showerror("Error", "Todos los campos son obligatorios")
        
    def listar_usuarios(self):
        usuarios = self.gestor.listaUsuarios()
        
        self.panel_usuarios.config(state=tk.NORMAL)
        self.panel_usuarios.delete(1.0, tk.END)
        self.panel_usuarios.insert(tk.END, "\n".join(usuarios))
        self.panel_usuarios.config(state=tk.DISABLED)

if __name__ == "__main__":
    ventana = tk.Tk()
    administrador = AdmiUsuarios()
    app = FormularioUsuarios(ventana, administrador)
    ventana.mainloop()
