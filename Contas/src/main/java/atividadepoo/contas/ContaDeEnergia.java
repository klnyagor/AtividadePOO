package atividadepoo.contas;

/**
 *
 * @author Yagor
 */
public class ContaDeEnergia extends Conta {
    private double consumoEmkWh, tarifaPorkWh;

    public ContaDeEnergia(String nomeDoCliente, int diaDePagamento, double consumoEmkWh, double tarifaPorkWh) {
        super(nomeDoCliente, diaDePagamento);
        this.consumoEmkWh = consumoEmkWh;
        this.tarifaPorkWh = tarifaPorkWh;
    }

    @Override
    public double calcularValor() {
        return getConsumoEmkWh()*getTarifaPorkWh() + 22;
    }

    
    public double getConsumoEmkWh() {
        return consumoEmkWh;
    }

    public void setConsumoEmkWh(double consumoEmkWh) {
        this.consumoEmkWh = consumoEmkWh;
    }

    public double getTarifaPorkWh() {
        return tarifaPorkWh;
    }

    public void setTarifaPorkWh(double tarifaPorkWh) {
        this.tarifaPorkWh = tarifaPorkWh;
    }
    
    
}
