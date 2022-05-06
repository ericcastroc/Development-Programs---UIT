import re
transicao = {('S0', 0): 'S0', ('S0', 1): 'S1', ('S1', 0): 'S2',
             ('S1', 1): 'S0', ('S2', 0): 'S1', ('S2', 1): 'S2'}
alfabeto = set(['0', '1'])
estadoInicial = 'S0'
estadoFinal = 'S0'
automato = '1001'


def lerArquivo():
    arquivo = open('entrada.txt', 'r')
    automato = []
    for linha in arquivo:
        automato.append(linha.strip())
    return automato


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
    for i in range(5, len(automato)):
        item = automato[i].split()
        aux = item[0]
        aux2 = item[2]
        transicao[aux, int(aux2)] = item[1]
    return transicao


class Afd:
    def __init__(self, automato, estadoInicial, alfabeto, transicao, estadoFinal):
        self.automato = automato
        self.estadoInicial = estadoInicial
        self.alfabeto = alfabeto
        self.transicao = transicao
        self.estadoFinal = estadoFinal

    def lerAfd(self):
        estadoAtual = self.estadoInicial
        sequenciaAutomato = self.estadoInicial
        for i in self.automato:
            if i in self.alfabeto:
                estadoAtual = self.transicao[estadoAtual, int(i)]
                sequenciaAutomato = sequenciaAutomato + ' ' + estadoAtual
            else:
                sequenciaAutomato = 'ERRO'
                break
        return sequenciaAutomato

    def validarAfd(self, sequenciaAutomato):
        self.sequenciaAutomato = sequenciaAutomato
        if self.sequenciaAutomato != 'ERRO':
            if self.sequenciaAutomato[-1] == self.estadoFinal[-1]:
                return True
            else:
                return False
        return sequenciaAutomato


arquivo = lerArquivo()
pegarEstadoInicial = pegarEstadoInicial(arquivo)
pegarEstadoFinal = pegarEstadoFinal(arquivo)
separarAlfabeto = separarAlfabeto(arquivo)
separarTransicoes = separarTransicoes(arquivo)

sequenciaAutomato = Afd(automato, estadoInicial,alfabeto, transicao, estadoFinal)
sequenciaAutomatoArquivo = Afd(automato, pegarEstadoInicial, separarAlfabeto, separarTransicoes, pegarEstadoFinal)

print("Setando todas as Informaçoes \n")
print("As transçoes: ", sequenciaAutomato.lerAfd() + "\t|"+" O Estado Final e:", estadoFinal)

sequencialAutomato = sequenciaAutomato.lerAfd()
print("Esse Automato e: ", sequenciaAutomato.validarAfd(sequencialAutomato))


print("\n\nUtilizando o Arquivo\n")
print("As transçoes: ", sequenciaAutomatoArquivo.lerAfd() + "\t|"+" O Estado Final e:", pegarEstadoFinal)

sequencialAutomatoArquivo = sequenciaAutomatoArquivo.lerAfd()
print("Esse Automato e: ", sequenciaAutomatoArquivo.validarAfd(sequencialAutomatoArquivo))
