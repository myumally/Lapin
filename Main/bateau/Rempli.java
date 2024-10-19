package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class EtatCaisse{
    public void AddAnimal(Animaux an){
        caisse.getAnimaux()..add(an);
    }
    public Animaux RemoveAnimal(int an){
        caisse.getAnimaux().remove(an);
    }
}