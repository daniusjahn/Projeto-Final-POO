public class Filme {

    private String nome;
    private String genero;
    private int codigo;
    private boolean disponivel;

    public Filme(String nome, String genero, int codigo) {
        this.nome = nome;
        this.genero = genero;
        this.codigo = codigo;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}