public class Caneta{
    int cor;
    double preco;
    double tinta;
    int quantidade;

    public void percentual(){
        tinta -= 0.50;
    }

    public void tinta(){
        if (tinta < 0 ){
            System.out.println(" Caneta esta vazia");
        } else {
            System.out.println(" Caneta não esta vazia");
            System.out.println(" Voce utilizou a caneta agora ela tem " + tinta + "%");
        }
    }

    public void valor(){
        double aux;
        System.out.println(" Cada caneta custa " + preco + "R$");
        aux = quantidade * preco - ( preco * 10 / 100);
        System.out.println(" O valor após o desconto e " + aux);
    }

    public void escolha(){
        if(cor == 1){
            System.out.println(" Voce escolheu Azul");
        }else if(cor == 2){
            System.out.println(" Voce escolheu Preta");
        }else if(cor == 3){
            System.out.println(" Voce escolheu Vermelho");
        }

    
    }
    





}