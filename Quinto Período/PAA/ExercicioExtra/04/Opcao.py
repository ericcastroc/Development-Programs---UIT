"""4 -Faça um programa que dê três opções ao usuário
1 – Cadastrar Pessoa
2 – Alterar Pessoa
3 – Excluir Pessoa
Caso escolha a primeira opção, o programa deve ler: nome, idade, salário, data de nascimento 
e salvar esses dados em um arquivo chamado pessoas.txt. O programa deve salvar os dados da 
nova pessoa no final do arquivo sem alterar as pessoas já cadastradas no arquivo.
Caso escolha a segunda opção, o programa deve ler: nome, idade, salário, data de nascimento, 
ler os dados do arquivo pessoa.txt em um dicionário, alterar os dados dessa pessoa no 
dicionário e em seguida criar um novo arquivo pessoa.txt sobrescrevendo o antigo.
Caso escolha a terceira opção o programa deve ler o nome da pessoa, ler os dados do arquivo 
pessoa.txt em um dicionário, excluir do dicionário a pessoa que teve o nome lido e em seguida 
criar um novo arquivo pessoa.txt sobrescrevendo o antigo"""

arquivo = open('texto.txt', "w")


while True:
    print("------------------------------------")
    print("Escolha uma opção:\n1-Cadastrar pessoa")
    print("2-Listar pessoas cadastradas")
    print("3- Excluir pessoas da lista")
    opcao = int(input())
    if opcao == 1:
        arquivo = []
        nome = input("Informe o nome da pessoa: ")
        salario = input("Informe o salário da pessoa: ")
        idade = input("Informe a Idade da pessoa: ")
        dataN = input("Informe a data de nascimento da pessoa: ")
        arquivo.append(nome)
        arquivo.append(idade)
        arquivo.append(salario)
        arquivo.append(dataN)

    elif opcao == 2:

    elif opcao == 3:
        
        
    else:
        print('Opção inválida')