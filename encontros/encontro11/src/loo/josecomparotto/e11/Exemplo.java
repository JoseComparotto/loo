package loo.josecomparotto.e11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo {
    private Scanner scan;

    private final List<Integer> lista;

    public Exemplo() {
        this.scan = new Scanner(System.in);

        this.lista = new ArrayList<>();
    }

    public void executar() {
        this.exibirMenu();
    }

    private void exibirMenu() {
        int continuar;
        do {
            System.out.println("\n\tProjeto Aula 11\n\n");
            System.out.println("1. Preencher lista\n");
            System.out.println("2. Imprimir lista\n");
            System.out.println("3. Imprimir Quadrado na posição\n");

            System.out.println("0. Sair\n");
            System.out.print("> ");

            continuar = this.scan.nextInt();
            switch (continuar) {
                case 1:
                    this.preencherLista();
                    break;
                case 2:
                    this.imprimirLista();
                    break;
                case 3:
                this.imprimirQuadradoNaPosicao();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Digite uma opção válida\n");
            }
        } while (continuar != 0);
    }

    private void preencherLista() {
        /*
         * Desenvolva uma função para preencher uma lista de inteiros, informados pelo
         * usuário
         */

        int numero;

        System.out.println("\n\tPreencher lista\n\n");
        System.out.println("Informe um número inteiro ou 0 para finalizar.\n");

        do {

            System.out.printf("[%d]: ", this.lista.size());

            numero = this.scan.nextInt();

            if (numero != 0) {
                this.lista.add(numero);
            }

        } while (numero != 0);

    }

    private void imprimirLista() {
        /* Desenvolva uma função para imprimir a lista completa */
        System.out.println();
        for (int i =0; i < this.lista.size();i++) {
            System.out.printf("| %02d ", i);
        }
        System.out.println("|");
        for (int i =0; i < this.lista.size();i++) {
            System.out.printf("|----", i);
        }
        System.out.println("|");

        for (int numero : lista) {
            System.out.printf("| %02d ", numero);
        }

        System.out.println("|\n");
    }

    private void imprimirQuadradoNaPosicao() {
        /*
         * Desenvolva uma função para imprimir o quadrado de uma posição na lista,
         * posição essa informada pelo usuário;
         */

        this.imprimirLista();

        System.out.print("Informe uma posição da lista: ");

        int posicao = this.scan.nextInt();

        int quadrado = (int) Math.pow((double)lista.get(posicao),2.0);

        System.out.printf("Quadrado: %d\n", quadrado);
    }

}