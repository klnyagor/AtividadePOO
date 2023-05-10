package atividadepoo.frete;

/**
 *
 * @author Yagor
 */
public class Principal {
    
    public static void main(String[] args){
        CadastroFrete cadastro = new CadastroFrete();
        
        Fretavel frete1 = new FretePadrao(20,10);
        Frete frete2 = new FreteExpresso(30,20,2);
        FreteSuperExpresso frete3 = new FreteSuperExpresso(40,30,3,100);
        
        cadastro.adicionarFrete(frete1);
        cadastro.adicionarFrete(frete2);
        cadastro.adicionarFrete(frete3);
        
        System.out.printf("Valor total: %.2f",cadastro.calcularValorTotal());
    }
}
