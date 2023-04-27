
package batalha.naval;

/**
 *
 * @author Yagor
 */
public class Arma {
    private String nome;
    private char simbolo;
    private int tamanho;
    
    public Arma(String nome, char simbolo, int tamanho){
        this.nome = nome;
        this.simbolo = simbolo;
        this.tamanho = tamanho;
    }
        
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSimbolo(char simbolo){
        this.simbolo = simbolo;
    }
    public char getSimbolo(){
        return this.simbolo;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return this.tamanho;
    }
}
