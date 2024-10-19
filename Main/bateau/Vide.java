package bateau;
import gestionnaire_animaux.*;

import lapin.*;

import java.util.ArrayList;

public class Vide extends EtatCaisse{

    public void AddAnimal(Animaux an){
        caisse.getAnimaux().add(an);
        caisse.setNbAnimaux(caisse.getNbAnimaux()+1);
        caisse.setEtat(new Rempli());
        caisse.getEtat().setCaisse(caisse);
    }

    public Animaux RemoveAnimal(int an){ // ne fait rien
        return null;
    }
}