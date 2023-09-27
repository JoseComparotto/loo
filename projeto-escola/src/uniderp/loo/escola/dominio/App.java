package uniderp.loo.escola.dominio;


import uniderp.loo.escola.fakedb.AlunoFakeDB;

public class App{

    public static void main(String[] args) throws Exception {
        AlunoFakeDB alunodb = new AlunoFakeDB();

        alunodb.imprimir();
    }
}
