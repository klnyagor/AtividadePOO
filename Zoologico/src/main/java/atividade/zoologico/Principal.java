
package atividade.zoologico;

/**
 *
 * @author Yagor
 */
public class Principal {

    public static void main(String[] args) {
        Zoologico zoo = new Zoologico(10);
        
        Cachorro cachorro = new Cachorro();
        Animal galinha = new Galinha();
        Gato gato = new Gato();
        Animal papagaio = new Papagaio();
        
        Animal dog = new Cachorro();
        Animal cat = new Gato();
        
        zoo.statusZoo();
        zoo.adicionar(cachorro);
        zoo.adicionar(galinha);
        zoo.adicionar(gato);
        zoo.adicionar(papagaio);
        
        zoo.statusZoo();
        zoo.animarBicharada();
        
        zoo.adicionar(cat);
        zoo.adicionar(dog);
        
        zoo.alimentar();
        zoo.dormir();
        
        zoo.statusZoo();
        zoo.remover(dog);
        zoo.remover(cat);
        zoo.statusZoo();
        
        
    }
}
