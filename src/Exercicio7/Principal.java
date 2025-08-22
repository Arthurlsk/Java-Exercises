package Exercicio7;

public class Principal {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(50.50);
        OperacaoBancaria saque = new Saque(80.80);

        deposito.executar();
        saque.executar();
    }
}
