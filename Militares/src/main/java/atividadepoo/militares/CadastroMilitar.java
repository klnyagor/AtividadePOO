package atividadepoo.militares;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class CadastroMilitar {
    List<Carreira> militares;

    public CadastroMilitar() {
        this.militares = new ArrayList<>();
    }
    
    public void adicionaMilitar(Carreira m){
        militares.add(m);
    }
    
    public void imprimePodeProgredir(){
        System.out.println("=-= Imprimindo militares aptos =-=");
        for(Carreira m: militares){
            if(m.podeProgredir()){  // POLIMORFISMO método podeProgredir()
                System.out.println(m);
            }
        }
        System.out.println("=-=-=-=-=  Fim  =-=-=-=-=");
    }
    
    public void realizarProgressao(){
        System.out.println("=-= Realizando progressão =-=");
        for(Carreira m: militares){
            if(m.podeProgredir()){ // POLIMORFISO método podeProgredir()
                switch (m.getPatente()) {
                    case "Soldado":
                        System.out.println("=-=-=-=-= UP =-=-=-=-=");
                        System.out.println(m);
                        m.setPatente("Cabo");
                        System.out.println(m);
                        System.out.println("=-=-=-=-=    =-=-=-=-=");
                        break;
                    case "Cabo":
                        System.out.println("=-=-=-=-= UP =-=-=-=-=");
                        System.out.println(m);
                        m.setPatente("Tenente");
                        System.out.println(m);
                        System.out.println("=-=-=-=-=    =-=-=-=-=");
                        break;
                    case "Tenente":
                        System.out.println("Este militar ja alcançou a patente máxima!");
                        System.out.println(m);
                        System.out.println("=-=-=-=-=    =-=-=-=-=");
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println("=-=-=-=-=  Fim  =-=-=-=-=");
    }
}
