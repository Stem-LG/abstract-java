public class ProprietePrivee extends Propriete {
    protected int nbPieces;

    ProprietePrivee(int i, Personne r, String a, double s, int n) {
        super(i, r, a, s);
        nbPieces = n;
    }

    @Override
    double calculImpots() {
        return 50 * surface / 100 + 10 * nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    @Override
    public String toString() {
        return String.format("%s, nbPieces: %d", super.toString(), nbPieces);
    }

}
