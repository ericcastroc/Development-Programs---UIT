arquivo = open("teste.txt", "r")
dicionario = {}
for linha in arquivo:
    for letra in linha:
        if letra in "aeiou":
            dicionario[letra] = dicionario.get(letra, 0) + 1
print(dicionario)
