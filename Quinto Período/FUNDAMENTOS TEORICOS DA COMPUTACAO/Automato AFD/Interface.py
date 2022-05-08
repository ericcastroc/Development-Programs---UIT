from PySimpleGUI import PySimpleGUI as sg
import Afd

# Layout
sg.theme('Reddit'
         )
layout = [ 
    [sg.Text("Informe o Arquivo:"), sg.In(), sg.FileBrowse()], #Pede para o usuario informar qual o caminho do arquivo
    [sg.Text("Informe o Automato:"), sg.In()],#Pede para o usuario informar qual o automato desejado
    [sg.Button('Enviar'), sg.Button('Cancelar')] #Botões para enviar o automato e para cancelar

]
# Janela
janela = sg.Window('Tela de Login', layout)#Informa para minha variavel todos os valores
# Ler os eventos

while True:
    eventos, valores = janela.read()#Eventos = Cada Interação com o usuario Valores = Cada valor informado pelo usuario
    if eventos == sg.WINDOW_CLOSED: # Caso o usuario saia do aplicativo ele ira fechar direto
        break
    if eventos == 'Enviar':# Verifica qual o botão que foi selecionado
        arquivo = valores[0].split('.')#Retira todos os pontos do diretorio informado e atribui todos os valores va minha variavel arquivo 
        if(arquivo[-1] == 'txt'): # Verifica se a ultima prosição da minha lista equivale a txt
            Afd.main(str(valores[0]), valores[1])# Chama minha função main passando como parametro o caminho do arquivo e o automato
        else:
            print('Informe uma extensão valida. Somente extensões .txt')#Caso o arquivo não seja txt ele pede para informar uma extensão TXT
            sg.popup('Informe uma extensão valida. Somente extensões .txt')#Aparece um popup para informar uma extensão valida
    else:   
        break
