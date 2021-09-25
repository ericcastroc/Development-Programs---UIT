/*Crie uma classe moeda e métodos estáticos que convertem de real para dólar e de dólar para real baseados em atributos com valores das moedas da própria classe. 
Teste esta classe utilizando os métodos sem necessitar instanciar objetos.*/

public class UIT2708Moeda {
 
    public static void main(String[] args){
        System.out.println(Moeda.converterDolarReal(1));
        System.out.printf("%.2f\n",Moeda.converterRealDolar(1));
    }
}
