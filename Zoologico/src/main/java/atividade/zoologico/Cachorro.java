package atividade.zoologico;

/**
 *
 * @author Yagor
 */
public class Cachorro implements Animal {
    
    public void andar(){
        System.out.println("Cachorro andando...");
    }
    
    public void emitirSom(){
        System.out.println("Au, au! Au, au...");
    }
    
    public void comer(){
        System.out.println("Cachorro está comendo...");
    }
    
    public void dormir(){
        System.out.println("Cachorro foi dormir!");
    }
}
