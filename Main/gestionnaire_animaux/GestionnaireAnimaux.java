package gestionnaire_animaux;

import java.util.ArrayList;

public abstract class GestionnaireAnimaux{
    protected static int nbAnimaux;
    protected static ArrayList<Animaux> animaux = new ArrayList<Animaux>();

    public static int getNbAnimaux(){
        return nbAnimaux;
    }

    public static ArrayList<Animaux> getAnimaux(){
        return animaux;
    }

    public static void addAnimaux(Animaux an){
        animaux.add(an);
    }

    public void GererSaison(){
        for(Animaux an : animaux){
            an.GererSaison();
        }
    }
}