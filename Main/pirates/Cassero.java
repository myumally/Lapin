package pirates;
import bateau.*;
import gestionnaire_animaux.*;

public class Cassero extends Pirate{
    private int id = 0;
    private boolean occupe = false;
    private CaisseAnimaux<? extends Animaux> cible;


    public int getId(){
        return id;
    }

    public void setId(int n){
        id=n;
    }
    
    public boolean IsOccupe(){
        return occupe;
    }

    public void setOccupe(boolean b){
        occupe = b;
    }

    public CaisseAnimaux<? extends Animaux> getCible(){
        return cible;
    }

    public void setCible(CaisseAnimaux<? extends Animaux> nouvelle){
        cible = nouvelle;
    }

    public void trouverCible(){
        this.setCible(this.getBateau().firstToBreak());
        if (getCible() == null)
            setOccupe(false);
        else
            setOccupe(true);
    }

    public void GererSaison(){
        trouverCible();
        if (IsOccupe())
            cible.SeCasse();
    }
}
