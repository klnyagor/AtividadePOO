package atividade.desenhos;

/**
 *
 * @author Yagor
 */
public class Main_Desenhos {

    public static void main(String[] args) {
        CadastroDeDesenhos caderno = new CadastroDeDesenhos();
        
        Desenho pessoa = new Pessoa("Yagor", 26);
        Desenho quadrado = new Quadrado(1);
        Desenho retangulo = new Retangulo(2,3);
        Desenho circulo = new Circulo(4);
        
        caderno.desenharTodos();
        caderno.adicionarDesenho(pessoa);
        caderno.adicionarDesenho(quadrado);
        caderno.adicionarDesenho(retangulo);
        caderno.adicionarDesenho(circulo);
        
        caderno.desenharTodos();
    }
}
