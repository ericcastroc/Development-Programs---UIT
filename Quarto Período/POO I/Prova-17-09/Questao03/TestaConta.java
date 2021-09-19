/*Reescreva as classes Conta e TestaConta aplicando o encapsulamento dos atributos da classe Conta, ou seja, 
modificando o acesso dos mesmos para apenas a própria classe e criando métodos de acesso.*/

package Questao03;

public class TestaConta {

    public static void main(String[] args) {

        Conta conta = new Conta();

        conta.setTitular("jose");
        conta.setNumero(6);
        conta.setSaldo(30.50);
        System.out.println("Olá " + conta.getTitular() + ",seu saldo é de " + conta.getSaldo()
                + "\nO numero da sua conta e " + conta.getNumero());
    }
}
