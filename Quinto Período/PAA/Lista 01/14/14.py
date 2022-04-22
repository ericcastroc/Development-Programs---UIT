
"""Plote um gráfico de dispersão com os resultados do exercício anterior"""

import random 
import matplotlib.pyplot as plt  
import numpy as np

lista = np.random.randint(1,100,(100))
listab=[]

for elemento in lista: 
    if elemento not in listab: 
        listab.append(elemento)
    
listab.sort()
print("\nLista Original:\n")
print(lista)
print("\nLista Ordenada:\n")
print(listab)


plt.scatter(lista['Lista 1'], listab['Lista 2'], c='b')
plt.title("Grafico 1")
plt.xlabel("N")
plt.ylabel("X")
plt.show()