package atividade.empregados;

/**
 *
 * @author Yagor
 */
public class Assalariado extends Empregado {
    private double salario;
    
    public Assalariado(String nome, String sobrenome, String cpf, double salario){
        super(nome,sobrenome,cpf);
        this.salario = salario;
    }
    
    @Override
    public double vencimento() {
        return getSalario();
    }
    
    public String toString(){
        return String.format("Assalariado\n%s; Vencimento: %.2f",super.toString(),this.vencimento());
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    
}
