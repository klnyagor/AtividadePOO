package atividadepoo.contas;

/**
 *
 * @author Yagor
 */
public class ContaDeAgua extends Conta {
    private double consumoEmMetroCubico;
    private double valorPorMetroCubico;

    public ContaDeAgua(String nomeDoCliente, int diaDePagamento, double consumoEmMetroCubico, double valorPorMetroCubico) {
        super(nomeDoCliente, diaDePagamento);
        this.consumoEmMetroCubico = consumoEmMetroCubico;
        this.valorPorMetroCubico = valorPorMetroCubico;
    }

    @Override
    public double calcularValor() {
       return getConsumoEmMetroCubico()*valorPorMetroCubico + 30;
    }
    
    
    public double getConsumoEmMetroCubico() {
        return consumoEmMetroCubico;
    }

    public void setConsumoEmMetroCubico(double consumoEmMetroCubico) {
        this.consumoEmMetroCubico = consumoEmMetroCubico;
    }

    public double getValorPorMetroCubico() {
        return valorPorMetroCubico;
    }

    public void setValorPorMetroCubico(double valorPorMetroCubico) {
        this.valorPorMetroCubico = valorPorMetroCubico;
    }
    
    
    
}
