public class Fiscalite {
    public static void main(String[] args) throws Exception {

        Personne p1, p2, p3;

        p1 = new Personne(12345678, "louay1", "ghanney1");
        p2 = new Personne(23456789, "louay2", "ghanney2");
        p3 = new Personne(34567890, "louay3", "ghanney3");

        Lotissement l = new Lotissement(10);

        l.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        l.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        l.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        l.ajouter(new ProprieteProfessionelle(4, p3, "Korba", 1000, 50, true));
        l.ajouter(new ProprieteProfessionelle(5, p1, "Bir Bouragba", 2500, 400, false));

        l.afficherProprietes();

        System.out.println("nbPieces: " + l.getNbPieces());

        l.minImpots();

        l.supprimer(l.getProprieteByIndice(2));

        l.afficherProprietes();

        System.out.println("-----------lotissement privée");

        LotissementPrivee lp = new LotissementPrivee(10);

        lp.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
        lp.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lp.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lp.ajouter(new ProprieteProfessionelle(4, p3, "Korba", 1000, 50, true));

        lp.afficherProprietes();
        System.out.println("nbPieces: " + l.getNbPieces());
        lp.supprimer(l.getProprieteByIndice(1));
        lp.afficherProprietes();

    }
}
