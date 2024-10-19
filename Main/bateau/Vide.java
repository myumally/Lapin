package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class EtatCaisse{
    public void AddAnimal(Animaux an){
        caisse.getAnimaux().add(an);
        caisse.setNbAnimaux(caisse.getNbAnimaux()+1);
        caisse.setEtat(new Rempli());
    }
    public Animaux RemoveAnimal(int an){ // ne fait rien

    }
}