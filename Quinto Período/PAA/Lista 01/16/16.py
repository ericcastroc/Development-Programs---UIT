
"""Leia um 4ex4e5o de um arquivo e crie um dicionário que conte o número de vezes que cada letra apareceu no texto. Crie seu próprio arquivo de teste."""

#arquivo = open('Lista 01/16/texto.txt', "r")
arquivo= "ola meu nome e eric"

dicionario = {}
for linha in arquivo:
    linha = linha.rstrip()
    for letra in linha:
        if letra in arquivo:
            dicionario[letra] = dicionario.get(letra, 0) + 1
print(arquivo)
print(dicionario)

