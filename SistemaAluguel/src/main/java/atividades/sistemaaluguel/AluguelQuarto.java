package atividades.sistemaaluguel;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale; //para garantir que valores decimais formatados utlizem . na separação

/**
 *
 * @author Yagor
 */
public class AluguelQuarto {
    private static int contador = 0;
    private int id;
    private Hospede hospede;
    private Quarto quarto;
    private LocalDateTime entrada,saida;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private Arquivos arqAlugueis;

    public AluguelQuarto(Hospede hospede, Quarto quarto, String entrada, String saida) {
        id = ++contador;
        this.hospede = hospede;
        this.quarto = quarto;
        this.entrada = LocalDateTime.parse(entrada,format);
        this.saida = LocalDateTime.parse(saida,format);
        arqAlugueis = new Arquivos("Alugueis.csv");
    }
    
    @Override
    public String toString() {
        return "AluguelQuarto{ ID = "+getId() + ",\n hospede = " + hospede + ",\n quarto = " + quarto + ",\n entrada = " + entrada.format(format) + ",\n saida = " + saida.format(format) +",\n Diarias = "+ calcularDiaria() +",\n Total a pagar = R$"+String.format(Locale.US,"%.2f",calculaValorDiarias())+"\n}";
    }

    public int getId() {
        return id;
    }
    
    public void addLinha(){
        String linha = getId() +","+ hospede.getId() +','+ quarto.getId() +','+ entrada +','+ saida +','+ calcularDiaria() +','+ String.format(Locale.US,"%.2f",calculaValorDiarias())+';';
        arqAlugueis.escrever(linha, true);
    }
    
    public int calcularDiaria(){
        LocalDateTime inicio = entrada.withHour(12).withMinute(0).withSecond(0);
        LocalDateTime fim = saida.withHour(12).withMinute(0).withSecond(0);
        Duration duracao = Duration.between(inicio,fim);
        int diarias = (int)duracao.toDays();
        if(entrada.getHour()<= 12){ ++diarias; }
        if(saida.getHour() >= 12){ ++diarias; }
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
