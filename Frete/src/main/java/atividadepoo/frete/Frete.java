
package atividadepoo.frete;

/**
 *
 * @author Yagor
 */
public abstract class Frete implements Fretavel{
    private double distancia;
    private double valor;
    
    public Frete(double distancia, double valor){
        this.distancia = distancia;
        this.valor = valor;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getValor() {
        return valor;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Frete{" + "distancia=" + distancia + ", valor=" + valor + '}';
    }
    
    
}
