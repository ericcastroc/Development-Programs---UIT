""" Faça um programa que leia um número n e em seguida leia n inteiros. Em seguida crie uma lista com o
 quadrado dos elementos da lista original utilizando compreensão de lista. """

a = [2,3,4,5,6]

b = [elemento ** 2 for elemento in a]

print(b)