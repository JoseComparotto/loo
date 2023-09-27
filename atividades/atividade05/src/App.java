import loo.josecomparotto.a5.projeto_veiculos_estagiario.Aviao;
import loo.josecomparotto.a5.projeto_veiculos_estagiario.Caminhao;
import loo.josecomparotto.a5.projeto_veiculos_estagiario.Carro;
import loo.josecomparotto.a5.projeto_veiculos_estagiario.Motocicleta;
import loo.josecomparotto.a5.projeto_veiculos_estagiario.Onibus;

public class App {
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(
                1,
                "Caminhão de carga",
                "Volkswagen Constellation",
                "Branco",
                2023,
                2022,
                3,
                12000,
                20000,
                2,
                2,
                10,
                "Volkswagen",
                400,
                "Diesel",
                "José Comparotto",
                "SP",
                "São Paulo",
                "Caminhão",
                1,
                2,
                "ABC1234567890",
                "ABC-1234",
                "1234567890",
                "Madeira",
                7700);

        caminhao.imprimir();

        System.out.println("\n----------------------------------\n");

        Onibus onibus = new Onibus(
                2,
                "Onibus urbano",
                "Marco Polo",
                "Vermelho",
                2015,
                2014,
                2,
                12000,
                20000,
                40,
                3,
                6,
                "Mercedes Bens",
                400,
                "Diesel",
                "Consorcio Guaicurus",
                "MS",
                "Campo Grande",
                "Onibus",
                1,
                150,
                "ABC1234567890",
                "XYZ9H876",
                "51564826",
                70,
                "T. Bandeirantes / T. General Osório");

        onibus.imprimir();

        System.out.println("\n----------------------------------\n");

        Motocicleta motocicleta = new Motocicleta(
                3,
                "Honda CG 160",
                "CG 160",
                "Vermelho",
                2023,
                2023,
                2,
                120,
                200,
                2,
                0,
                2,
                "Honda",
                16,
                "Gasolina",
                "José Comparotto",
                "MS",
                "Campo Grande",
                "Motocicleta",
                1,
                2,
                "RFG598498456",
                "GEW1F34",
                "698484784",
                17,
                160);

        motocicleta.imprimir();

        System.out.println("\n----------------------------------\n");

        Carro carro = new Carro(
                4,
                "Fiat Argo",
                "Argo",
                "Branco",
                2023,
                2023,
                2,
                1200,
                2000,
                5,
                4,
                4,
                "Fiat",
                100,
                "Flex",
                "José Comparotto",
                "MS",
                "Campo Grande",
                "Carro",
                1,
                5,
                "USD3546984289",
                "HQK-9273",
                "6449658495",
                "Hatchback",
                "Dianteira");

        carro.imprimir();

        System.out.println("\n----------------------------------\n");

        Aviao aviao = new Aviao(
                5,
                "Boeing 737-800",
                "737-800",
                "Branco",
                2023,
                2023,
                1,
                100000,
                200000,
                150,
                2,
                2,
                "Boeing",
                20000,
                "Querosene",
                "José Comparotto",
                "RJ",
                "Rio de Janeiro",
                "Aviao",
                2,
                150,
                "PR-WUF",
                "Azul");

        aviao.imprimir();

    }

}
