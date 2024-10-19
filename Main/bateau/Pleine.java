package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Pleine extends EtatCaisse{

    public void AddAnimal(Animaux an){ // problem T-T
        caisse.getBateau().AddPassager(an);
        // for (int ani=0; ani<caisse.getMax(); ani++){
        //     caisse.getBateau().AddPassager((Animaux)caisse.getAnimaux().remove(ani));
        // }
        caisse.setNbAnimaux(0);
        caisse.setEtat(new Vide());
        caisse.getEtat().setCaisse(caisse);
    }

    public Animaux RemoveAnimal(int an){
        caisse.setNbAnimaux(caisse.getNbAnimaux()-1);
        caisse.setEtat(new Rempli());
        caisse.getEtat().setCaisse(caisse);
        return (Animaux)caisse.getAnimaux().remove(an);
    }
}