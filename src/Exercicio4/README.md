# 🛒 Projeto: Cálculo de Total de Compra com Java (Orientação a Objetos)

Este projeto demonstra um exemplo simples de **orientação a objetos em Java**, focado no cálculo do valor total de uma compra a partir de uma lista de produtos.

---

## 📌 Objetivo

- Criar uma estrutura de classe que represente um **produto**;
- Instanciar diferentes produtos com **preço** e **quantidade**;
- Calcular o valor total da compra multiplicando o preço pela quantidade de cada produto;
- Exibir o valor total da compra.

---

## 🧱 Tecnologias Utilizadas

- Java 21
- IDE: IntelliJ
- Paradigma: Programação Orientada a Objetos (POO)

---

## 📂 Estrutura de Arquivos

```
Exercicio4/
├── Produto.java // Classe com atributos e método de cálculo
├── Principal.java // Classe principal com a lógica de execução
└── README.md // Documentação do projeto
```
---
## 💻 Solução do Exercício
O programa define uma classe Produto com um método que calcula o valor total baseado na quantidade e no preço. Na classe principal, dois produtos são instanciados e adicionados a uma lista. Um laço for-each percorre essa lista somando os valores totais.

---
## 🧾 Código-fonte

```
package Exercicio4;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public double preco() {
        return preco * quantidade;
    }
}
```
```
package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
public static void main(String[] args) {
Produto i1 = new Produto();
i1.quantidade = 2;
i1.preco = 10.00;

        Produto i2 = new Produto();
        i2.quantidade = 2;
        i2.preco = 50.00;

        List<Produto> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);

        double resultado = 0;
        for (Produto produtos : itens) {
            resultado += produtos.preco();
        }

        System.out.printf("Total compra: %.2f", resultado);
    }
}
```
---
## 🧠 Conceitos Aplicados

| Conceito               | Descrição                                                               |
|------------------------|-------------------------------------------------------------------------|
| Classe e Objeto        | Representação de produtos com atributos e métodos                       |
| Encapsulamento         | A lógica de cálculo de preço está dentro da classe `Produto`            |
| Lista (ArrayList)      | Armazena múltiplos objetos `Produto`                                    |
| Laço for-each          | Itera sobre a lista de produtos para somar os valores individuais       |
| Organização em Pacotes | Separação do projeto em pacotes para melhor estrutura e organização     |

---

## 💡 Exemplos de Saída
```
Total compra: 120.00
```

---

## 📚 O que você aprende com esse exercício?
- Criar classes com atributos e métodos em Java

- Instanciar objetos e armazená-los em listas

- Trabalhar com laços de repetição para somar valores

- Aplicar princípios básicos da orientação a objetos

- Estruturar um projeto Java simples, mas funcional