
import tkinter as tk

ventana=tk.Tk()
ventana.title("Unitecnar App")

ventana.geometry("800x600")
ventana.resizable(True,True)

#titulo = tk.Label(ventana, text= "BIENVENIDO A MI APP", font=("Arial", 20), bg = "yellow", fg="blue")
#titulo.pack()

nombre = tk.Label(ventana, text = "IVAN DAVID CASTRO JIMENEZ").place(x=20, y=100)

carrera = tk.Label(ventana, text = "INGENIERIA DE SISTEMAS").grid(row=0, column=1)
ventana.mainloop()
