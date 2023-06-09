package atividades.sistemaaluguel;

/**
 *
 * @author Yagor
 */
public class Quarto {
    private static int contador = 0;
    private int id;
    private double diaria;
    private int capacidade;
    private boolean arCondicionado,hidroMassagem;
    private Arquivos arqQuartos;

    public Quarto(double diaria, int capacidade, boolean arCondicionado, boolean hidroMassagem) {
        id = ++contador;
        this.diaria = diaria;
        this.capacidade = capacidade;
        this.arCondicionado = arCondicionado;
        this.hidroMassagem = hidroMassagem;
        arqQuartos = new Arquivos("Quartos.csv");
    }
    
    public void addLinha(){
        String temAr = this.hasArCondicionado() ? "SIM" : "NAO";
        String temHidro = this.hasHidroMassagem() ? "SIM" : "NAO";
        String linha = getId() +","+ String.format("%.2f",diaria) + ',' + capacidade + ',' + temAr + ',' + temHidro +';';
        arqQuartos.escrever(linha,true);
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

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        String temAr = this.hasArCondicionado() ? "SIM" : "NAO";
        String temHidro = this.hasHidroMassagem() ? "SIM" : "NAO";
        return "Quarto{" +"ID = "+ getId() + ", diaria = R$" + String.format("%.2f",diaria) + ", capacidade = " + capacidade + ", arCondicionado = " + temAr + ", hidroMassagem = " + temHidro + " }";
    }

}
