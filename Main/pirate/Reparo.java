package pirates;

import bateau.*;
import gestionnaire_animaux.*;

public class Reparo extends Pirate{
    private int id = 0;
    private bool occupe = false;
    private CaisseAnimaux<? extends Animaux> cible;

    public int getId(){
        return id;
    }

    public void setId(int n){
        id=n;
    }
    
    public bool IsOccupe(){
        return id;
    }

    public void setOccupe(bool b){
        occupe = b;
    }
    
    public CaisseAnimaux<? extends Animaux> getCible(){
        return cible;
    }

    public void setCible(CaisseAnimaux<? extends Animaux> nouvelle){
        cible = nouvelle;
    }

    public void trouverCible(){
        this.setCible(this.getBateau().firstToRepare());
        if (getCible() == null)
            setOccupe(false);
        else
            setOccupe(true);
    }

    public void GererSaison(){
        trouverCible();
        if (IsOccupe())
            cible.Maintenance();
    }
}