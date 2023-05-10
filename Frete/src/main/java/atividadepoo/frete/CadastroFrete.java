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
    
    
}
