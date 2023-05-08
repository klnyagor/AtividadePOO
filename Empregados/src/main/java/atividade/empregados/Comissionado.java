
package atividade.empregados;

/**
 *
 * @author Yagor
 */
public class Comissionado extends Empregado {
    private double totalVenda,taxaComissao;
    
    public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao){
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double vencimento() {
        return getTotalVenda() * getTaxaComissao();
    }
    
    public String toString(){
        return String.format("Comissionado\n%s; Vencimento: %.2f",super.toString(),this.vencimento());
    }
    
    public void setTotalVenda(double totalVenda){
        this.totalVenda = totalVenda;
    }
    public double getTotalVenda(){
        return totalVenda;
    }
    
    public void setTaxaComissao(double taxaComissao){
        this.taxaComissao = taxaComissao;
    }
    public double getTaxaComissao(){
        return taxaComissao;
    }
}
