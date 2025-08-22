# 🔢 Exercício: Variáveis e Tipos Primitivos em Java

Este exercício demonstra como utilizar **variáveis e tipos primitivos** em Java, realizando operações simples como cálculo de **IMC** e **ano de nascimento**.  
O objetivo é praticar **declaração de variáveis**, **operações matemáticas básicas** e o uso de **tipos primitivos** (`int`, `double`, `boolean`, `String`).

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:

- Declare variáveis utilizando diferentes tipos primitivos (`int`, `double`, `boolean`) e também `String`;
- Atribua valores representando informações de uma pessoa, como: nome, idade, altura, peso, ano atual e se é estudante;
- Calcule o **IMC** a partir da altura e peso;
- Calcule o **ano de nascimento** com base no ano atual e idade;
- Imprima no console algumas dessas informações.

---

## 📂 Estrutura de Arquivos

```
Exercicio6/
├── Principal.java // Classe principal com as variáveis e operações
└── README.md // Este documento
```
---
## 💻 Código do Exercício

```java
package Exercicio6;

public class Principal {
    public static void main(String[] args) {

        int idade;
        double altura;
        String nome;
        boolean estudante;
        int anoAtual;
        double peso;

        altura = 1.80;
        peso = 80.00;
        anoAtual = 2025;
        idade = 25;
        estudante = false;
        nome = "Arthur";

        double IMC = peso / (altura * altura);
        int anoNascimento  = anoAtual - idade;

        System.out.println("Nome: " + nome);
    }
}
```
---
# 🔍 Detalhamento das Variáveis e Operações

- idade (int) → Representa a idade em anos
- altura (double) → Altura em metros
- peso (double) → Peso em kg
- anoAtual (int) → Representa o ano atual
- nome (String) → Nome da pessoa
- estudante (boolean) → Indica se a pessoa é estudante (true ou false)
- IMC (double) → Calculado por peso / (altura * altura)
- anoNascimento (int) → Calculado como anoAtual - idade

---

## 💡 Exemplos de Saída
```
Nome: Arthur
```
OBS: O código pode ser expandido para imprimir também idade, IMC e ano de nascimento.

---
#  📚O que você aprende com esse exercício?

- Como declarar variáveis em Java;
- Diferença entre tipos primitivos e objetos (String);
- Operações aritméticas simples;
- Uso do System.out.println() para exibir valores no console.