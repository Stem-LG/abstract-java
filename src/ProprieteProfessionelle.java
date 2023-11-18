public class ProprieteProfessionelle extends Propriete {

    private int nbEmployes;
    private boolean estEtatique;

    ProprieteProfessionelle(int i, Personne r, String a, double s, int n, boolean e){
        super(i,r,a,s);
        nbEmployes = n;
        estEtatique = e;
    }

    @Override
    double calculImpots() {
        return estEtatique ? 0 : surface + 30 * nbEmployes;
    }
    
}
