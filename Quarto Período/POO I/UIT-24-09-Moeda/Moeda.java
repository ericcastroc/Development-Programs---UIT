/*Crie uma classe moeda e métodos estáticos que convertem de real para dólar e de dólar para real baseados em atributos com valores das moedas da própria classe. 
Teste esta classe utilizando os métodos sem necessitar instanciar objetos.*/

public class Moeda {
    
    public static double dolarReal = 5.34 ;

    public static double converterDolarReal(double valor){
       return valor*dolarReal;
    }

    public static double converterRealDolar(double valor){
        return valor*(1/dolarReal);
    }
}
