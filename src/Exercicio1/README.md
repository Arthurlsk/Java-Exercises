# 💼 Exercício: Gerenciamento de Funcionários com Java & Streams

Este exercício demonstra como utilizar a **API de Streams** do Java para realizar operações funcionais sobre uma lista de funcionários.  
O objetivo é praticar **orientação a objetos**, **manipulação de listas**, **programação funcional** e **operações com `Stream`** como `filter`, `map`, `reduce` e `collect`.

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:

- Filtre os funcionários com salário **acima de R$ 2.000,00**;
- Calcule **10% de comissão** sobre os salários filtrados;
- Calcule a **soma total dos salários** da lista.

---

## 📁 Estrutura de Arquivos
Exercicio1/
├── Funcionario.java // Classe que representa um funcionário com nome e salário
├── Principal.java // Classe principal com as operações usando Streams
└── README.md // Este documento


---

## 💻 Solução do Exercício

A classe `Principal` cria uma lista de funcionários com nome e salário, e aplica operações usando a API de Streams do Java para:

1. Filtrar salários acima de R$ 2.000;
2. Calcular a comissão de 10% sobre esses salários;
3. Somar todos os salários da lista.

---

## 🧾 Código-fonte

```java
package Exercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
            new Funcionario("Arthur", 5000),
            new Funcionario("Leonardo", 2500),
            new Funcionario("Renate", 10000),
            new Funcionario("Manoel", 1000),
            new Funcionario("Camile", 1500)
        );

        List<String> funcionariosAcimaDoisMil = funcionarios.stream()
            .filter(f -> f.getSalario() > 2000)
            .map(Funcionario::getNome)
            .collect(Collectors.toList());
        System.out.println("Funcionários com salário acima de R$2.000: " + funcionariosAcimaDoisMil);

        List<Double> comissoes = funcionarios.stream()
            .filter(f -> f.getSalario() > 2000)
            .map(f -> f.getSalario() * 0.10)
            .collect(Collectors.toList());
        System.out.println("Comissões de 10%: " + comissoes);

        double totalSalarios = funcionarios.stream()
            .map(Funcionario::getSalario)
            .reduce(0.0, Double::sum);
        System.out.println("Soma total dos salários: " + totalSalarios);
    }
}
```
## 🔍 Detalhamento das Operações

| Método                         | Função                                                                |
|-------------------------------|-----------------------------------------------------------------------|
| `filter()`                     | Filtra funcionários com salário superior a R$ 2.000                   |
| `map()`                        | Transforma os dados (nome ou cálculo da comissão)                    |
| `collect(Collectors.toList())`| Agrupa os resultados em uma lista                                    |
| `reduce(0.0, Double::sum)`     | Soma todos os salários da lista                                      |

---
```
## ✅ Saída Esperada

Funcionários com salário acima de R$2.000: [Arthur, Leonardo, Renate]
Comissões de 10%: [500.0, 250.0, 1000.0]
Soma total dos salários: 20000.0
```
---

## 📚 O que você aprende com esse exercício?

- Criação e uso de classes (`Funcionario`)
- Manipulação de listas em Java
- Aplicação prática da API de `Stream`
- Uso de funções `filter`, `map`, `reduce`, `collect`
- Pensamento funcional em Java (transformações em dados)


