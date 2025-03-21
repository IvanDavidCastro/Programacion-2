#   Creando una lista

lista1 = list()
lista2 = []

#Asignar valores
lista1 =["Manfgo", "Pera"]
lista1 [0] = 'Unitecnar'
lista1 [1] = "Unicartagena"

print(lista1)

lista2.append("ivan")
lista2.append("castro")

lista2.insert(2, 'jimenez')

print(lista2)

#Obtener tamaño de la lista

print(len(lista2))

#Eliminar datos de la lista

del(lista2[0])

print(lista2)

lista2.remove("castro")

print(lista2)

lista2.append("david")
lista2.append("dana")
print(lista2)
lista2.pop(0)
print(lista2)

#Copiando listas

lista3 = lista2.copy()

print(lista3)
#Conectar elementos de una lista

print(lista3.count("david"))

#Busqueda elementos 

print(lista3.index("dana"))

#Ordenar lista
lista3.append("duvan")
lista3.append("mateo")
lista3.sort()
print(lista3)


