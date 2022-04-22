n = int(input())
lista = []
for i in range(n):
    lista.append(int(input()))
print(sum(lista))
print(sum(lista) / len(lista))
print(max(lista))
print(min(lista))
print(lista.count(0))
