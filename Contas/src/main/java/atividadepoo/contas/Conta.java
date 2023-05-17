package atividadepoo.contas;

/**
 *
 * @author Yagor
 */
public abstract class Conta implements Comparable<Conta>{
    private String nomeDoCliente;
    private int diaDePagamento;

    public Conta(String nomeDoCliente, int diaDePagamento) {
        this.nomeDoCliente = nomeDoCliente;
        this.diaDePagamento = diaDePagamento;
    }
 
    public abstract double calcularValor();  

    @Override
    public int compareTo(Conta t) {
        return this.nomeDoCliente.compareTo(t.nomeDoCliente);
    }

    @Override
    public String toString() {
        return "Conta{" + "nomeDoCliente=" + nomeDoCliente + ", diaDePagamento=" + diaDePagamento + '}';
    }
    
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getDiaDePagamento() {
        return diaDePagamento;
    }

    public void setDiaDePagamento(int diaDePagamento) {
        this.diaDePagamento = diaDePagamento;
    }
}
