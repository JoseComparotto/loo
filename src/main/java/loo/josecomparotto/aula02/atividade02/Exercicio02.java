package loo.josecomparotto.aula02.atividade02;

import java.util.Scanner;

/**
 * QUESTÃO 02
 * <p>
 * Faça um programa usando Linguagem Java, que peça ao usuário que digite dois
 * números e mostre o produto deles.
 * </p>
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero1, numero2, produto;
        System.out.print("Informe um número: ");
        numero1 = scan.nextDouble();
        System.out.print("Informe outro número: ");
        numero2 = scan.nextDouble();
        produto = numero1 * numero2;
        System.out.println("Produto: " + produto);
        scan.close();
    }
}