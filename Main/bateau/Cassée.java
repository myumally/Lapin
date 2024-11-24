package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Cassée extends EtatCaisse{

    public void Réparer(){
        caisse.setEtat(new Vide());
        caisse.getEtat().setCaisse(caisse);
    }

    public void Maintenance(){
        Réparer();
    }

    public void AddAnimal(Animaux an){
        caisse.getBateau().AddPassager(an);
    }

    public Animaux RemoveAnimal(int an){ // ne fait rien
        return null;
    }
}