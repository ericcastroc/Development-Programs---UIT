"""1 - Escreva um programa Python para combinar dois dicionários adicionando valores para
chaves comuns.
d1 = {'a': 100, 'b': 200, 'c':300}
d2 = {'a': 300, 'b': 200, 'd':400}
Contador({'a': 400, 'b': 400, 'd': 400, 'c': 300})"""

d1 = {'a': 100, 'b': 200, 'c':300}
d2 = {'a': 300, 'b': 200, 'd':400}
d3 = {}


for n in d1.keys():
            d3[n] = d1[n]
            
for n in d2:
        if n in d3.keys():
            d3[n] = d3[n] + d2[n]
        else:
            d3[n] = d2[n]
print(d3)