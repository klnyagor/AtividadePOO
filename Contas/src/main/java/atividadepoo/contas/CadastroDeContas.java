package atividadepoo.contas;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Yagor
 */
public class CadastroDeContas {
    private Set<Conta> contas;
    
    public CadastroDeContas(){
        this.contas = new TreeSet<>();
    }
    
    public void addConta(Conta conta){
        contas.add(conta);
    }
    
    public void exibirClientes(){
        for(Conta c: contas){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(c);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void exibirValorTotal(){
        double total = 0;
        for(Conta c: contas){
            total += c.calcularValor(); // Polimorfismo, calcularValor()
        }
        System.out.println(String.format("Valor total de todas as contas: %.2f",total));
    }
    
    public Conta pesquisarCliente(String nome){
        for(Conta c: contas){
            if(c.getNomeDoCliente().equals(nome)){
                return c;
            }
        }
        return null;
    }
}
