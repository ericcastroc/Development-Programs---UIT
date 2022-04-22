import random
import numpy as np
""" Faça um programa que leia um número n e em seguida leia n inteiros. Crie uma lista ordenada 
sem elementos repetidos a partir da lista original e mostre a lista original e a lista ordenada 
sem elementos repetidos na tela """

lista = np.random.randint(1,100,(100))
listab=[]

for elemento in lista: 
    if elemento not in listab: 
        listab.append(elemento)
    
listab.sort()


print(lista)
print(listab)

