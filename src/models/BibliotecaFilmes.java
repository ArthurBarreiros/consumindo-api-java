package models;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaFilmes {
    private List<Filme> filmes = new ArrayList<>();

    public List<Filme> getFilmes() {
        return filmes;
    }
    public void cadastraFilme(Filme filme) {

        if (!filme.equals(null)) {
            filmes.add(filme);
            System.out.println("Filme adicionado com sucesso!");
        }
        else {
            System.out.println("Não foi possível adicionar o filme na biblioteca!");
        }

    }
    public void descadastraFilme(String titulo) {

        boolean removeu = false;
        for (Filme filme : filmes) {
            if (filme.getTitulo().equals(titulo)) {
                removeu = filmes.remove(filme);
                break;
            }
        }

        if (removeu) {
            System.out.println("Filme removido da sua lista!");
        }
        else {
            System.out.println("Nome do título digitado incorretamente ou inexistente na lista!");
        }
    }
    public void listaFilmes () {

        if (filmes.size() > 0) {
            int contador = 1;
            for (Filme filme : filmes) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println(contador + "#");
                System.out.println(filme);
                contador++;
            }
        }
        else {
            System.out.println("\nLista de filmes vazia!\n");
        }


    }

}
