package atividadepoo.frete;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class CadastroFrete {
    private List<Fretavel> fretes;
    
    public CadastroFrete(){
        fretes = new ArrayList<>();
    }
    
    public void adicionarFrete(Fretavel frete){
        fretes.add(frete);
        System.out.println("Nova frete adicionada!");
    }
    
    public double calcularValorTotal(){
        double total = 0;

            for(Fretavel f: fretes){
                total += f.calcularFrete(); //polimorfismo metodo calcularFrete()
            }

        return total;
    }
    
    public void exibirTodos(){
        if(!fretes.isEmpty()){
            for(Fretavel i: fretes){
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println(i); //Polimorfismo ao utilizar o método toString()
            }
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }else {
            System.out.println("Adicione fretes!");
        }
    }
    
    
}
