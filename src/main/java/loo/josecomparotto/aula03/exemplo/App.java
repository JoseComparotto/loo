package loo.josecomparotto.aula03.exemplo;

import java.time.LocalDate;

/**
 * 2023.2 - LOO - Aula 03
 * 
 * @author José A. Q. C. Gomes
 */
public class App {
    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.setCodigo(1);
        c1.setNome("Pedro");
        c1.setEndereco("Rua da casa do pedro");
        c1.setTelefone("40028922");
        c1.setDataNacimento(LocalDate.of(2003, 8, 22));
        c1.setRg("+55 (67) 9 9909-0909");
        c1.setCpf("777.777.777-77");
        c1.setDataInsercao(LocalDate.now());

        System.out.println(c1);
    }
}
