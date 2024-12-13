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

    public void SeCasse(){
        for (int ani=0; ani<caisse.getNbAnimaux(); ani++){
            caisse.getBateau().AddPassager((Animaux)caisse.getAnimaux().remove(0));
        }
        caisse.setNbAnimaux(0);
        caisse.setEtat(new Cassée());
        caisse.getEtat().setCaisse(caisse);
    }

    public abstract void Maintenance();
    public abstract void AddAnimal(Animaux an);
    public abstract Animaux RemoveAnimal(int an);
}