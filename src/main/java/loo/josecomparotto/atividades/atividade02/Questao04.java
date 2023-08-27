package loo.josecomparotto.atividades.atividade02;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero,
                antecessor, sucessor;

        System.out.print("Informe um número inteiro: ");
        numero = scan.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        scan.close();
    }

}
