package models;

public class Filme {

    private String titulo;
    private String anoLancamento;
    private String duracaoEmMinutos;
    private String genero;
    private String diretor;
    private String sinopse;

    public Filme() {
    }
    public Filme(FilmeOmdb filmeOmdb) {
       titulo = filmeOmdb.Title();
       anoLancamento = filmeOmdb.Year();
       duracaoEmMinutos = filmeOmdb.Runtime();
       genero = filmeOmdb.Genre();
       diretor = filmeOmdb.Director();
       sinopse = filmeOmdb.Plot();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return  "Informaçõe do filme. " + "\n" +
                "Título: " + titulo + "\n" +
                "Ano de Lançamento: " + anoLancamento + "\n" +
                "Duração em minutos: " + duracaoEmMinutos + "\n" +
                "Gênero: " + genero + "\n" +
                "Diretor: " + diretor + "\n" +
                "Sinopse: " + sinopse + "\n";

    }
}
