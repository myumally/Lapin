package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public abstract class EtatCaisse{
    private CaisseAnimaux caisse;
    
    public void setCaisse(CaisseAnimaux c){
        caisse=c;
    }

    public CaisseAnimaux getCaisse(){
        return caisse;
    }

    public abstract void AddAnimal(Animaux an);
    public abstract Animaux RemoveAnimal(int an);
}