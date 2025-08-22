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


        double IMC =  peso / (altura * altura);
        int anoNascimento  = anoAtual - idade;

        System.out.println("Nome: " + nome);







    }

}
