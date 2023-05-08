
package atividade.empregados;

/**
 *
 * @author Yagor
 */
public abstract class Empregado {
    private String nome, sobrenome,cpf;
    
    public Empregado(String nome, String sobrenome, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    public abstract double vencimento();
    
    public String toString(){
        return "Nome: "+getNome()+" "+getSobrenome()+"; CPF: "+getCPF();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getCPF(){
        return cpf;
    }
}
