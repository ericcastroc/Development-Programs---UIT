/* Crie uma classe para representar uma pessoa, com os atributos privados de nome, sexo, peso e altura. 
Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular o imc da pessoa e outro método que retorne string se está abaixo, acima ou no peso ideal. 
Faça o teste com duas pessoas passando os valores por get e set. */

public class ImcPessoa {

    private String nome;
    private char sexo;
    private double peso;
    private double altura;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if(sexo=='M' || sexo=='F'){
        this.sexo = sexo;
        }
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso>0 && peso<597){
        this.peso = peso;
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if(altura>62.8 && altura<252){
        this.altura = altura;
        }
    }
    
    public String informaSexo(){
        if(sexo=='M'){
            return "Masculino";
        }else if(sexo=='F'){
            return "Feminino";
        }else{
            return "!!!INVALIDO!!!";
        }
    }
    public double calcularImc(){
        double imc;
        imc=peso/(altura*altura)*10000; 
        return imc;
    } 

    public String pesoIdeal(){
        if(calcularImc()<=18.5){
            return "Maregaz Obesidade Grau 0:"; 
        }else if(calcularImc()>=18.5 && calcularImc()<=24.9){
            return "Normal Obesidade Grau 0:";
        }else if(calcularImc()>=25.0 && calcularImc()<=29.9){
            return " Sobrepeso Obesidade Grau 1:";
        }else if(calcularImc()>=30.0 && calcularImc()<=39.9){
            return "Obeside Grau 2:";
        }else{
            return " Obesidade grave grau 3:";
        }

    }

    public String imprimeDetalhe(){
        return "Nome:" +getNome() +
               "\nSexo:" +informaSexo() +
               "\nAltura:" +getAltura() +
               "\nPeso:" +getPeso() +
              "\nImc:" +calcularImc();
    }
}

/* Operador Ternario: +((getSexo()=='m')?"Masculino":"Feminino")+*/ 