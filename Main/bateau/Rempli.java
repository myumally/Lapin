package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class EtatCaisse{
    public void AddAnimal(Animaux an){
        caisse.getAnimaux().add(an);
        caisse.setNbAnimaux(caisse.getNbAnimaux()+1);
        if (caisse.getNbAnimaux()=caisse.getMax()){
            caisse.setEtat(new Pleine());
        }
    }
    public Animaux RemoveAnimal(int an){
        caisse.getAnimaux().remove(an);
        caisse.setNbAnimaux(caisse.getNbAnimaux()-1);
        if (caisse.getNbAnimaux()=0){
            caisse.setEtat(new Vide());
        }
    }
}