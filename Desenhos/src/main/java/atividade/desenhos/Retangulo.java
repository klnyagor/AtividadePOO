package atividade.desenhos;

/**
 *
 * @author Yagor
 */
public class Retangulo implements Desenho {
    private double largura,comprimento;
    
    public Retangulo(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
    @Override
    public void desenhar(){
        System.out.println("Desenhar Retangulo!");
        System.out.print("Largura: "+getLargura()+" || ");
        System.out.print("Comprimento: "+getComprimento()+" || ");
        System.out.print("Perimetro: "+getPerimetro()+" || ");
        System.out.println("Área: "+getArea());
    }
    
    public double getPerimetro(){
        return largura*2 + comprimento*2;
    }
    
    public double getArea(){
        return comprimento*largura;
    }
    
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getLargura(){
        return largura;
    }
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double getComprimento(){
        return comprimento;
    }
    
}
