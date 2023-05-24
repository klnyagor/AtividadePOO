package atividadepoo.militares;

/**
 *
 * @author aluno
 */
public class MilitarAeronautica extends Militar {
    private int anosPatente, horasVoo;

    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo) {
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }
    
    @Override
    public boolean podeProgredir(){
        return getAnosPatente() > 2 && getHorasVoo() > 100;
    }

    public int getAnosPatente() {
        return anosPatente;
    }

    public void setAnosPatente(int anosPatente) {
        this.anosPatente = anosPatente;
    }

    public int getHorasVoo() {
        return horasVoo;
    }

    public void setHorasVoo(int horasVoo) {
        this.horasVoo = horasVoo;
    }
        
    
}
