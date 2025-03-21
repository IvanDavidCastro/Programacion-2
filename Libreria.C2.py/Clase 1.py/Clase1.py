
import tkinter as tk

ventana=tk.Tk()
ventana.title("Unitecnar")

ventana.geometry("800x600")
ventana.resizable(True,True)
titulo = tk.Label(ventana, text= "Acceda a su cuenta", font=("Arial", 20), bg = "yellow", fg="blue").place(x=40, y=10)
nombre = tk.Label(ventana, text = "Usuariao:"). place(x=20, y=60)
txtNombre = tk.Entry(ventana).place(x=80, y=60)

contraseña = tk.Label(ventana, text = "Contraseña:"). place(x=20, y=100)
txtContraseña = tk.Entry(ventana).place(x=90, y=100)

def login():
    usuario = txtNombre.get()
    contrasena = txtContraseña.get()
    print(f"Usuario: {usuario}, Contraseña: {contrasena}")

boton = tk.Button(ventana, text="Acceder", command=login)
boton.place(x=80, y=140)

ventana.mainloop()



