def calcularMedia(aluno):
    return (dicionario[aluno]["1"] + dicionario[aluno]["2"]) / 2

dicionario = {}
while True:
    aluno = input()
    if aluno == "":
        break
    if aluno in dicionario:
        print("Aluno ja inserido")
        continue
    notas = {}
    notas["1"] = float(input())
    notas["2"] = float(input())
    dicionario[aluno] = notas
