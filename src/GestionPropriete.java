public interface GestionPropriete {
    final int MAX_PROPRIETES = 100;
    
    void afficherProprietes();
    boolean ajouter(Propriete p);
    boolean supprimer(Propriete p);
}
