package aulas;

import java.util.Scanner;

public class Aula_14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int gramas, kilos, soma;

        System.out.println("Digite um valor em gramas: ");
        gramas = input.nextInt();

        kilos = gramas / 1000;
        gramas = gramas % 1000;
        
        System.out.println("O total de kilos eh = " + kilos);
        System.out.println("O total de gramas eh = " + gramas);

        

    }
}
