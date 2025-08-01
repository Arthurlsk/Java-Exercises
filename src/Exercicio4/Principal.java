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
        i2.preco = 50;

        List<Produto> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);

        double resultado = 0;
        for (Produto produtos : itens){
            resultado = resultado + produtos.preco();
        }

        System.out.printf("Total compra: %.2f " , resultado);







    }}
