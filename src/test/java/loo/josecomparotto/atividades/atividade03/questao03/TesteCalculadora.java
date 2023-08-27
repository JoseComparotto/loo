package loo.josecomparotto.atividades.atividade03.questao03;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TesteCalculadora {

    @Test
    public void testeSoma() {

        Calculadora c = new Calculadora();

        int n1 = 40;
        int n2 = 2;

        assertEquals(42, c.Somar(n1, n2));

    }

    @Test
    public void testeSubtracao() {

        Calculadora c = new Calculadora();

        int n1 = 40;
        int n2 = 2;

        assertEquals(38, c.Subtrair(n1, n2));

    }

    @Test
    public void testeDivisao() {

        Calculadora c = new Calculadora();

        int n1 = 40;
        int n2 = 2;

        assertEquals(20, c.Dividir(n1, n2));

    }

    @Test
    public void testeMultiplicacao() {

        Calculadora c = new Calculadora();

        int n1 = 40;
        int n2 = 2;

        assertEquals(80, c.Multiplicar(n1, n2));

    }

}
