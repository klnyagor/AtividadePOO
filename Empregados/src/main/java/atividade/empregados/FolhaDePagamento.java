package atividade.empregados;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yagor
 */
public class FolhaDePagamento {
    private Set<Empregado> funcionarios;
    
    public FolhaDePagamento(){
        funcionarios = new HashSet<>();
    }
    
    public void adicionarFuncionario(Empregado funcionario){
        if(funcionarios.add(funcionario)){
            System.out.println("Novo funcionario adicionado!");
        }
        else{
            System.out.println("Houve um problema ao adicionar funcionario!");
        }
    }
    
    public void exibirTodos(){
        if(!funcionarios.isEmpty()){
            for(Empregado i: funcionarios){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println(i); //Polimorfismo ao utilizar o método toString()
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }else {
            System.out.println("Adicione funcionarios!");
        }
    }
    
    public String calcularValorTotal(){
        double total = 0;
        for(Empregado i: funcionarios){
            total += i.vencimento(); //Polimorfismo ao utilizar o método vencimento()
        }
        return String.format("Valor total da folha de pagamento: %.2f",total);
    }
}
