package uniderp.loo.a2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void exibirMenu() {
        int continuar = 99;
        while (continuar != 9) {
            System.out.println("1- Gerenciar alunos;");
            System.out.println("2- Rendimento escolar;");
            System.out.println("9- Sair;");

            int opcao = this.scan.nextInt();
            switch (opcao) {
                case 1:
                    this.submenuGerenciarAlunos();
                    break;
                case 2:
                    this.submenuRendimentoEscolar();
                    break;
                case 9:
                    continuar = 9;
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
            }
        }
    }

    private void submenuGerenciarAlunos() {
        int continuar = 99;
        while (continuar != 9) {
            System.out.println("1- Adicionar aluno;");
            System.out.println("2- Alterar nome do aluno;");
            System.out.println("3- Excluir aluno;");
            System.out.println("4- Listar todos;");
            System.out.println("5- Selecionar um Aluno da lista;");
            System.out.println("9- Voltar;");

            int opcao = this.scan.nextInt();
            switch (opcao) {
                case 1:
                    this.adicionarAluno();
                    break;
                case 2:
                    this.alterarNomeAluno();
                    break;
                case 3:
                    this.excluirAluno();
                    break;
                case 4:
                    this.listarAlunos();
                    break;
                case 5:
                    this.submenuAdicionarNotas();
                    break;
                case 9:
                    continuar = 9;
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
            }
        }
    }

    private void submenuAdicionarNotas() {
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            System.out.println("Codigo: " + aluno.getCodigo() + " ,Nome: " + aluno.getNome());
        }
        System.out.println("Selecionar um aluno");
        int codigoAluno = scan.nextInt();
        Aluno aluno = null;
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno2 = this.alunos.get(i);

            if (aluno2.getCodigo() == codigoAluno) {
                aluno = aluno2;
                break;
            }
        }

        int continuar = 99;
        while (continuar != 9) {
            System.out.println("1- Adicionar a nota A1 do aluno;");
            System.out.println("2- Adicionar a nota P1 do aluno;");
            System.out.println("3- Adicionar a nota A2 do aluno;");
            System.out.println("4- Adicionar a nota P2 do aluno;");
            System.out.println("5- Calcular media;");
            System.out.println("9- Voltar;");

            int opcao = this.scan.nextInt();
            switch (opcao) {
                case 1:
                    this.definirA1(aluno);
                    break;
                case 2:
                    this.definirP1(aluno);
                    break;
                case 3:
                    this.definirA2(aluno);
                    break;
                case 4:
                    this.definirP2(aluno);
                    break;
                case 5:
                    this.calcularMedia(aluno);
                    break;
                case 9:
                    continuar = 9;
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
            }
        }
    }

    private void submenuRendimentoEscolar() {
        int continuar = 99;
        while (continuar != 9) {
            System.out.println("1- Selecione um aluno;");
            System.out.println("2- Exibir rendimento da turma;");
            System.out.println("9- Voltar;");

            int opcao = this.scan.nextInt();
            switch (opcao) {
                case 1:
                    this.redimentoAluno();
                    break;
                case 2:
                    this.rendimentoTurma();
                    break;
                case 9:
                    continuar = 9;
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
            }
        }
    }

    private void adicionarAluno() {
        int codigo;
        String nome;
        System.out.println("Informe o codigo do aluno:");
        codigo = scan.nextInt();
        scan.nextLine();
        System.out.println("Informe o nome do aluno:");
        nome = scan.nextLine();
        Aluno aluno = new Aluno(codigo, nome);
        alunos.add(aluno);
    }

    private void alterarNomeAluno() {
        int codigo;
        String nome;
        System.out.println("Informe o codigo do aluno:");
        codigo = scan.nextInt();
        scan.nextLine();
        Aluno aluno = null;
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno2 = this.alunos.get(i);

            if (aluno2.getCodigo() == codigo) {
                aluno = aluno2;
                break;
            }
        }
        System.out.println("Informe o novo nome do aluno:");
        nome = scan.nextLine();
        aluno.setNome(nome);
    }

    private void excluirAluno() {
        int codigo;
        System.out.println("Informe o codigo do aluno:");
        codigo = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);

            if (aluno.getCodigo() == codigo) {
                alunos.remove(aluno);
                System.out.println("Aluno removido!");
                break;
            }
        }

    }

    private void listarAlunos() {
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            System.out.println("Codigo: " + aluno.getCodigo() + " ,Nome: " + aluno.getNome());
        }

    }

    private void definirA1(Aluno aluno) {
        System.out.println("Informe a nota A1 do aluno selecionado:");
        double nota = scan.nextDouble();
        aluno.setNotaA1(nota);
    }

    private void definirA2(Aluno aluno) {
        System.out.println("Informe a nota A2 do aluno selecionado:");
        double nota = scan.nextDouble();
        aluno.setNotaA2(nota);
    }

    private void definirP1(Aluno aluno) {
        System.out.println("Informe a nota P1 do aluno selecionado:");
        double nota = scan.nextDouble();
        aluno.setNotaP1(nota);
    }

    private void definirP2(Aluno aluno) {
        System.out.println("Informe a nota P2 do aluno selecionado:");
        double nota = scan.nextDouble();
        aluno.setNotaP2(nota);
    }

    private void calcularMedia(Aluno aluno) {
        double a1, a2, p1, p2, media;
        a1 = aluno.getNotaA1();
        a2 = aluno.getNotaA2();
        p1 = aluno.getNotaP1();
        p2 = aluno.getNotaP2();
        media = ( ((p1 + a1)/2) + ((p2 + a2)/2) )/ 2;
        aluno.setMedia(media);
        System.out.println(" A media do aluno é: " + media);

        if (media >= 6) {
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
    }

    private void redimentoAluno(){
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            System.out.println("Codigo: " + aluno.getCodigo() + " ,Nome: " + aluno.getNome());
        }
        System.out.println("Selecionar um aluno");
        int codigoAluno = scan.nextInt();
        Aluno aluno = null;
        for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno2 = this.alunos.get(i);

            if (aluno2.getCodigo() == codigoAluno) {
                aluno = aluno2;
                break;
            }
        }
        System.out.println("Notas do aluno " + aluno.getNome());
        System.out.println("A1 " +aluno.getNotaA1());
        System.out.println("P1 " +aluno.getNotaP1());
        System.out.println("A2 " +aluno.getNotaA2());
        System.out.println("P2 " +aluno.getNotaP2());
        System.out.println("Media " +aluno.getMedia());
    }

    private void rendimentoTurma(){
       for (int i = 0; i < this.alunos.size(); i++) {
            Aluno aluno = this.alunos.get(i);
            System.out.println("Codigo: " + aluno.getCodigo() + " ,Nome: " + aluno.getNome());
            System.out.print("Notas: " );
            System.out.print("A1: " +aluno.getNotaA1());
            System.out.print(", P1: " +aluno.getNotaP1());
            System.out.print(", A2: " +aluno.getNotaA2());
            System.out.print(", P2: " +aluno.getNotaP2());
            System.out.print(", Media: " +aluno.getMedia());
            System.out.println();
            System.out.println();
        } 

    }



}

