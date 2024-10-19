package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class EtatCaisse{
    public void AddAnimal(Animaux an){
        caisse.getBateau().AddPassager(an)
        for (int ani=0; ani<caisse.getMax; ani++){
            caisse.getBateau().AddPassager(caisse.getAnimaux().remove(ani));
        }
        caisse.setNbAnimaux(0);
        caisse.setEtat(new Vide());
    }
    public Animaux RemoveAnimal(int an){
        caisse.getAnimaux().remove(an);
        caisse.setNbAnimaux(caisse.getNbAnimaux()-1);
        caisse.setEtat(new Rempli());
    }
}