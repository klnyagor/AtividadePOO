
package batalha.naval;

import java.util.Scanner;
/**
 *
 * @author Yagor
 */
public class BatalhaNaval {
    private Jogador[] players;
    private Arma[] armas;
    private int rodadas;
    private Scanner sc;
    
    
    public BatalhaNaval(){
        rodadas = 0;
    }
    
    public void instanciaArmas(){
        armas = new Arma[6];
        for(int i= 0;i<armas.length;i++){
            if(i<3) armas[i] = new Submarino();
            else if(i<5) armas[i] = new Cruzador();
            else armas[i] = new PortaAviao();
        }
    }
    
    public void instanciaJogadores(){
        players = new Jogador[2];
        sc = new Scanner(System.in);
        System.out.println("Digite o nome do Jogador 1: ");
        players[0] = new Jogador(sc.nextLine(),armas);
        System.out.println("Digite o nome do Jogador 2: ");
        players[1] = new Jogador(sc.nextLine(),armas);
    }
    
    public void jogar(){
        instanciaArmas();
        System.out.println("*===~==~=~* BATALHA NAVAL-Light *~=~==~===*");
        System.out.println("Cadastre os jogadores: ");
        instanciaJogadores();
        System.out.println("<AÇÃO> Jogadores Cadastrados");
        System.out.println();
        System.out.println("*===~==~=~* BATALHA NAVAL-Light *~=~==~===*");
        System.out.println("Posicionar embarcações!");
        System.out.println("Cada jogador possui:\n   3 <'S'>Submarino\n   2 <'C'>Cruzador\n   1 <'P'> Porta-Avião ");
        System.out.println("<JOGADOR 1> Posicione seus navios!");
        players[0].posicionarNavios();
        try{
            Thread.sleep(1500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("*===~==~=~* BATALHA NAVAL-Light *~=~==~===*");
        System.out.println("Posicionar embarcações!");
        System.out.println("Cada jogador possui:\n   3 <'S'>Submarino\n   2 <'C'>Cruzador\n   1 <'P'> Porta-Avião ");
        System.out.println("<JOGADOR 2> Posicione seus navios!");
        players[1].posicionarNavios();
        System.out.println();
        try{
            Thread.sleep(1500);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("*===~==~=~* BATALHA NAVAL-Light *~=~==~===*");
        System.out.println("<PREPAREM-SE> Cada jogador possui 2 tiros por rodada!");
        System.out.println("<PREPAREM-SE> INCIANDO A BATALHA!");
        while(true){
        //while(players[0].getVidas()>0 && players[1].getVidas()>0){
            addRound();
            System.out.println();
            for(int i=0;i<2;i++){
                System.out.printf("  *~=~*~=~*  ROUND %d  *~=~*~=~*\n",getRounds());
                players[0].mostarJogoOponente(players[1]);
                System.out.printf("<AÇÃO> Vez do Jogador %s \n",players[0].getNome());
                System.out.printf("<AÇÃO> Informe seu %dº tiro!\n",i+1);
                players[0].atirar(players[1]);
                players[0].mostarJogoOponente(players[1]);
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            if(players[1].getVidas() <= 0) break;
            System.out.println();
            for(int i=0;i<2;i++){
                System.out.printf("  *~=~*~=~*  ROUND %d  *~=~*~=~*\n",getRounds());
                players[1].mostarJogoOponente(players[0]);
                System.out.printf("<AÇÃO> Vez do Jogador %s \n",players[1].getNome());
                System.out.printf("<AÇÃO> Informe seu %dº tiro!\n",i+1);
                players[1].atirar(players[0]);
                players[1].mostarJogoOponente(players[0]);
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            if(players[0].getVidas() <= 0) break;
            
        }
        Jogador vencedor = vitoria(players[0],players[1]);
        System.out.println();
        System.out.println("  *===~==~=~* BATALHA NAVAL-Light *~=~==~===*");
        System.out.printf("  *~=~* Round %d: Jogador %s ganhou! *~=~*\n",getRounds(),vencedor.getNome());
        System.out.println(players[0]);
        System.out.println(players[1]);
        
    }
    
    public Jogador vitoria(Jogador p1, Jogador p2){
        Jogador vencedor;
        if(p1.getVidas()<= 0) vencedor = p2;
        else vencedor = p1;
        return vencedor;
    }
        
    public int getRounds(){
        return this.rodadas;
    }
    public void addRound(){
        rodadas++;
    }
    
}
