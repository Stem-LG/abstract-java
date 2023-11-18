public class Appartement extends ProprietePrivee {
    private int numEtage;

    Appartement(int i, Personne r, String a, double s, int n, int e) {
        super(i, r, a, s, n);
        numEtage = e;
    }

    @Override
    public String toString() {
        return String.format("%s, numEtage: %d", super.toString(), numEtage);
    }
}
