
package atividade.empregados;

/**
 *
 * @author Yagor
 */
public class Main_Empregados {

    public static void main(String[] args) {
        FolhaDePagamento boleto = new FolhaDePagamento();
        
        Empregado assalariado = new Assalariado("Huguinho","Pato","123456789-00",1302);
        Empregado comissionado = new Comissionado("Zezinho","Pato","012345678-90",10000,0.2);
        Empregado horista = new Horista("Luisinho","Pato","001234567-89",8,176);
        
        boleto.exibirTodos();
        boleto.adicionarFuncionario(assalariado);
        boleto.adicionarFuncionario(comissionado);
        boleto.adicionarFuncionario(comissionado);
        boleto.adicionarFuncionario(horista);
        
        boleto.exibirTodos();
        
        boleto.calcularValorTotal();
    }
}
