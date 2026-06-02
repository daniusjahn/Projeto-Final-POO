public class Menu {

    private Locadora locadora;

    public Menu(Locadora locadora) {
        this.locadora = locadora;
    }

    public void alugarFilme(int codigo) {

        Filme filme = locadora.buscarFilme(codigo);

        if (filme == null) {

            System.out.println("Filme não encontrado.");
            return;
        }

        if (filme.isDisponivel()) {

            filme.setDisponivel(false);

            System.out.println("Filme alugado com sucesso!");

        } else {

            System.out.println("Filme já está alugado.");
        }
    }

    public void devolverFilme(int codigo) {

        Filme filme = locadora.buscarFilme(codigo);

        if (filme == null) {

            System.out.println("Filme não encontrado.");
            return;
        }

        if (!filme.isDisponivel()) {

            filme.setDisponivel(true);

            System.out.println("Filme devolvido com sucesso!");

        } else {

            System.out.println("Filme já está disponível.");
        }
    }

    public void sair() {

        System.out.println("Obrigado por usar a locadora.");
    }
}