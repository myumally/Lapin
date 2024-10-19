package gestionnaire_animaux;

import java.util.ArrayList;

public abstract class GestionnaireAnimaux{
    protected int nbAnimaux;
    protected ArrayList<Animaux> animaux = new ArrayList<Animaux>();

    public int getNbAnimaux(){
        return nbAnimaux;
    }

    public ArrayList<Animaux> getAnimaux(){
        return animaux;
    }

    public void addAnimaux(Animaux an){
        animaux.add(an);
    }

    public void GererSaison(){
        for(Animaux an : animaux){
            an.GererSaison();
        }
    }
}