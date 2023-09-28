package aulas;

import java.util.Scanner;

public class Aula_13 {

    public static void main(String[] args) {

        final double PI = 3.1415;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double raio = teclado.nextDouble();

        double area = raio * raio * PI;

        System.out.println("O valor da area eh = " + area);
    }
}
