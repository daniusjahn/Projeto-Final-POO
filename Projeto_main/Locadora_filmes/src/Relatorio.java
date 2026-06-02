public class Relatorio {

    public void mostrarDisponiveis(Locadora locadora) {

        System.out.println("Filmes Disponíveis:");

        for (Filme filme : locadora.getFilmes()) {

            if (filme.isDisponivel()) {

                System.out.println(
                        filme.getNome() +
                        " - " +
                        filme.getCodigo()
                );
            }
        }
    }

    public void mostrarAlugados(Locadora locadora) {

        System.out.println("Filmes Alugados:");

        for (Filme filme : locadora.getFilmes()) {

            if (!filme.isDisponivel()) {

                System.out.println(
                        filme.getNome() +
                        " - " +
                        filme.getCodigo()
                );
            }
        }
    }
}