package loo.josecomparotto.atividades.atividade02;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salarioInicial, salarioFinal;
        double reajuste;

        System.out.print("Informe o salário inicial: R$ ");
        salarioInicial = scan.nextDouble();

        System.out.print("Informe o reajuste (em %): ");
        reajuste = scan.nextDouble() / 100;

        salarioFinal = salarioInicial * (1 + reajuste);

        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);

        scan.close();
    }

}
