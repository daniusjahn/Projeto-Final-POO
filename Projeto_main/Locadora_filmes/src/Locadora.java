import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private List<Filme> filmes = new ArrayList<>();

    public void cadastrarFilme(String nome, String genero, int codigo) {

        Filme filme = new Filme(nome, genero, codigo);

        filmes.add(filme);

        System.out.println("Filme cadastrado com sucesso!");
    }

    public void listarFilmes() {

        for (Filme filme : filmes) {

            System.out.println(
                    filme.getNome() + " - " +
                    filme.getCodigo() + " - " +
                    (filme.isDisponivel() ? "Disponível" : "Alugado")
            );
        }
    }

    public Filme buscarFilme(int codigo) {

        for (Filme filme : filmes) {

            if (filme.getCodigo() == codigo) {
                return filme;
            }
        }

        return null;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }
}