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

        List<String> funcionariosGanhamMaisDoisMil = funcionarios.stream().filter(f -> f.getSalario()> 2000)
                .map(Funcionario::getNome).collect(Collectors.toList());
        System.out.println("Funcionários que ganham mais de 2 mil: " + funcionariosGanhamMaisDoisMil);

        List<Double> comissaoFuncionariosGanhamMaisDoiMil = funcionarios.stream().filter(f -> f.getSalario() > 2000)
                .map(f -> f.getSalario() * 0.10).collect(Collectors.toList());
        System.out.println("Comissão de 10%: " + comissaoFuncionariosGanhamMaisDoiMil);

        double somaTodosSalarios = funcionarios.stream().map(f -> f.getSalario()).reduce(0.0,Double::sum);
        System.out.println("Soma de todos salários: " + somaTodosSalarios);

    }



    

}
