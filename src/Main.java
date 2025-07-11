
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<Integer,String> clientes= new HashMap<>();
        clientes.put(1,"Arthur");
        clientes.put(2,"Arthur2");
        clientes.put(3,"Arthur3");



        Integer idCliente = 2;
        if(clientes.containsKey(idCliente)){
            String nomeCliente = clientes.get(idCliente);
            System.out.println("Cliente: " + nomeCliente);
        }else{
            System.out.println("Cliente nao encontrado com esse id");
        }
    }

}