public abstract class Propriete {
    protected int id;
    protected Personne responsable;
    protected String adresse;
    protected double surface;

    Propriete(int i, Personne r, String a, double s) {
        id = i;
        responsable = r;
        adresse = a;
        surface = s;
    }

    abstract double calculImpots();

    public int getId() {
        return id;
    }


    public boolean equals(Propriete p) {
        return p.getId() == id;
    }

    @Override
    public String toString() {
        return String.format("id: %d, resposable: {%s}, adresse: %s, surface: %f", id, responsable, adresse, surface);
    }
}
