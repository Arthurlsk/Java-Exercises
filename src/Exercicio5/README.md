# 🎬 Projeto: Sistema de Avaliação de Filmes com Java (Orientação a Objetos)

Este projeto demonstra um exemplo simples de **orientação a objetos em Java**, com foco em coletar avaliações de filmes e calcular a média das notas recebidas.

---

## 📌 Objetivo

- Criar uma estrutura de classe que represente um **filme**;
- Permitir a adição de avaliações de **1 a 5**;
- Calcular a **média das avaliações** com precisão decimal;
- Exibir a média das avaliações na saída do programa.

---

## 🧱 Tecnologias Utilizadas

- Java 21
- IDE: IntelliJ
- Paradigma: Programação Orientada a Objetos (POO)

---

## 📂 Estrutura de Arquivos

```
Exercicio5/
├── Filmes.java // Classe com título, lista de avaliações e método de média
├── Principal.java // Classe principal com a lógica de execução
└── README.md // Documentação do projeto
```
## 💻 Solução do Exercício

A classe `Filmes` armazena o título de um filme e uma lista de avaliações. Através de métodos, permite adicionar notas válidas (entre 1 e 5) e calcular a média dessas avaliações. Na classe `Principal`, um filme é criado, avaliado e a média final é exibida.

---

## 🧾 Código-fonte

```java
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
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}


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
```
## 🧠 Conceitos Aplicados

| Conceito               | Descrição                                                              |
|------------------------|------------------------------------------------------------------------|
| Classe e Objeto        | Representação de filmes com atributos e métodos                   |
| Encapsulamento         | A lógica de validação e cálculo da média está dentro da classe Filmes           |
| Lista (ArrayList)      | Armazena múltiplas avaliações de um filme                         |
| Validação de Entrada        | Garante que somente notas de 1 a 5 sejam aceitas     |
| Organização em Pacotes |Estrutura o código em pacotes para melhor organização  |


## 💡 Exemplos de Saída
```
Média de avaliações para Arthur: 4.25

```

---

## 📚 O que você aprende com esse exercício?
- Criar e utilizar classes com atributos e métodos em Java

- Trabalhar com listas para armazenar avaliações

- Calcular média com precisão decimal

- Implementar validações simples para garantir integridade dos dados

- Organizar um projeto Java simples e funcional
