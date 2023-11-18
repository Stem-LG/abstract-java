public class Lotissement implements GestionPropriete {
    private Propriete[] tabProp;
    protected int nombre = 0;

    Lotissement(int capacite) {
        if (capacite < GestionPropriete.MAX_PROPRIETES)
            tabProp = new Propriete[capacite];
        else
            System.out.println("capacité invalide");
    }

    @Override
    public boolean ajouter(Propriete p) {
        if (nombre < tabProp.length) {
            // tabProp[nombre++] = p;

            for (int i = 0; i < tabProp.length; i++)
                if (tabProp[i] == null) {
                    tabProp[i] = p;
                    nombre++;
                    return true;
                }

        }
        return false;
    }

    @Override
    public boolean supprimer(Propriete p) {
        for (int i = 0; i < tabProp.length; i++) {
            if (tabProp[i] != null && p.equals(tabProp[i])) {
                tabProp[i] = null;
                nombre--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void afficherProprietes() {
        System.out.println("---details---");
        for (int i = 0; i < tabProp.length; i++)
            if (tabProp[i] != null)
                System.out.println(tabProp[i] + ", impots: " + tabProp[i].calculImpots());
    }

    Propriete getProprieteByIndice(int i) {
        if (i < tabProp.length && i >= 0)
            return tabProp[i];
        return null;
    }

    void minImpots() {
        Propriete min = null;
        for (Propriete p : tabProp) {
            if (min == null && p != null) {
                min = p;
            } else if (p != null && p.calculImpots() < min.calculImpots()) {
                min = p;
            }
        }

        System.out.println("proprietaire: " + min.responsable + ", impot: " + min.calculImpots());
    }

    int getNbPieces() {
        int res = 0;

        for (Propriete p : tabProp) {
            if (p != null && p instanceof ProprietePrivee) {
                res += ((ProprietePrivee) p).getNbPieces();
            }
        }

        return res;
    }

}
