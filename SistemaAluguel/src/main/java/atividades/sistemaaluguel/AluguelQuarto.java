package atividades.sistemaaluguel;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Yagor
 */
public class AluguelQuarto {
    private Hospede hospede;
    private Quarto quarto;
    private LocalDateTime entrada,saida;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public AluguelQuarto(Hospede hospede, Quarto quarto, String entrada, String saida) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.entrada = LocalDateTime.parse(entrada,format);
        this.saida = LocalDateTime.parse(saida,format);
    }
    
    @Override
    public String toString() {
        return "AluguelQuarto{" + "\n hospede = " + hospede + ",\n quarto = " + quarto + ",\n entrada = " + entrada.format(format) + ",\n saida = " + saida.format(format) +",\n Diarias = "+ calcularDiaria() +",\n Total a pagar = R$"+String.format("%.2f",calculaValorDiarias())+"\n}";
    }
    
    public int calcularDiaria(){
        Duration duracao = Duration.between(entrada,saida);
        int diarias = (int)duracao.toDays()+1;
        if(saida.getHour() >= 12){
            diarias++;
        }
        return diarias;
    }
    
    public double calculaValorDiarias(){
        return calcularDiaria() * quarto.getDiaria();
    }
    
    //Get and Setters
    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = LocalDateTime.parse(entrada,format);
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = LocalDateTime.parse(saida,format);
    }

    public DateTimeFormatter getFormat() {
        return format;
    }

    public void setFormat(DateTimeFormatter format) {
        this.format = format;
    }

}
