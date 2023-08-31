package loo.josecomparotto.a02;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double temperaturaEmC, temperaturaEmF;

        System.out.print("Informe a temperatura em ºC: ");
        temperaturaEmC = scan.nextDouble();

        temperaturaEmF = ((9 * temperaturaEmC) + 160) / 5;

        System.out.printf("Temperatura em ºF: %.1fºF\n", temperaturaEmF);

        scan.close();
    }

}
