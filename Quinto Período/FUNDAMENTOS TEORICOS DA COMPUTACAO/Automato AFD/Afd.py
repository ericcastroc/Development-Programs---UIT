import re as re
from pathlib import Path

'''
Essas variaveis foram para fazer testes sem precisar utilizar o Terminal

        transicao = {('S0', 0): 'S0', ('S0', 1): 'S1', ('S1', 0): 'S2',  
             ('S1', 1): 'S0', ('S2', 0): 'S1', ('S2', 1): 'S2'}
        alfabeto = set(['0', '1'])
        estadoInicial = 'S0'
        estadoFinal = 'S0
                            '''



def lerArquivo(arquivos): # Função para ler o Arquivo 
    arquivo = open(arquivos, 'r')
    path = Path(arquivos) #Utiliza a biblioteca pathlib para pegar o diretorio do arquivo
    if path.suffix == '.txt': #Verifica se a extensão do arquivo e .txt
        automato = []
        for linha in arquivo:
            automato.append(linha.strip())
        if len(automato) == 11: #Verificamos se e um arquivo valido seguindo as regas 
            return automato
        else:
            return "ERRO"
    return "ERRO" 


def separarEstados(automato):
    estados = re.split(" ", automato[1])  # Os estados estão na linha 1
    return estados


def separarAlfabeto(automato):
    alfabeto = re.split(" ", automato[2])  # Os alfabetos estão na linha 2
    return alfabeto


def pegarEstadoInicial(automato):
    estadoInicial = automato[3]  # O estado inicial esta na linha 3
    return estadoInicial


def pegarEstadoFinal(automato):
    estadoFinal = automato[4]  # O estado final esta na linha 4
    return estadoFinal


def separarTransicoes(automato): 
    transicao = {} 
    for i in range(5, len(automato)): #Como sabemos o formato do arquivo começamos a ler a partir da linha 5 levando em consideração que o i começa de 0
        item = automato[i].split()
        aux = item[0]
        aux2 = item[2]
        transicao[aux, int(aux2)] = item[1] #Aqui ele adiciona no meu dicionario qual o movimento ele ira fazer seguindo essa logica {('estado',valor):'estado',}
    return transicao


class Afd:
    def __init__(self, automato, estadoInicial, alfabeto, transicao, estadoFinal):
        self.automato = automato
        self.estadoInicial = estadoInicial
        self.alfabeto = alfabeto
        self.transicao = transicao
        self.estadoFinal = estadoFinal

    def lerAfd(self):
        estadoAtual = self.estadoInicial #Atribui ao meu estado atual como o estado inicial 
        sequenciaAutomato = self.estadoInicial #Informa que o inicio da sequencia que o automato ira tomar
        for i in self.automato: #verifica todos os valores que estão presente no automato
            if i in self.alfabeto:#verifica se todos os valores fazem parte do alfabeto
                estadoAtual = self.transicao[estadoAtual, int(i)]#informa primeiramente que o meu estado atual vale S0,0 = S0
                sequenciaAutomato = sequenciaAutomato + ' ' + estadoAtual# Informa toda a sequencia do meu Automato como por exemplo: Como ele inicia em S0 caso vir 0 ele ira atribuir S0 + S0 
            else:
                sequenciaAutomato = 'ERRO' #Caso o valor informado não faça parte do Alfabeto ele atribui para a Sequencia como ERRO 
                break
        return sequenciaAutomato

    def validarAfd(self, sequenciaAutomato):
        self.sequenciaAutomato = sequenciaAutomato
        if self.sequenciaAutomato != 'ERRO': # Verifica se realmente e um Automato valido
            if self.sequenciaAutomato[-1] == self.estadoFinal[-1]: # Verifica a ultima posição do Automato caso a ultima posição seja igual o estado final ele retorna 
                return True
            else:
                return False
        return sequenciaAutomato


def main(arquivos, automatos):
    arquivo = lerArquivo(arquivos)
    if(arquivo != 'ERRO'):
        estadosInicial = pegarEstadoInicial(arquivo)
        estadosFinal = pegarEstadoFinal(arquivo)
        alfabetos= separarAlfabeto(arquivo)
        transicaos = separarTransicoes(arquivo)


        automato = automatos

        '''
       Essas variaveis foram para fazer testes sem precisar utilizar o Terminal

        sequenciaAutomato = Afd(automato, estadoInicial,alfabeto, transicao, estadoFinal)'''
        

        '''print("Setando todas as Informaçoes \n")
        print("As transçoes: ", sequenciaAutomato.lerAfd() + "\t|"+" O Estado Final e:", estadoFinal)

        sequencialAutomato = sequenciaAutomato.lerAfd()
        print("Esse Automato e: ", sequenciaAutomato.validarAfd(sequencialAutomato))
                                                                                    '''

        sequenciaAutomatoArquivo = Afd(automato, estadosInicial, alfabetos, transicaos, estadosFinal)

        print("\n\nUtilizando o Arquivo\n")
        print("As transçoes: ", sequenciaAutomatoArquivo.lerAfd() + "\t|"+" O Estado Final e:", estadosFinal)

        sequencialAutomatoArquivo = sequenciaAutomatoArquivo.lerAfd()
        print("Esse Automato e: ", sequenciaAutomatoArquivo.validarAfd(sequencialAutomatoArquivo))
    else:
        print("Informe um Arquivo Valido")


'''if __name__ == '__main__': # chamada da funcao principal
    main()'''