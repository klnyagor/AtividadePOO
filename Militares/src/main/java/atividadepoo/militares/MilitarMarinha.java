package atividadepoo.militares;

/**
 *
 * @author Yagor
 */
public class MilitarMarinha extends Militar {
    private boolean participouConsertoAviao;

    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
        super(matricula, patente);
        this.participouConsertoAviao = participouConsertoAviao;
    }

    @Override
    public boolean podeProgredir() {
        return isParticipouConsertoAviao();
    }
    
    
    public boolean isParticipouConsertoAviao() {
        return participouConsertoAviao;
    }

    public void setParticipouConsertoAviao(boolean participouConsertoAviao) {
        this.participouConsertoAviao = participouConsertoAviao;
    }
    
}
