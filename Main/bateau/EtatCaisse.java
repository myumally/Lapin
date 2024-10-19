package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public abstract class EtatCaisse<A extends Animaux>{
    protected CaisseAnimaux<A> caisse;
    
    public void setCaisse(CaisseAnimaux<A> c){
        caisse=c;
    }

    public CaisseAnimaux<A> getCaisse(){
        return caisse;
    }

    public abstract void AddAnimal(Animaux an);
    public abstract Animaux RemoveAnimal(int an);
}