package aulas;

import java.util.Scanner;
public class Aula_21 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Digite um ano: ");
        int ano = input.nextInt();

        boolean x = ((ano % 400 != 0) || (ano % 4 == 0 && ano % 100 != 0));

        if (x = true) {
            System.out.println("ANO BISSEXTO!");
        }
        else {
            System.out.println("NAO BISSEXTO!");
        }
    }
}
