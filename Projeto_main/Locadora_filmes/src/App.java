public class App {
    public static void main(String[] args) throws Exception {
            Locadora locadora = new Locadora();

            Menu menu = new Menu(locadora);

            Relatorio relatorio = new Relatorio();

            locadora.cadastrarFilme("Vingadores", "Ação", 1);
            locadora.cadastrarFilme("Titanic", "Romance", 2);

            locadora.listarFilmes();

            menu.alugarFilme(1);

            relatorio.mostrarDisponiveis(locadora);

            relatorio.mostrarAlugados(locadora);

            menu.devolverFilme(1);

            menu.sair();
    }
}
