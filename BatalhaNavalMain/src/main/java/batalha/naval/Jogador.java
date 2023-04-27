
package batalha.naval;

/**
 *
 * @author Yagor
 */
public class Jogador {
    //Atributos
    private String nome;
    private Tabuleiro meuJogo;
    private Tabuleiro oponenteJogo;
    private Arma[] navios;
    private int vidas;
    
    //Construtor
    public Jogador(String nome, Arma[] navios){
        this.nome = nome;
        meuJogo = new Tabuleiro(8);
        oponenteJogo = new Tabuleiro(8);
        this.navios = navios;
        vidas = 0;
    }
    
    public String toString(){
        String jogador = String.format("""
                                       *~*~*    Jogador: %s
                                       *~*~*    Vidas restantes: %d
                                       """,getNome(),getVidas());
        return jogador;
    }
    
    //Métodos
    public void decremento(){
        vidas--;
    }
    public void atirar(Jogador oponente){
        int[] coordenada = meuJogo.pedirCoordenadas();
        //Se coordenada ja foi escolhida, retorna false;
        if(oponente.meuJogo.registrarTiro(coordenada[0], coordenada[1])){
           verificarTiro(coordenada[0],coordenada[1],oponente) ;
        }else{
            atirar(oponente);
        }
    }
    
    public void verificarTiro(int linha, int coluna, Jogador oponente){
        char[][]pontuacao = oponente.meuJogo.getTabuleiro();
        //Tiro acertou navio, -1 ponto de vida;
        if(pontuacao[linha][coluna] == '¤'){
            oponente.decremento();
        }
    }

    public void mostrarMeuJogo(){
        System.out.println("__________________________________");
        System.out.printf("         Tabuleiro de %s \n",getNome());
        meuJogo.mostrarTabuleiro();
    }
    public void mostarJogoOponente(Jogador oponente){
        char[][] tabu = oponente.meuJogo.getTabuleiro();
        char x = 'A';
        System.out.println("__________________________________");
        System.out.printf("         Tabuleiro de %s \n",oponente.getNome());
        System.out.println("__________________________________");
        System.out.println("    1   2   3   4   5   6   7   8"); 
        for(char[] t: tabu){
            System.out.print(x++);
            System.out.print(' ');
            for(int i=0; i<t.length;i++){
                if(t[i]=='\0' || t[i] == 'S' || t[i] == 'C' || t[i] == 'P'){
                    System.out.print("|   ");
                }else{
                    System.out.print("| "+t[i]+" ");
                }
            }
            System.out.println('|');
        }
        System.out.println("__________________________________");
    }
    
    public void posicionarNavios(){
        mostrarMeuJogo();
        for(Arma i: navios){
            System.out.println("Posicionar "+i.getNome());
            int[] coordenada = meuJogo.pedirCoordenadas();
            char ori = meuJogo.pedirOrientacao();
            while(!meuJogo.posicionarNavio(i, coordenada[0], coordenada[1], ori)){
                coordenada = meuJogo.pedirCoordenadas();
                ori = meuJogo.pedirOrientacao();
            }
            mostrarMeuJogo();
            vidas += i.getTamanho();
        }
    }
    
    //Get and Setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getVidas(){
        return this.vidas;
    }
    public void setVidas(int vidas){
        this.vidas = vidas;
    }
    
    public Tabuleiro getMeuJogo(){
        return this.meuJogo;
    }
    public void setMeuJogo(Tabuleiro meuJogo){
        this.meuJogo = meuJogo;
    }
    
    public Tabuleiro getOponenteJogo(){
        return this.oponenteJogo;
    }
    public void setOponenteJogo(Tabuleiro oponenteJogo){
        this.oponenteJogo = oponenteJogo;
    }
}
