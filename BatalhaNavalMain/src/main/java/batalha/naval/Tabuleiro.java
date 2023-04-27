
package batalha.naval;

import java.util.Scanner;

/**
 *
 * @author Yagor
 */
public class Tabuleiro {
    //Atributos
    private char[][] tabuleiro;
    private int dimensao;
    private Scanner sc;
    
    //Construtor
    public Tabuleiro(int dimensao){
        this.dimensao = 8;
        tabuleiro = new char[dimensao][dimensao];
    }
    
    public char[][] getTabuleiro(){
        return this.tabuleiro;
    }
    
    //Métodos
    public void mostrarTabuleiro(){
        char x = 'A';
        System.out.println("__________________________________");
        System.out.println("    1   2   3   4   5   6   7   8");
        for(char[] t: tabuleiro){
            System.out.print(x++);
            System.out.print(' ');
            for(int i=0; i<t.length;i++){
                if(t[i]=='\0'){
                    System.out.print("|   ");
                }else{
                    System.out.print("| "+t[i]+" ");
                }
            }
            System.out.println('|');
        }
        System.out.println("__________________________________");
    }
    
    public char pedirOrientacao(){
        sc = new Scanner(System.in);
        System.out.println("Digite 'V'(vertical) ou 'H'(horizontal) para escolher a orientação do navio: ");
        char ori = sc.next().toUpperCase().charAt(0);
        return ori;
    }
    public int[] pedirCoordenadas(){
        sc = new Scanner(System.in);
        char[] linhas = {'A','B','C','D','E','F','G','H'};
        System.out.println("Digite a coordenada: (ex: H3)");
        String coordenada = sc.nextLine().toUpperCase();
        int linha = new String(linhas).indexOf(coordenada.charAt(0));
        int coluna = Integer.parseInt(coordenada.substring(1));
        if(linha == -1 || coluna < 1 || coluna > 8){
            System.out.println("<ERRO> Coordenada inválida!");
            return pedirCoordenadas();
        }
        return new int[]{linha, coluna-1};
    }
    
    public boolean posicionarNavio(Arma navio, int linha, int coluna, char ori){
        int tamNavio = navio.getTamanho();
        
        if(ori == 'H'){
        //Horizontal
            if(coluna+tamNavio > dimensao){
                System.out.println("<ERRO> Espaço insuficiente!");
                return false;
            }
            for(int i = coluna; i< coluna+tamNavio; i++){
                if(tabuleiro[linha][i] != '\0'){
                    System.out.println("<ERRO> Posição ocupada!");
                    return false;
                }
            }
            for(int i=coluna; i<coluna+tamNavio;i++){
                tabuleiro[linha][i] = navio.getSimbolo();
            }
        }
        else if(ori == 'V'){
        //Vertical
            if(linha+tamNavio > dimensao){
                System.out.println("<ERRO> Espaço insuficiente!");
                return false;
            }
            for(int i = linha; i< linha+tamNavio; i++){
                if(tabuleiro[i][coluna] != '\0'){
                    System.out.println("<ERRO> Posição ocupada!");
                    return false;
                }
            }
            for(int i=linha; i<linha+tamNavio;i++){
                tabuleiro[i][coluna] = navio.getSimbolo();
            }
        }
        else{
            System.out.println("<ERRO> Orientação inválida!");
            return false;
        }

        System.out.println("<AÇÃO> "+navio.getNome()+" posicionado!");
        return true;
    }
    
    public boolean registrarTiro(int linha, int coluna){
        if(tabuleiro[linha][coluna] == '¤' || tabuleiro[linha][coluna] == '×'){
            System.out.println("<ERRO> Coordenada ja foi escolhida!");
            return false;
        }
        if(tabuleiro[linha][coluna] == '\0'){
            tabuleiro[linha][coluna] = '×';
            System.out.println("<TIRO> × Água! ×");
        }
        else{
            tabuleiro[linha][coluna] = '¤';
            System.out.println("<TIRO> ¤ Acertou! ¤");
        }
        return true;
    }
}
