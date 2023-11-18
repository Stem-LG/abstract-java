public class LotissementPrivee extends Lotissement {
    
    LotissementPrivee(int c){
        super(c);
    }

    @Override
    public boolean ajouter(Propriete p) {

        if(p instanceof ProprietePrivee)
            return super.ajouter(p);
        
        return false;
    }


    @Override
    ProprietePrivee getProprieteByIndice(int i) {
        return (ProprietePrivee) super.getProprieteByIndice(i);
    }


    //getNbPieces deja verife
}
