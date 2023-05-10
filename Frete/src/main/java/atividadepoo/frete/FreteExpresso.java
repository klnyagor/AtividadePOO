package atividadepoo.frete;

/**
 *
 * @author Yagor
 */
public class FreteExpresso extends Frete {
    private double nivelUrgencia;
    
    public FreteExpresso(double distancia, double valor, double nivelUrgencia) {
        super(distancia, valor);
        this.nivelUrgencia = nivelUrgencia;
    }

    @Override
    public double calcularFrete() {
        return (getDistancia()*getValor())+(getNivelUrgencia()*100);
    }

    public double getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(double nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }
    
}
