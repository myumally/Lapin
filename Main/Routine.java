import lapin.*;
import croco.*;
import gestionnaire_animaux.*;
import bateau.*;
import pirates.*;

import java.util.ArrayList;

public class Routine{
    protected int nbGestionnaires;
    protected ArrayList<GestionnaireAnimaux> gestionnaires = new ArrayList<GestionnaireAnimaux>();
    protected ArrayList<Pirate> pirates = new ArrayList<Pirate>();

    public int getNbGestionnaires(){
        return nbGestionnaires;
    }

    public ArrayList<GestionnaireAnimaux> getGestionnaires(){
        return gestionnaires;
    }

    public void addGestionnaire(GestionnaireAnimaux ga){
        gestionnaires.add(ga);
    }

    public ArrayList<Pirate> getPirates(){
        return pirates;
    }

    public void addPirates(Pirate pir){
        pirates.add(pir);
    }

    public void NouvelleSaison(){
        for(Pirate pir : pirates){
            pir.GererSaison();
        }
        for(GestionnaireAnimaux ga : gestionnaires){
            ga.GererSaison();
        }
        for(GestionnaireAnimaux ga : gestionnaires){
            ga.updateAnimaux();
        }
    }
}
