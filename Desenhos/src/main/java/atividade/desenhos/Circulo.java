package atividade.desenhos;

/**
 *
 * @author Yagor
 */
public class Circulo implements Desenho {
    private double raio;
    final double PI = Math.PI;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhar Círculo!");
        System.out.print("Raio: "+getRaio()+" || ");
        System.out.print("Area: "+getArea()+" || ");
        System.out.println("Perimetro: "+getPerimetro());
    }
    
    public double getPerimetro(){
        return 2*PI*raio;
    }
    
    public double getArea(){
        return raio*PI*raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }
}
