"""Crie uma função chamada inverteValor(). Essa função deve receber um inteiro e retornar o valor usando apenas operações aritméticas. 
Em seguida crie uma função que recebe o valor original e o valor invertido e retorna TRUE caso os dois números sejam igualmente pares ou igualmente ímpares e 
retorne FALSE caso contrário."""

#Temos duas maneiras de fazer esse exercicio. 
numero = int(input("Informe um número inteiro: "))
invertido = 0 

while(numero != 0):    
    temp = numero % 10
    #print("Temporario",temp)
    invertido = invertido * 10 + temp    
    #print("Num Inverso",inverso)
    numero = numero // 10 
    #print(numero)
print("O número invertido é:", invertido) 

#Podemos fazer dessa forma tambem  
numero = int(input("Informe um número inteiro: "))
revertido = str(numero)[::-1]

print("O número revertido e:", revertido)