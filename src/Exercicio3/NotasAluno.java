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