class Personne {
    private int cin;
    private String nom, prenom;

    Personne(int c, String n, String p) {
        cin = c;
        nom = n;
        prenom = p;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return String.format("cin: %d, nom: %s, prenom: %s", cin, nom, prenom);
    }

}
