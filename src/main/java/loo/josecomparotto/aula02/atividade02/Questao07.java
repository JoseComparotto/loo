package loo.josecomparotto.aula02.atividade02;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base,
                altura;
        double perimetro, area;

        System.out.print("Informe a base do retângulo: ");
        base = scan.nextDouble();

        System.out.print("Informe a altura do retângulo: ");
        altura = scan.nextDouble();

        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println();
        System.out.printf("Perímetro: %.2f\n", perimetro);
        System.out.printf("Área: %.2f u.a.\n", area);

        scan.close();
    }

}
