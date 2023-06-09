package atividades.sistemaaluguel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class Arquivos {
    private String nomeArquivo;
    
    public Arquivos(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
    }
    
    public List<String> ler(){
        List<String> arq = new ArrayList<>();
        try(FileReader fr = new FileReader(nomeArquivo);
                BufferedReader br = new BufferedReader(fr)){
            while(br.ready()){
                String linha = br.readLine();
                arq.add(linha);
            }
        } catch(IOException ex){
            ex.printStackTrace();
        }
        return arq;
    }
    
    public void escrever(String linha, boolean append){
        try(FileWriter fw = new FileWriter(nomeArquivo, append);
                BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(linha);
            bw.newLine();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
