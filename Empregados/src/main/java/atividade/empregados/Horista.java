package atividade.empregados;

/**
 *
 * @author Yagor
 */
public class Horista extends Empregado {
    private double precoHora,horasTrabalhadas;
    
    public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas){
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {
       return getPrecoHora() * getHorasTrabalhadas();
    }
    
    public String toString(){
        return String.format("Horista\n%s; Vencimento: %.2f",super.toString(),this.vencimento());
    }
    
    public void setPrecoHora(double precoHora){
        this.precoHora = precoHora;
    }
    public double getPrecoHora(){
        return precoHora;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
}
