# Atividade 03

| Academico:    | [José A. Q. C. Gomes `@JoseComparotto`](https://github.com/JoseComparotto)                                                                   | RA: 398439413114     |
| ------------- | -------------------------------------------------------------------------------------------------------------------------------------------- | :------------------: |
| Curso:        | Engenharia da Computação                                                                                                                     | Noturno              |
| Professor:    | [Luiz Augusto Rodrigues `@profluizao`](https://github.com/profluizao)                                                                        |                      |
| Disciplina:   | Linguagem Orientada a Objetos                                                                                                                | 2023.2 - 4º Semestre |
| Universidade: | Anhanguera-Uniderp - Matriz                                                                                                                  | Campo Grande, MS     |
| Atividade:    | [Atividade 03](docs/LOO%20-%20Atividade%2003.pdf) | 23/08/2023           |

<h3 id="resumo-a3"> Resumo </h3>

| **Questão** | [1](#questao-a3-q1) | [2](#questao-a3-q2) | [3](#questao-a3-q3) | [4](#questao-a3-q4) | [5](#questao-a3-q5) |
| - | - | - | - | - | - |
| **Resposta** | [-](#resposta-a3-q1) | [B](#resposta-a3-q2) | [A](#resposta-a3-q3) | [C](#resposta-a3-q4) | [B](#resposta-a3-q5) |

<details>

<summary>
<h3 id="questao-a3-q1">Questão 01</h3>

Crie um programa que atenda a especificação dos diagramas abaixo.

</summary>

<p align="center">
  <img src="assets/img/diagrama_base_pessoa.jpg" alt="Diagrama BasePessoa" />
</p>

As classes abaixo devem ser derivadas da classe BasePessoa. Atenção para o construtor das classes Professor e Aluno.

<p align="center">
  <img src="assets/img/diagrama_professor.jpg" alt="Diagrama Professor"/>
  <img src="assets/img/diagrama_aluno.jpg" alt="Diagrama Aluno"/>
</p>

</details>

<h4 id="resposta-a3-q1">Resposta</h4>

<https://github.com/JoseComparotto/loo/blob/ec2dc766b59cf4705c33b2d69a0ecbfbdd3fbe15/src/main/java/loo/josecomparotto/atividades/atividade03/questao01/BasePessoa.java#L1-L107>

<https://github.com/JoseComparotto/loo/blob/ec2dc766b59cf4705c33b2d69a0ecbfbdd3fbe15/src/main/java/loo/josecomparotto/atividades/atividade03/questao01/Aluno.java#L1-L41>

<https://github.com/JoseComparotto/loo/blob/ec2dc766b59cf4705c33b2d69a0ecbfbdd3fbe15/src/main/java/loo/josecomparotto/atividades/atividade03/questao01/Professor.java#L1-L41>

<details>

<summary>
<h3 id="questao-a3-q2">Questão 02</h3>

Considere o trecho de código abaixo.

</summary>

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

- (A) Todas as instâncias de classe podem ser inicializadas corretamente.

- **(B) A propriedade `setId()`, da classe `Classe`, senão existir, não irá gerar  erro de compilação.***

- (C) É correto considerar todas as classes representadas como instanciáveis, segundo os conceitos de Orientação a Objeto.

- (D) É incorreto afirmar que a classe `Produto` herda atributos e propriedades das outras classes.

- (E) O código está semanticamente incorreto, e compilará sem erros ou avisos.

</details>

<h4 id="resposta-a3-q2">Resposta</h4>

```plain
(B) A propriedade setId(), da classe Classe, senão existir, não irá gerar erro de compilação.
```

<h4 id="justificativa-a3-q2">Justificativa</h4>

```plain
A menos que o método esteja sendo chamado explicitamente em alguma linha de código do projeto, não é obrigatório implementar nenhum método getter ou setter. Incusive, nesse caso o metodo referido está implementado na classe pai (BaseIdentificador) e não na classe real (Classe).
```

<details>

<summary>
<h3 id="questao-a3-q3">Questão 03</h3>

Observe o código abaixo, e marque a alternativa correta nas afirmações a seguir.

</summary>

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

- **(A) Se necessário, o programador pode criar uma instância dessa classe, facilitando assim sua operação, bastando adicionar a outra classe a linha de código: `Calculadora calc = new Calculadora()`***

- (B) O uso da palavra reservada abstract não influencia a funcionalidade da classe.

- (C) Os métodos poderiam ser declarados como `abstract`. Assim como está, o compilador irá informar que o código está errado.

- (D) O uso da palavra abstract, tanto na classe como nos métodos, representa que a mesma pode ser chamada diretamente, sem que seja necessário criar uma instância para utilizá-la.

- (E) Baseado na semântica e funcionalidade do código, a classe está escrita incorretamente, e compilará com erros e avisos

</details>

<h4 id="resposta-a3-q3">Resposta</h4>

```plain
(A) Se necessário, o programador pode criar uma instância dessa classe, facilitando assim sua operação, bastando adicionar a outra classe a linha de código: `Calculadora calc = new Calculadora()`
```

<h4 id="justificativa-a3-q3">Justificativa</h4>

```plain
O uso descrito na alternatva é plenamente válido, uma vez que a classe não é abstrata, logo pode ser instanciada diretamente. Além de que a única forma de acessar os métodos da classe é através de uma instancia, pois os métodos não são estáticos.
```

<details>

<summary>
<h3 id="questao-a3-q4">Questão 04</h3>

Considerando a definição de um objeto, na Programação Orientada a Objetos, marque a alternativa correta nas afirmações que explicam a definição.

</summary>

- (A) Um objeto é uma rotina de programação contida em uma classe que pode ser chamada diversas vezes possibilitando assim reuso de código de programação.

- (B) Um objeto é um conjunto de atributos primitivos tipados contido em uma classe.

- **(C) Um objeto é uma entidade que possui um estado e um conjunto definido de operações definidas para funcionar nesse estado.***

- (D) Um objeto é um elemento de uma classe que representa uma operação (a implementação de uma operação).

- (E) Um objeto é uma porção de código que resolve um problema muito específico, parte de um problema maior.

</details>

<h4 id="resposta-a3-q4">Resposta</h4>

```plain
(C) Um objeto é uma entidade que possui um estado e um conjunto definido de operações definidas para funcionar nesse estado.
```

<h4 id="Justificativa-a3-q4">Justificativa</h4>

```plain
Dentre as alternativas, a letra "C" é a que melhor representa o conceito de objeto.
Esclaresendo que o estado mencionado é composto pelo conjunto dos valores de suas propriedades, assim como os métodos definidos em sua classe são as operações que são executadas no contexto do estado de cada objeto.
```

<details>

<summary>
<h3 id="questao-a3-q5">Questão 05</h3>

> *O aumento da produtividade de desenvolvimento e a capacidade de compartilhar o conhecimento adquirido, representa uma vantagem no uso de projetos orientados a objeto.*

Marque a alternativa correta nas afirmações que explicam esse fato.

</summary>

- (A) um objeto pode ser chamado por objetos de classe diferente da sua.
- **(B) as classes podem ser potencialmente reutilizáveis.***
- (C) as classes devem ser concretas ou abstratas.
- (D) todo método pode ser derivado naturalmente das operações de sua classe.
- (E) o encapsulamento impossibilita equívocos de código.

</details>

<h4 id="resposta-a3-q5">Resposta</h4>

```plain
(B) as classes podem ser potencialmente reutilizáveis.
```

<h4 id="justificativa-a3-q5">Justificativa</h4>

```plain
O conceito da Abstração envolve representar entidades da vida real (por exemplo). Isso por si só já torna o código mais organizado e menos trabalhoso de manter.
A reutilização de classes acontece por meio da Herança, que permite criar uma super-classe para simplificar a criação de várias classes com carácterísticas em comum.
```
