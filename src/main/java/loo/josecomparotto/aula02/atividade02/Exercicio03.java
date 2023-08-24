package loo.josecomparotto.aula02.atividade02;

/**
 * QUESTÃO 03
 * <p>
 * Faça um programa usando Linguagem Java, que imprima a média aritmética de
 * três números. Ao final, o programa deve imprimir os resultados dos cálculos.
 * </p>
 */

public class Exercicio03 {
    public static void main(String[] args) {
        double numero1, numero2, numero3, media;
        numero1 = 5;
        numero2 = 7;
        numero3 = 6;
        media = (numero1 + numero2 + numero3) / 3;
        System.out.println("Media: " + media);
    }
}