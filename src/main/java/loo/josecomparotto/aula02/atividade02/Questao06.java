package loo.josecomparotto.aula02.atividade02;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldoInicial, saldoFinal;

        final double REAJUSTE = 0.02; // 2%

        System.out.print("Informe o saldo inicial: R$ ");
        saldoInicial = scan.nextDouble();

        saldoFinal = saldoInicial * (1 + REAJUSTE);

        System.out.printf("Saldo final: R$ %.2f\n", saldoFinal);

        scan.close();
    }

}
