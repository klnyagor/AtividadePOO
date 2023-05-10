
package atividadepoo.frete;

/**
 *
 * @author Yagor
 */
public class FreteSuperExpresso extends Frete {
    private double nivelUrgencia, valorSeguro;

    public FreteSuperExpresso(double distancia, double valor, double nivelUrgencia, double valorSeguro) {
        super(distancia, valor);
        this.nivelUrgencia = nivelUrgencia;
        this.valorSeguro = valorSeguro;
    }

    @Override
    public double calcularFrete() {
        return getDistancia()*getValor() + getNivelUrgencia()*100 + getValorSeguro();
    }
    
    public String toString(){
        return String.format("Frete{distancia = %.2f, valor = %.2f, nivelUrgencia = %.0f, seguro = %.2f, valorFrete = %.2f}",getDistancia(),getValor(),getNivelUrgencia(),getValorSeguro(),calcularFrete());
    }

    public double getNivelUrgencia() {
        return nivelUrgencia;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setNivelUrgencia(double nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
   
}
