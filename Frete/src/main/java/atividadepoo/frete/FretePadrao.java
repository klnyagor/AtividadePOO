
package atividadepoo.frete;

/**
 *
 * @author Yagor
 */
public class FretePadrao extends Frete {
    
    public FretePadrao(double distancia, double valor){
        super(distancia, valor);
    }
    
    @Override
    public double calcularFrete() {
        return getDistancia()*getValor();
    }
    
}
