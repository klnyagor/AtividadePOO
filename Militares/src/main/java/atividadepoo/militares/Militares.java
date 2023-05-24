package atividadepoo.militares;

/**
 *
 * @author Yagor
 */
public class Militares {

    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();
        
        Carreira a1 = new MilitarAeronautica(1, "Soldado", 3, 101);
        Militar a2 = new MilitarAeronautica(2, "Soldado", 2, 101);
        MilitarAeronautica a3 = new MilitarAeronautica(3, "Soldado", 3, 100);
        
        Carreira e1 = new MilitarExercito(4,"Cabo",true,true);
        Militar e2 = new MilitarExercito(5,"Cabo",true,false);
        MilitarExercito e3 = new MilitarExercito(6, "Cabo", false, true);
        
        Carreira m1 = new MilitarMarinha(7, "Tenente", true);
        Militar m2 = new MilitarMarinha(8, "Soldado", true);
        MilitarMarinha m3 = new MilitarMarinha(9, "Soldado", true);
        
        cadastro.adicionaMilitar(a1);
        cadastro.adicionaMilitar(a2);
        cadastro.adicionaMilitar(a3);
        
        cadastro.adicionaMilitar(e1);
        cadastro.adicionaMilitar(e2);
        cadastro.adicionaMilitar(e3);
        
        cadastro.adicionaMilitar(m1);
        cadastro.adicionaMilitar(m2);
        cadastro.adicionaMilitar(m3);
        
        cadastro.imprimePodeProgredir();
        
        cadastro.realizarProgressao();
        
    }
}
