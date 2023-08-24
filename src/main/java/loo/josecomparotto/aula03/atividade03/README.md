# Atividade 03

| Uniderp | Engenharia da Computação | Noturno              |
| ------- | -------------------------| -------------------- |
| Academico: | [José A. Q. C. Gomes `@JoseComparotto`](https://github.com/JoseComparotto) | RA: 398439413114 |
| Professor: | [Luiz Augusto Rodrigues `@profluizao`](https://github.com/profluizao) |
| Disciplina: | Linguagem Orientada a Objetos | 2023.2 - 4º Semestre
| Atividade: | [Atividade 03](docs/aula03/LOO - Atividade 03.pdf) | 23/08/2023 |

## Questão 01

Crie um programa que atenda a especificação dos diagramas abaixo.

<p align="center">
  <img src="../../../../../../../assets/img/diagrama_base_pessoa.jpg" alt="Diagrama BasePessoa" />
</p>

As classes abaixo devem ser derivadas da classe BasePessoa. Atenção para o construtor das classes Professor e Aluno.

<p align="center">
  <img src="../../../../../../../assets/img/diagrama_professor.jpg" alt="Diagrama Professor"/>
  <img src="../../../../../../../assets/img/diagrama_aluno.jpg" alt="Diagrama Aluno"/>
</p>

**Resposta:**

<https://github.com/JoseComparotto/loo/blob/98243d9cdab436cc9c1e5734b4f9fbb1edc640e1/src/main/java/loo/josecomparotto/aula03/atividade03/questao01/BasePessoa.java#L1-L107>

<https://github.com/JoseComparotto/loo/blob/98243d9cdab436cc9c1e5734b4f9fbb1edc640e1/src/main/java/loo/josecomparotto/aula03/atividade03/questao01/Aluno.java#L1-L41>

<https://github.com/JoseComparotto/loo/blob/98243d9cdab436cc9c1e5734b4f9fbb1edc640e1/src/main/java/loo/josecomparotto/aula03/atividade03/questao01/Professor.java#L1-L41>

## Questão 02

Considere o trecho de código abaixo.

```java
public abstract class BaseIdentificador {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BaseIdentificador(int id) {
        this.id = id;
    }
}
```

```java
public class Subclasse extends Classe {
    protected String qualificador;

    public String getQualificador() {
        return qualificador;
    }

    public void setQualificador(String qualificador) {
        this.qualificador = qualificador;
    }

    public Subclasse(int id, String nome, String qualificador) {
        super(id, nome);
        this.qualificador = qualificador;
    }
}
```

```java
public class Produto extends Subclasse {
    protected String marcador;

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public Produto(int id, String nome, String qualificador, String marcador) {
        super(id, nome, qualificador);
        this.marcador = marcador;
    }
}
```

Marque a alternativa correta nas afirmações abaixo.

- A) Todas as instâncias de classe podem ser inicializadas corretamente.

- ***B) A propriedade `setId()`, da classe `Classe`, senão existir, não irá gerar  erro de compilação.***

- C) É correto considerar todas as classes representadas como instanciáveis, segundo os conceitos de Orientação a Objeto.

- D) É incorreto afirmar que a classe `Produto` herda atributos e propriedades das outras classes.

- E) O código está semanticamente incorreto, e compilará sem erros ou avisos.

**Resposta:** **B)** A propriedade `setId()`, da classe `Classe`, senão existir, não irá gerar erro de compilação.

**Justificativa**: A menos que o método esteja sendo chamado explicitamente em alguma linha de código do projeto, não é obrigatório implementar nenhum método getter ou setter. Apesar de que neste caso o metodo referido está implementado na classe `BaseIdentificador` e não na classe `Classe`.

## Questão 03

Observe o código abaixo, e marque Verdadeiro ou Falso nas afirmações a seguir.

```java
public class Calculadora {
    public int Somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int Subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int Multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int Dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }
}
```

- ***A) Se necessário, o programador pode criar uma instância dessa classe, facilitando assim sua operação, bastando adicionar a outra classe a linha de código: `Calculadora calc = new Calculadora()`***

- B) O uso da palavra reservada abstract não influencia a funcionalidade da classe.

- C) Os métodos poderiam ser declarados como `abstract`. Assim como está, o compilador irá informar que o código está errado.

- D) O uso da palavra abstract, tanto na classe como nos métodos, representa que a mesma pode ser chamada diretamente, sem que seja necessário criar uma instância para utilizá-la.

- E) Baseado na semântica e funcionalidade do código, a classe está escrita incorretamente, e compilará com erros e avisos

**Respota:** **A)** Se necessário, o programador pode criar uma instância dessa classe, facilitando assim sua operação, bastando adicionar a outra classe a linha de código: `Calculadora calc = new Calculadora()`

**Justificativa:** O uso descrito na alternatva é plenamente válido, uma vez que a classe não é abstrata, logo pode ser instanciada diretamente. Além de que a única forma de acessar os métodos da classe é através de uma instancia, pois os métodos não são estáticos.

## Questão 04

*TODO*

## Questão 05

*TODO*
