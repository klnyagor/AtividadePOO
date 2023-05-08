package atividade.desenhos;

/**
 *
 * @author Yagor
 */
public class Quadrado implements Desenho {
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public void desenhar(){
        System.out.println("Desenhar Quadrado!");
        System.out.print("Lado: "+getLado()+" || ");
        System.out.print("Perimetro: "+getPerimetro()+" || ");
        System.out.println("Área: "+getArea());
    }
    
    public double getArea(){
        return lado*lado;
    }
    public double getPerimetro(){
        return lado*4;
    }
    
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }
}
