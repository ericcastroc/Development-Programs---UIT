transicao = {('S0', 0) : 'S0', ('S0', 1) : 'S1', ('S1', 0) : 'S2', ('S1', 1) : 'S0', ('S2', 0) : 'S1', ('S2', 1) : 'S2'}
alfabeto = set(['0','1'])
estadoInicial = 'S0'
estadoFinal = 'S0'
automato = '1001'

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
                sequenciaAutomato = sequenciaAutomato + ' ' +estadoAtual
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

            

sequenciaAutomato = Afd(automato, estadoInicial, alfabeto, transicao, estadoFinal)
print("As transçoes: ",sequenciaAutomato.lerAfd() +"\t|"+" O Estado Final e:",estadoFinal)
sequencialAutomato = sequenciaAutomato.lerAfd()
print("Esse Automato e: ", sequenciaAutomato.validarAfd(sequencialAutomato))
