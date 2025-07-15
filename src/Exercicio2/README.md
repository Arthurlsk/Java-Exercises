# 🛍️ Exercício: Cálculo de Desconto em uma Loja com Java

Este exercício tem como objetivo praticar **estruturas condicionais** (`if`, `else if`, `else`) em Java, aplicando regras de negócio simples com base em categorias de clientes e valores de produto.

---

## 📝 Enunciado do Exercício

Crie um programa em Java que:

- Receba o **preço de um produto**;
- Solicite a **categoria do cliente** (`VIP` ou `Comum`);
- Calcule o valor final com desconto de acordo com as regras abaixo:
---
### 💸 Regras de Desconto

| Preço do Produto | Categoria do Cliente | Desconto Aplicado  |
|------------------|----------------------|---------------------|
| > R$ 100,00      | VIP                  | 20%                 |
| > R$ 100,00      | Comum                | 10%                 |
| ≤ R$ 100,00      | VIP                  | 5%                  |
| ≤ R$ 100,00      | Comum                | Sem desconto        |

---

## 📁 Estrutura de Arquivos

```
Exercicio2/
├── Loja.java // Classe principal com lógica condicional
└── README.md // Este documento
```


---

## 💻 Solução do Exercício

O programa solicita o valor do produto e a categoria do cliente, e então utiliza estruturas condicionais para aplicar a regra de desconto correta.

---

## 🧾 Código-fonte

```java
package Exercicio2;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double desconto;

        System.out.println("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.println("Digite sua categoria: (1) VIP ou (2) Comum");
        Integer categoriaCliente = scanner.nextInt();

        if (categoriaCliente != 1 && categoriaCliente != 2) {
            System.out.println("Categoria inexistente");
        } else if (precoProduto > 100 && categoriaCliente == 1) {
            desconto = precoProduto - ((20 * precoProduto) / 100);
            System.out.println("Valor do produto com 20% de desconto: " + desconto);
        } else if (precoProduto > 100 && categoriaCliente == 2) {
            desconto = precoProduto - ((10 * precoProduto) / 100);
            System.out.println("Valor do produto com 10% de desconto: " + desconto);
        } else if (precoProduto <= 100 && categoriaCliente == 1) {
            desconto = precoProduto - ((5 * precoProduto) / 100);
            System.out.println("Valor do produto com 5% de desconto: " + desconto);
        } else {
            System.out.println("Produto sem desconto, valor: " + precoProduto);
        }

        scanner.close();
    }
}
```
---
## 🧠 Conceitos Aplicados

- if para verificar condições para aplicar os descontos
- else if para avaliar múltiplas possibilidades para preços e categorias
- else para garantir um valor padrão caso nenhuma condição anterior seja satisfeita
- Scanner utilizando-o para ler dados de entrada do usuário

---
## ✅ Exemplo de Saída
```
Digite o preço do produto:
120
Digite sua categoria: (1) VIP ou (2) Comum
1
Valor do produto com 20% de desconto: 96.0
```
---
## 📚 O que você aprende com esse exercício?

- Uso de estruturas condicionais (if, else if, else)

- Leitura de entrada do usuário com Scanner

- Aplicação prática de regras de negócio

- Cálculo de porcentagem e lógica com variáveis numéricas

- Tomada de decisão com base em múltiplas condições

