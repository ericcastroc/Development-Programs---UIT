/*Escreva uma classe Principal que possui um array de inteiros de tamanho 10. 
Preencha este vetor com números aleatórios. Após receber os números, escreva os mesmos de 
forma ordenada. */
package Questao03;

import java.util.Random;
import java.util.Arrays;

public class Principal {
    
    public static void main(String[] args){
        int i;
        Random numRandom = new Random();
        int[] vetNum = new int[10];

        for(i=0; i<vetNum.length; i++){
            vetNum[i]=numRandom.nextInt(1000);
        }
        System.out.println("Numeros Aleatorios:");
        System.out.println(Arrays.toString(vetNum));

        Arrays.sort(vetNum);
        System.out.println("Numeros Ordenados:");
        System.out.println(Arrays.toString(vetNum));

    }
    
}
