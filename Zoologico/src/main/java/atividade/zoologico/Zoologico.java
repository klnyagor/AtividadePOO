package atividade.zoologico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class Zoologico {
    private List<Animal> animais;
    private int capacidade;
    
    public Zoologico(int capacidade){
        animais = new ArrayList<>();
        this.capacidade = capacidade;
    }
    
    public void adicionar(Animal animal){
        animais.add(animal);
        System.out.println("Animal adicionado ao Zoologico!");
        if(animais.size() > capacidade){
            System.out.println("Zoologico funcionando além de sua capacidade!");
        }
    }
    
    public void statusZoo(){
        System.out.println("Capacidade do Zoologico: "+capacidade);
        System.out.println("Quantidade de animais: "+animais.size());
    }
    
    public void remover(Animal animal){
        if(!animais.isEmpty()){
            animais.remove(animal);
            System.out.println("Animal removido!");
        }else{
            System.out.println("Zoologico vazio!");
        }
    }
    
    public void animarBicharada(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" * Animando os animais! * ");
        for(Animal animal: animais){
            animal.andar();
            animal.emitirSom();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void alimentar(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" * Alimentando os animais! * ");
        for(Animal a: animais){
            a.comer();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
    public void dormir(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(" * Colocando os animais para dormir! * ");
        for(Animal n: animais){
            n.dormir();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    
}
