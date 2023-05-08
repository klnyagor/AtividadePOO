package atividade.desenhos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class CadastroDeDesenhos {
    private List<Desenho> desenhos;
    
    public CadastroDeDesenhos(){
        desenhos = new ArrayList<Desenho>();
    }
    
    public void adicionarDesenho(Desenho desenho){
        desenhos.add(desenho);
        System.out.println("Desenho adicionado!");
    }
    public void desenharTodos(){
        if(!desenhos.isEmpty()){ 
        //if(desenhos.size() > 0){
            for(Desenho i: desenhos){
                i.desenhar(); 
                //Polimorfismo no método desenhar(), pois irá agir de maneira diferente dependendo do Objeto na variavel i
            }
        }
        else System.out.println("Sua lista de desenhos está vazia! Adicione um novo desenho :)");
    }
    
}
