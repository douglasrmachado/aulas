package aulas;

import java.util.Scanner;

public class Aula_19 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = input.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = input.nextInt();

        if (idade < 0) {
            System.out.println("Idade invalida!");

        }
        else if (idade > 130) {
            System.out.println("Idade invalida!");
        }
        else if (idade < 12) {
            System.out.println(nome + " eh Crianca!");

        }
        else if (idade < 18) {
            System.out.println(nome + " eh Adolescente!");

        }
        else if (idade < 60) {
            System.out.println(nome + " eh Adulto!");

        }
        else {
            System.out.println(nome + " eh Idoso!");
        }

    }
}
