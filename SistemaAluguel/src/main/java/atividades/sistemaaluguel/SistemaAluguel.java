package atividades.sistemaaluguel;

/**
 *
 * @author Yagor
 */
public class SistemaAluguel {

    public static void main(String[] args) {
        Arquivos arqQuartos = new Arquivos("Quartos.csv");
        arqQuartos.escrever("ID,diaria,capacidade,hasArCondicionado,hasHidroMassagem;", false);
        Quarto q1 = new Quarto(50,4,false,false);
        q1.addLinha();
        Quarto q2 = new Quarto(125,5,true,true);
        q2.addLinha();
        Quarto q3 = new Quarto(75,2,true,true);
        q3.addLinha();
        Quarto q4 = new Quarto(50,2,true,true);
        q4.addLinha();
        
        Cadastro<Quarto> quartos1 = new Cadastro<>();
        quartos1.add(q1);
        quartos1.add(q2);
        quartos1.mostrar();
        Cadastro<Quarto> quartos2 = new Cadastro<>();
        quartos2.add(q3);
        quartos2.add(q4);
        quartos2.mostrar();
        
        Arquivos arqResidencias = new Arquivos("Residencias.csv");
        arqResidencias.escrever("ID,rua,numero,bairro,cep,telefone,email,qntdQuartos;",false);
        Residencia r1 = new Residencia("Rua","777","Bairro","58200-000","(83)90000-0000","r1@email.com",quartos1.getElementos());
        r1.addLinha();
        Residencia r2 = new Residencia("Rua","012","Bairro","58200-000","(83)90001-0001","r2@email.com",quartos2.getElementos());
        r2.addLinha();
        Cadastro<Residencia> residencias = new Cadastro<>();
        residencias.add(r1);
        residencias.add(r2);
        residencias.mostrar();

        Arquivos arqHospedes = new Arquivos("Hospedes.csv");
        arqHospedes.escrever("ID,nome,cpf,endereco,celular,telefone,email;", false);
        Hospede h1 = new Hospede("h1","123.456.789-01","r1","(83)90000-9901","(83)3271-0001","h1@email.com");
        h1.addLinha();
        Hospede h2 = new Hospede("h2","987.654.321-02","r1","(83)90000-9902","(83)3271-0002","h2@email.com");
        h2.addLinha();
        Hospede h3 = new Hospede("h3","123.459.876-03","r2","(83)90000-9903","(83)3271-0003","h3@email.com");
        h3.addLinha();
        Hospede h4 = new Hospede("h4","987.651.234-04","r2","(83)90000-0004","(83)3271-0004","h4@email.com");
        h4.addLinha();
        Cadastro<Hospede> hospedes = new Cadastro<>();
        hospedes.add(h1);
        hospedes.add(h2);
        hospedes.add(h3);
        hospedes.add(h4);
        hospedes.mostrar();
        
        Arquivos arqAlugueis = new Arquivos("Alugueis.csv");
        arqAlugueis.escrever("ID,ID_hospede,ID_quarto,entrada,saida,diarias,valorTotal",false);
        AluguelQuarto a1 = new AluguelQuarto(h1,q1,"12/07/2021 13:42","15/07/2021 11:50");
        AluguelQuarto a2 = new AluguelQuarto(h2,q2,"12/07/2021 17:00","15/07/2021 16:50");
        AluguelQuarto a3 = new AluguelQuarto(h3,q3,"12/07/2021 16:50","15/07/2021 17:00");
        AluguelQuarto a4 = new AluguelQuarto(h4,q4,"12/07/2021 11:00","15/07/2021 13:42");
        Cadastro<AluguelQuarto> alugueis = new Cadastro<>();
        alugueis.add(a1);
        alugueis.add(a2);
        alugueis.add(a3);
        alugueis.add(a4);
        alugueis.mostrar();
        for(AluguelQuarto aq: alugueis.getElementos()){
            aq.addLinha();
        }
                
    }
}
