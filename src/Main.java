import models.BibliotecaFilmes;
import models.Filme;

import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        BibliotecaFilmes bibliotecaFilmes = new BibliotecaFilmes();
        BuscadorDeFilme buscadorDeFilme = new BuscadorDeFilme();

        boolean encerrarSistema = false;
        do {

            System.out.println("--------------------- Sua biblioteca  ---------------------");
            System.out.println("Escolha uma das opções abaixo digitando o número correspondente.");
            System.out.println("1. Cadastrar filme");
            System.out.println("2. Descadastrar filme");
            System.out.println("3. Listar todos os seus filmes");
            System.out.println("4. Sair");
            int opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoEscolhida) {

                case 1:
                    System.out.println("Digite o título para ser adicionado: ");
                    String titulo = scanner.nextLine();
                    Filme filme = buscadorDeFilme.buscaFilme(titulo);
                    bibliotecaFilmes.cadastraFilme(filme);
                    break;
                case 2:
                    System.out.println("Digite o título para ser removido: ");
                    titulo = scanner.nextLine();
                    bibliotecaFilmes.descadastraFilme(titulo);
                    break;
                case 3:
                    bibliotecaFilmes.listaFilmes();
                    break;
                case 4:
                    encerrarSistema = true;
                    break;
            }
        } while (!encerrarSistema);



        scanner.close();
    }
}