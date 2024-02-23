package aulas;

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int tentativas = 10;
        int numeroSecreto = random.nextInt(100);
        long chute;

        System.out.println(numeroSecreto);

        while(tentativas > 0) {
            System.out.println("Qual seu chute?");
            chute = input.nextLong();

            if(numeroSecreto == chute) {
                System.out.println("Você acertou o número!");
                break;
            } else {
                --tentativas;
                System.out.println("Número " + (chute < numeroSecreto ? "muito pequeno!" : "muito alto!") + " " + tentativas + " tentativas restantes! ");
            }
        }
        
        input.close();

    }
}
