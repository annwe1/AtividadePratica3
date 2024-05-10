import Abstrata.Desenvolvedor;
import Abstrata.Estagiario;
import Abstrata.Funcionario;
import Abstrata.Gerente;

public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nFUNCIONÁRIO SYSTEM");
        System.out.println("1) Cadastrar Gerente");
        System.out.println("2) Cadastrar Desenvolvedor");
        System.out.println("3) Cadastrar Estagiário");
        System.out.println("4) Procurar Funcionário");
        System.out.println("5) Exibir Salário de Funcionário");
        System.out.println("6) Listar Todos");
        System.out.println("7) Excluir Cadastro Específico");
        System.out.println("8) Excluir Todos os Cadastros");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void excluirCadastro() {
        System.out.println("\nExcluir Funcionário:");
        int matricula = Console.lerInt();

        boolean removido = Cadastro.remover(matricula);
        if (removido) {
            System.out.println("\nFuncionário removido com sucesso!");
        } else {
            System.out.println("\nFuncionário com matrícula " + matricula + " não encontrado.");
        }
    }

    private static void excluirTodosCadastro() {
        Cadastro.limparLista();
        System.out.println("\nTodos os registros foram excluídos.");
    }

    private static void verificarOpcao(int op) {

        int matricula;
        float horas;
        float bonusAnual;
        String dominio;
        String equipe;
        String supervisor;
        String nome;

        switch (op) {
            case 1:

                System.out.println("\nNovo Gerente:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Equipe: ");
                equipe = Console.lerString();

                System.out.print("Bônus: ");
                bonusAnual = Console.lerFloat();

                Gerente g = new Gerente(nome, matricula, bonusAnual, equipe);

                System.out.println(g.trabalhar());
                System.out.println(g.relatarProgresso());

                Cadastro.cadastrar(g);

                System.out.println("\nGerente cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Desenvolvedor:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Dominio: ");
                dominio = Console.lerString();

                Desenvolvedor d = new Desenvolvedor(nome, matricula, dominio);

                System.out.println(d.trabalhar());
                System.out.println(d.relatarProgresso());

                Cadastro.cadastrar(d);

                System.out.println("\nDesenvolvedor cadastrado com sucesso!");

                break;

            case 3:

                System.out.println("\nNovo Estagiário:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Supervisor: ");
                supervisor = Console.lerString();

                System.out.print("Horas: ");
                horas = Console.lerFloat();

                Estagiario e = new Estagiario(nome, matricula, horas, supervisor);

                System.out.println(e.trabalhar());
                System.out.println(e.relatarProgresso());

                Cadastro.cadastrar(e);

                System.out.println("\nEstagiário cadastrado com sucesso!");

                break;


            case 4:

                System.out.println("\nProcurar Funcionário:");

                System.out.print("\nMatricula: ");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {
                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                } else {
                    System.out.println("\nFuncionário não encontrado.");
                }

                break;

            case 5: 
                System.out.println("\nExibir Salário de Funcionário:");
                System.out.print("\nMatrícula do funcionário: ");
                matricula = Console.lerInt();

                Funcionario funcionario = Cadastro.buscar(matricula);

                if (funcionario != null) {
                    System.out.println("\nSalário de " + funcionario.getNome() + ": R$ " + funcionario.calcularSalario());
                } else {
                    System.out.println("\nFuncionário não encontrado.");
                }

                break;

            case 6:

                System.out.println("\nTodos os funcionarios cadastrados:");

                if (Cadastro.getListaFuncionarios() == null || Cadastro.getListaFuncionarios().isEmpty()) {

                    System.out.println("\nNão há funcionarios cadastrados...");
                    return;

                }

                for (Funcionario temp : Cadastro.getListaFuncionarios()) {

                    System.out.println(temp.toString());

                }

                break;

            case 7:
                System.out.println("Excluir Cadastro Específico:");

                System.out.print("\nMatrícula do funcionário a ser excluído: ");
                matricula = Console.lerInt();

                excluirCadastro();

                System.out.println("\nFuncionário removido com sucesso.");

                break;

            case 8:
                System.out.println("\nExcluir Todos os Cadastros:");

                excluirTodosCadastro();

                System.out.println("\nTodos os cadastros foram removidos.");

                break;

            case 0:
                System.out.println("\nO programa foi finalizado...");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;

        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}
