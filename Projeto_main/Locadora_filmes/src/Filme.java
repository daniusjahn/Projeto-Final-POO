import java.util.ArrayList;
import java.util.List;

public class Filme {

    String nome;
    String genero;
    int codigo;
    boolean disponivel;

    static List<Filme> filmes = new ArrayList<>();

    public Filme() {

    }

    public Filme(String nome, String genero, int codigo) {

        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public void cadastrarFilme(String nome, String genero, int codigo) {

        Filme novoFilme = new Filme(nome, genero, codigo);

        filmes.add(novoFilme);

        System.out.println("Filme cadastrado com sucesso!");
        System.out.println("O novo filme é: " + nome);
        System.out.println("O código do filme é: " + codigo);
    }

    public void listarFilmes() {

        System.out.println("Lista de filmes:");

        for (Filme filme : filmes) {

            System.out.println(
                filme.nome + " - " +
                filme.codigo + " - " +
                (filme.disponivel ? "Disponível" : "Alugado")
            );
        }
    }

    public void alugarFilme(int codigo) {

        for (Filme filme : filmes) {

            if (filme.codigo == codigo) {

                if (filme.disponivel) {

                    filme.disponivel = false;

                    System.out.println("Filme alugado com sucesso!");

                } else {

                    System.out.println("Filme já está alugado.");
                }

                return;
            }
        }

        System.out.println("Filme não encontrado.");
    }

    public void devolverFilme(int codigo) {

        for (Filme filme : filmes) {

            if (filme.codigo == codigo) {

                if (!filme.disponivel) {

                    filme.disponivel = true;

                    System.out.println("Filme devolvido com sucesso!");

                } else {

                    System.out.println("Filme já está disponível.");
                }

                return;
            }
        }

        System.out.println("Filme não encontrado.");
    }

    public void mostrarFilmesdisponiveis() {

        System.out.println("Filmes disponíveis:");

        for (Filme filme : filmes) {

            if (filme.disponivel) {

                System.out.println(filme.nome + " - " + filme.codigo);
            }
        }
    }

    public void mostrarFilmesalugados() {

        System.out.println("Filmes alugados:");

        for (Filme filme : filmes) {

            if (!filme.disponivel) {

                System.out.println(filme.nome + " - " + filme.codigo);
            }
        }
    }

    public void sair() {

        System.out.println("Obrigado por usar a locadora.");
    }
}