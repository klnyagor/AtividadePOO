package atividadepoo.contas;

/**
 *
 * @author Yagor
 */
public class Contas {

    public static void main(String[] args) {
        CadastroDeContas cadastro = new CadastroDeContas();
        
        Conta c1 = new ContaDeAgua("Ete",29,20,5);
        Conta c2 = new ContaDeAgua("Oto",21,25,5);
        Conta c3 = new ContaDeEnergia("Ata",28,150,10);
        Conta c4 = new ContaDeEnergia("Iti",30,200,10);
        
        cadastro.addConta(c1);
        cadastro.addConta(c2);
        cadastro.addConta(c3);
        cadastro.addConta(c4);
        
        String nome = "Utu";
        System.out.println("Pesquisa: "+nome+" | Resultado: "+cadastro.pesquisarCliente(nome));
        
        String nome2 = "Iti";
        System.out.println("Pesquisa: "+nome+" | Resultado: "+cadastro.pesquisarCliente(nome2));
        
        cadastro.exibirClientes();
        
        cadastro.exibirValorTotal();
        
        
    }
}
