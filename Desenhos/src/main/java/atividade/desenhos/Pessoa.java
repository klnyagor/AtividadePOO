package atividade.desenhos;

/**
 *
 * @author Yagor
 */
public class Pessoa implements Desenho {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public void desenhar(){
        System.out.println("Desenhar Pessoa!");
        System.out.print("Nome: "+getNome()+" || ");
        System.out.println("Idade: "+getIdade());
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    
}
