package Exercicio5;

public class Principal {
    public static void main(String[] args) {
        Filmes filme = new Filmes("Arthur");

        filme.adicionarNota(5);
        filme.adicionarNota(4);
        filme.adicionarNota(5);
        filme.adicionarNota(3);

        System.out.printf("Média de avaliações para %s: %.2f\n",
                filme.getTitulo(), filme.media());








    }
}

