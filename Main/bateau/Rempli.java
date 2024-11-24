package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Rempli extends EtatCaisse{

    public void Maintenance(){
    }

    public void AddAnimal(Animaux an){
        caisse.getAnimaux().add(an);
        caisse.setNbAnimaux(caisse.getNbAnimaux()+1);
        if (caisse.getNbAnimaux()==caisse.getMax()){
            caisse.setEtat(new Pleine());
            caisse.getEtat().setCaisse(caisse);
        }
    }

    public Animaux RemoveAnimal(int an){
        caisse.setNbAnimaux(caisse.getNbAnimaux()-1);
        if (caisse.getNbAnimaux()==0){
            caisse.setEtat(new Vide());
            caisse.getEtat().setCaisse(caisse);
        }
        return (Animaux)caisse.getAnimaux().remove(an);
    }
}