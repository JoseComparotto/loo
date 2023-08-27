package loo.josecomparotto.atividades.atividade02;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double distancia, tempo, velocidade, litros;

        final double RENDIMENTO = 12; // km/l

        System.out.print("Informe o tempo da viagem (em horas): ");
        tempo = scan.nextDouble();

        System.out.print("Informe a velocidade média da viagem (em km/h): ");
        velocidade = scan.nextDouble();

        distancia = tempo * velocidade;
        litros = distancia / RENDIMENTO;

        System.out.println();
        System.out.println("Relatório da Viagem:");
        System.out.printf("Distância percorrida: %.2f km.\n", distancia);
        System.out.printf("Combustível gasto: %.2f litros.\n", litros);
        scan.close();
    }

}
