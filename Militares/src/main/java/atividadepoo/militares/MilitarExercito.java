package atividadepoo.militares;

/**
 *
 * @author Yagor
 */
public class MilitarExercito extends Militar {
    private boolean participouGuerra, ganhouGuerra;

    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }
    
    @Override
    public boolean podeProgredir(){
        return isParticipouGuerra() && isGanhouGuerra();
    }

    public boolean isParticipouGuerra() {
        return participouGuerra;
    }

    public void setParticipouGuerra(boolean participouGuerra) {
        this.participouGuerra = participouGuerra;
    }

    public boolean isGanhouGuerra() {
        return ganhouGuerra;
    }

    public void setGanhouGuerra(boolean ganhouGuerra) {
        this.ganhouGuerra = ganhouGuerra;
    }
    
}
