package atividades.sistemaaluguel;

import java.util.List;

/**
 *
 * @author Yagor
 */
public class Hospede {
    private String nome,cpf,endereco,celular,telefone,email;
    private Arquivos arqHospede;
    private static int contador = 0;
    private int id;

    public Hospede(String nome, String cpf, String endereco, String celular, String telefone, String email) {
        id = ++contador;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        arqHospede = new Arquivos("Hospedes.csv");
    }
    
    public void addLinha(){
        String linha = getId() +","+ nome + ',' + cpf +','+ endereco + ',' + celular + ',' + telefone + ',' + email+';';
        arqHospede.escrever(linha, true);
    }

    public int getId() {
        return id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Hospede{" + "ID = "+getId() +", nome = " + nome + ", cpf = " + cpf + ", endereco = " + endereco + ", celular = " + celular + ", telefone = " + telefone + ", email = " + email + " }";
    }
    
    
}
