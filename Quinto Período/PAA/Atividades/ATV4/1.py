arquivoLeitura = open(input(), "r")
arquivoEscrita = open("invertido.txt", "w")
for linha in arquivoLeitura:
    arquivoEscrita.write(linha.rstrip()[::-1] + "\n")
arquivoLeitura.close()
arquivoEscrita.close()
