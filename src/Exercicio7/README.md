## 🏦 Projeto: Operações Bancárias com Java & Orientação a Objetos

Este exercício demonstra como aplicar os conceitos de interfaces, classes abstratas e herança em Java.
O objetivo é estruturar um sistema simples de banco digital, onde cada operação segue um contrato comum, mas com comportamento específico.

---
## 📝 Objetivo

- Imagine que você está desenvolvendo um sistema para um banco digital, onde todas as operações financeiras precisam ser tratadas de forma uniforme, mas cada uma com seu comportamento específico.
- Crie um programa em Java que:
- Tenha uma interface AcaoBancaria com o método executar(), representando o contrato que toda operação deve seguir;
- Tenha uma classe abstrata OperacaoBancaria que:
- Implemente a interface AcaoBancaria;
- Contenha o atributo valor;
- Possua um construtor para inicializar esse valor;
- Tenha duas subclasses que estendem OperacaoBancaria:
- Deposito: imprime "Depósito de R$[valor] realizado";
- Saque: imprime "Saque de R$[valor] realizado".

---

## 🧱 Tecnologias Utilizadas

- Java 21
- IDE: IntelliJ
- Paradigma: Programação Orientada a Objetos (POO), herança e polimorfismo.

---

## 📂 Estrutura de Arquivos

```
Exercicio7/
├── AcaoBancaria.java       // Interface que define o contrato das operações
├── OperacaoBancaria.java   // Classe abstrata base das operações
├── Deposito.java           // Subclasse que representa o depósito
├── Saque.java              // Subclasse que representa o saque
├── Principal.java          // Classe principal com exemplos de uso
└── README.md               // Este documento
```
---

## 💻 Solução do Exercício

A estrutura segue o padrão de orientação a objetos:

- A interface AcaoBancaria garante que todas as operações tenham o método executar().
- A classe abstrata OperacaoBancaria concentra o atributo comum (valor) e o contrato.
- As classes Deposito e Saque implementam os comportamentos específicos.

---

## 🧾 Código-fonte

```java
package Exercicio7;

public interface AcaoBancaria {
void executar();
}
```
```java
package Exercicio7;

public class OperacaoBancaria implements AcaoBancaria{
    double valor;


    @Override
    public void executar() {

    }

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }
}
```
```java
package Exercicio7;

public class Deposito extends OperacaoBancaria{


    public Deposito(double valor) {
        super(valor);

    }

    @Override
    public void executar() {
        System.out.printf("\nDepósito de R$%.2f realizado",
                valor);
    }
}
```
```java
package Exercicio7;

public class Principal {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(50.50);
        OperacaoBancaria saque = new Saque(80.80);

        deposito.executar();
        saque.executar();
    }
}
```
```java
package Exercicio7;

public class Saque extends OperacaoBancaria{

    public Saque(double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("\nSaque de R$%.2f realizado",
                valor);
    }
}
```
---
## 💡 Exemplos de Saída
```
Depósito de R$50.50 realizado
Saque de R$80.80 realizado

```

---
## 📚 O que você aprende com esse exercício?

- Criação e uso de interfaces em Java;
- Uso de classes abstratas para centralizar lógica comum;
- Aplicação de herança e polimorfismo;
- Estruturação de sistemas orientados a objetos para manutenção e expansão futura;
- Padrão de projeto simples para operações financeiras.






