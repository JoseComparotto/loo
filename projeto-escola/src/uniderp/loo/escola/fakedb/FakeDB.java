package uniderp.loo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import uniderp.loo.escola.dominio.BasePessoa;
import uniderp.loo.escola.dominio.IImpressao;

public abstract class FakeDB<T extends BasePessoa> implements IImpressao{

    private final ArrayList<T> tabela;
    private int proximoId = 1;

    public FakeDB() {
        this.tabela = new ArrayList<>();
    }

    public T insert(T value) {
        value.setCodigo(proximoId++);
        value.setDataInsercao(LocalDate.now());

        tabela.add(value);
        return value;
    }

    public List<T> select(Predicate<T> filtro) {
        return this.tabela.stream().filter(filtro).toList();
    }

    @Override
    public void imprimir() {
        
        System.out.println();
        System.out.println("----------------------------------");
        
        for (T t : tabela) {
            t.imprimir();
        }
        System.out.println("----------------------------------");
        
    }
    
    
}