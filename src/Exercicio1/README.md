💼 Gerenciamento de Funcionários com Java & Streams
Este projeto demonstra como utilizar a API de Streams do Java para realizar operações funcionais sobre uma lista de funcionários. O exercício combina conceitos de orientação a objetos e programação funcional, tornando-se ideal para praticar manipulação de dados com coleções.
📌 Enunciado
Criar um programa que:
- Filtra os funcionários com salário acima de R$ 2.000,00
- Calcula 10% de comissão sobre esses salários
- Soma todos os salários da lista
  📁 Estrutura de Arquivos
  Exercicio1/
  ├── Funcionario.java      // Classe que representa um funcionário com nome e salário
  ├── Principal.java        // Classe principal com as operações usando Streams
  └── README.md             // Este documento


💡 Lógica da Solução
A classe Principal cria uma lista fixa de funcionários e utiliza Streams para aplicar os seguintes filtros e transformações:
- Filtra os funcionários com salários superiores a R$ 2.000
- Calcula a comissão de 10% para os funcionários filtrados
- Soma todos os salários presentes na lista
  📄 Código Principal
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


🔍 Detalhamento das Operações
| Método | Função |
| filter() | Filtra os funcionários com salário superior a R$ 2.000 |
| map() | Transforma os dados (nome ou cálculo da comissão) |
| collect(Collectors.toList()) | Agrupa os resultados em uma lista |
| reduce(0.0, Double::sum) | Soma todos os salários da lista |


📤 Saída Esperada
Funcionários com salário acima de R$2.000: [Arthur, Leonardo, Renate]
Comissões de 10%: [500.0, 250.0, 1000.0]
Soma total dos salários: 20000.0




