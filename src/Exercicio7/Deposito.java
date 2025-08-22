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
