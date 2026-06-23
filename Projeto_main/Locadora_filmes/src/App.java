import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Locadora locadora = new Locadora();
        Menu menu = new Menu(locadora);
        Relatorio relatorio = new Relatorio();

        int opcao;

        do {

            System.out.println("\n===== LOCADORA DE FILMES =====");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Alugar Filme");
            System.out.println("4 - Devolver Filme");
            System.out.println("5 - Mostrar Disponíveis");
            System.out.println("6 - Mostrar Alugados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do filme: ");
                    String nome = scanner.nextLine();

                    System.out.print("Gênero do filme: ");
                    String genero = scanner.nextLine();

                    System.out.print("Código do filme: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    locadora.cadastrarFilme(nome, genero, codigo);
                    break;

                case 2:

                    System.out.println("\n=== LISTA DE FILMES ===");
                    locadora.listarFilmes();
                    break;

                case 3:

                    System.out.print("Digite o código do filme: ");
                    codigo = scanner.nextInt();

                    menu.alugarFilme(codigo);
                    break;

                case 4:

                    System.out.print("Digite o código do filme: ");
                    codigo = scanner.nextInt();

                    menu.devolverFilme(codigo);
                    break;

                case 5:

                    relatorio.mostrarDisponiveis(locadora);
                    break;

                case 6:

                    relatorio.mostrarAlugados(locadora);
                    break;

                case 0:

                    menu.sair();
                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        scanner.close();
    }
}