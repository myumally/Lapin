package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class EtatCaisse{
    public void AddAnimal(Animaux an){
        for (Animaux an : caisse.getAnimaux()){
            caisse.getBateau().AddPassager(caisse.getAnimaux().remove(an));
        }
    }
    public Animaux RemoveAnimal(int an){
        caisse.getAnimaux().remove(an);
    }
}