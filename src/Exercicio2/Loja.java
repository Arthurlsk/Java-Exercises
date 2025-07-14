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

        if(categoriaCliente != 1 && categoriaCliente != 2){
            System.out.println("Categoria inexistente");
        }

        else if (precoProduto > 100 && categoriaCliente == 1){
            desconto = precoProduto - ((20 * precoProduto) / 100);
            System.out.println("Valor do produto com 20% de desconto: " + desconto);
        }
        else if (precoProduto > 100 && categoriaCliente == 2){
            desconto = precoProduto - ((10 * precoProduto) / 100);
            System.out.println("Valor do produto com 10% de desconto: " + desconto);
        }
        else if (precoProduto <= 100 && categoriaCliente == 1){
            desconto = precoProduto - ((5 * precoProduto) / 100);
            System.out.println("Valor do produto com 5% de desconto: " + desconto);
        }

        else
        System.out.println("Produto sem desconto, valor: " + precoProduto);

        scanner.close();


    }
}
