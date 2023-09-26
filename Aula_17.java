package aulas;

import java.util.Scanner;

public class Aula_17 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu primeiro nome?");
        String primeiroNome = input.nextLine();

        System.out.println("Qual seu ultimo nome?");
        String ultimoNome = input.nextLine();

        System.out.println("Qual sua idade?");
        int idade = input.nextInt();

        

        System.out.println("Ola " + primeiroNome + " " + ultimoNome + " de " + idade + " anos.");
    }
}
