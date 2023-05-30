package atividades.sistemaaluguel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yagor
 */
public class Residencia {
    
    private String rua,numero,bairro,cep,telefone,email;
    private List<Quarto> quartos;

    public Residencia(String rua, String numero, String bairro, String cep, String telefone, String email,  List<Quarto> quartos) {
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.numero = numero;
        this.quartos = quartos;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }


    @Override
    public String toString() {
        return "Residencia{" + " rua = " + rua + ", numero = " + numero + ", bairro = " + bairro + ", cep = " + cep + ", telefone = " + telefone + ", email = " + email + ", quartos = " + quartos.size() + " }";
    }

   
    
}
