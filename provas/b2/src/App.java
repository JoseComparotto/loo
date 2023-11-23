import cinema.fakedb.AtorFakeDB;
import cinema.fakedb.FilmeFakeDB;
import cinema.fakedb.FilmePorAtorFakeDB;
import cinema.fakedb.IngressoFakeDB;
import cinema.fakedb.SalaFakeDB;
import cinema.fakedb.SessaoFakeDB;

public class App {
    public static void main(String[] args) throws Exception {

        AtorFakeDB atores = new AtorFakeDB();
        FilmeFakeDB filmes = new FilmeFakeDB();
        FilmePorAtorFakeDB filmesPorAtores = new FilmePorAtorFakeDB(filmes, atores);

        SalaFakeDB salas = new SalaFakeDB();
        SessaoFakeDB sessoes = new SessaoFakeDB(salas);
        IngressoFakeDB ingressos = new IngressoFakeDB(filmes, sessoes);


        atores.Listar();
        filmes.Listar();
        filmesPorAtores.Listar();

        salas.Listar();
        sessoes.Listar();
        ingressos.Listar();
    }
}
