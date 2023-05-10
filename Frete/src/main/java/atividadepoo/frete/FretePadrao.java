
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
    
    public String toString(){
        return String.format("Frete{distancia = %.2f, valor = %.2f, valorFrete = %.2f}",getDistancia(),getValor(),calcularFrete());
    }
    
}
