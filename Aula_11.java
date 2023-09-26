package aulas;

import java.util.Scanner;

public class Aula_11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double base, altura, areaRetangulo;

        System.out.println("Informe o valor da base: ");
        base = teclado.nextDouble();

        System.out.println("Informa o valor da altura: ");
        altura = teclado.nextDouble();

        areaRetangulo = base * altura;

        System.out.println("A area de um retangulo de base = " + base);
        System.out.println("e altura " + altura);
        System.out.println("é " + areaRetangulo);

        teclado.close();

    }
}
