package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Pleine extends EtatCaisse{

    public void Maintenance(){
    }

    public void AddAnimal(Animaux an){
        caisse.getBateau().AddPassager(an);
        SeCasse();
    }

    public Animaux RemoveAnimal(int an){
        caisse.setNbAnimaux(caisse.getNbAnimaux()-1);
        caisse.setEtat(new Rempli());
        caisse.getEtat().setCaisse(caisse);
        return (Animaux)caisse.getAnimaux().remove(an);
    }
}