package atividades.sistemaaluguel;

/**
 *
 * @author Yagor
 */
public class Quarto {
    private double diaria;
    private int capacidade;
    private boolean arCondicionado,hidroMassagem;

    public Quarto(double diaria, int capacidade, boolean arCondicionado, boolean hidroMassagem) {
        this.diaria = diaria;
        this.capacidade = capacidade;
        this.arCondicionado = arCondicionado;
        this.hidroMassagem = hidroMassagem;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean hasArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean hasHidroMassagem() {
        return hidroMassagem;
    }

    public void setHidroMassagem(boolean hidroMassagem) {
        this.hidroMassagem = hidroMassagem;
    }
    
    @Override
    public String toString() {
        String temAr = this.hasArCondicionado() ? "SIM" : "NAO";
        String temHidro = this.hasHidroMassagem() ? "SIM" : "NAO";
        return "Quarto{" + " diaria = R$" + String.format("%.2f",diaria) + ", capacidade = " + capacidade + ", arCondicionado = " + temAr + ", hidroMassagem = " + temHidro + " }";
    }

}
