package atividadepoo.militares;

/**
 *
 * @author Yagor
 */
public abstract class Militar implements Carreira{
    private int matricula;
    private String patente;

    public Militar(int matricula, String patente) {
        this.matricula = matricula;
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() { // POLIMORFISMO ao ser chamado
        String progredir = this.podeProgredir() ? "SIM" : "NÂO";
//        if(this.podeProgredir()){
//            progredir = "SIM";
//        }
        
        return "Militar{" + "matricula = " + matricula + ", patente = " + patente +", apto = "+progredir+'}';
    }
    
    
    
}
