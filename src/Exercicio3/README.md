# 🎓 Exercício: Cálculo de Média de Alunos com Java

Este exercício tem como objetivo praticar **estruturas de repetição** (`while`) e **controle de fluxo condicional** em Java, permitindo o cadastro de múltiplos alunos e notas, com cálculo automático da média de cada um.

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:

- Solicite o **nome de um aluno**;
- Permita o cadastro de **múltiplas notas** entre 1 e 10;
- Após a finalização da entrada de notas (com `-1`), calcule e exiba a **média** das notas do aluno;
- Pergunte ao usuário se deseja **cadastrar outro aluno** ou encerrar o programa.

---

## 🎯 Regras de Funcionamento

- O programa deve validar se a nota está entre **1 e 10**;
- Digitar `-1` encerra o cadastro de notas para o aluno atual;
- Se nenhuma nota válida for informada, o programa deve exibir uma mensagem de aviso;
- Após cada aluno, o usuário decide se deseja continuar ou finalizar.

---

## 📁 Estrutura de Arquivos

```
Exercicio3/
├── NotasAluno.java // Código principal do exercício
└── README.md // Este documento
```


---

## 💻 Solução do Exercício

O programa usa dois laços `while`: um para o cadastro de alunos e outro para o cadastro de notas. A média é calculada com `stream().reduce()` e exibida ao final de cada aluno. Ao final, o usuário decide se deseja cadastrar outro aluno.

---

## 🧾 Código-fonte

```java
package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean cadastraAluno = true;

        while (cadastraAluno) {
            System.out.println("Digite o nome do aluno");
            String nomeAluno = scanner.nextLine();

            boolean cadastraNota = true;
            int i = 0;
            List<Double> listaNotas = new ArrayList<>();

            while (cadastraNota) {
                System.out.println("Digite a nota do aluno (1 - 10) ou -1 para finalizar");
                double nota = scanner.nextDouble();
                scanner.nextLine();

                if (nota == -1) {
                    if (i > 0) {
                        double soma = listaNotas.stream().reduce(0.0, Double::sum);
                        double media = soma / i;
                        System.out.println("A média de nota(s) do aluno " + nomeAluno + " é " + media);
                        break;
                    } else {
                        System.out.println("Nenhuma nota cadastrada para o aluno " + nomeAluno);
                    }
                } else if (nota > 10 || nota < 1) {
                    System.out.println("Nota inválida");
                } else {
                    listaNotas.add(nota);
                    i++;
                }
            }

            System.out.println("Digite 1 para cadastrar outro aluno ou 2 para não");
            Integer outroAluno = scanner.nextInt();
            scanner.nextLine();

            if (outroAluno == 1) {
                cadastraAluno = true;
            } else {
                System.out.println("Programa finalizado!");
                cadastraAluno = false;
                break;
            }
        }
        scanner.close();
    }
}
```
---
## 🧠 Conceitos Aplicados
| Conceito  | Descrição                                                 |
| --------- | --------------------------------------------------------- |
| `while`   | Permite repetição para múltiplos alunos e múltiplas notas |
| `if/else` | Controla o fluxo de entrada e valida as notas             |
| `List`    | Armazena todas as notas do aluno atual                    |
| `Stream`  | Usado para somar as notas de forma funcional              |
| `Scanner` | Permite leitura de dados do teclado                       |

---
## ✅ Exemplo de Saída 

```
Digite o nome do aluno
Maria
Digite a nota do aluno (1 - 10) ou -1 para finalizar
8
Digite a nota do aluno (1 - 10) ou -1 para finalizar
9
Digite a nota do aluno (1 - 10) ou -1 para finalizar
-1
A média de nota(s) do aluno Maria é 8.5
Digite 1 para cadastrar outro aluno ou 2 para não
2
Programa finalizado!
```

---

## 📚 O que você aprende com esse exercício?
- Utilizar laços while aninhados

- Criar lógica interativa com o usuário

- Fazer validações numéricas em tempo de execução

- Trabalhar com listas e somatórios

- Organizar o fluxo de entrada e saída com clareza

