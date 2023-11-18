public class Villa extends ProprietePrivee {
    private boolean avecPicine;

    Villa(int i, Personne r, String a, double s, int n, boolean p) {
        super(i, r, a, s, n);
        avecPicine = p;
    }

    @Override
    double calculImpots() {
        return super.calculImpots() + (avecPicine ? 200 : 0);
    }

    @Override
    public String toString() {
        return String.format("%s, avecPicine: %b", super.toString(), avecPicine);
    }
}
