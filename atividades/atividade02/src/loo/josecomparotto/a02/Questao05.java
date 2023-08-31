package loo.josecomparotto.a02;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome,
                endereco, telefone;

        System.out.print("Informe o nome do cliente: ");
        nome = scan.nextLine();

        System.out.print("Informe o endereço do cliente: ");
        endereco = scan.nextLine();

        System.out.print("Informe o telefone do cliente: ");
        telefone = scan.nextLine();

        System.out.println();
        System.out.println("Dados do cliente:");
        System.out.println();

        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);

        scan.close();
    }

}
