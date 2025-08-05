package Exercicio5;

import java.util.ArrayList;

public class Filmes {

    private int nota;
    private String titulo;
    private ArrayList<Integer> avaliacoes;

    public Filmes(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }
    public void adicionarNota(int nota){
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 e 5.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public double media() {
        int soma = 0;
        for(int nota : avaliacoes){
            soma = soma+nota;
        }
        return (double) soma / avaliacoes.size();


    }
}



