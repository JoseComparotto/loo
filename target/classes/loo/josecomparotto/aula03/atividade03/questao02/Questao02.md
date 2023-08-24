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

> ***A) Todas as instâncias de classe podem ser inicializadas corretamente.***
>
> B)  A  propriedade `setId()`, da  classe `Classe`, senão existir, não  irágerar  erro  de compilação.
>
> C) É correto considerar todas as classes representadas como instanciáveis, segundo os conceitos de Orientação a Objeto.
>
> D) É incorreto afirmar que a classe `Produto` herda atributos e propriedades das outras classes.
>
> E) O código está semanticamente incorreto, e compilará sem erros ou avisos.

**Resposta:** **B)** A propriedade `setId()`, da classe `Classe`, senão existir, não irágerar erro de compilação.

**Justificativa**: A menos que o método esteja sendo chamado explicitamente em alguma linha de código do projeto, não é obrigatório implementar os métodos getters e setters. Apesar de que neste caso o metodo referido está implementado na classe `BaseIdentificador` e não na classe `Classe`.
