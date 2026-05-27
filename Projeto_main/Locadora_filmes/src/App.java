public class App {
    public static void main(String[] args) throws Exception {
        Filme filmes1 = new Filme();
        System.out.println("-----------------------------");
        filmes1.cadastrarFilme("O Poderoso Chefão", "Drama", 1);
        filmes1.cadastrarFilme("Vingadores: Ultimato", "Ação", 2);
        filmes1.cadastrarFilme("A Origem", "Ficção Científica", 3);
        System.out.println("-----------------------------");

        filmes1.listarFilmes();

        System.out.println("-----------------------------");

        filmes1.alugarFilme(3);
        filmes1.alugarFilme(2);
        System.out.println("-----------------------------");
        filmes1.mostrarFilmesdisponiveis();
        System.out.println("-----------------------------");

        filmes1.devolverFilme(3);
        System.out.println("-----------------------------");
        filmes1.mostrarFilmesdisponiveis();
        System.out.println("-----------------------------");
        filmes1.sair();
    }
}
