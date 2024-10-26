package lapin;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Adult extends EtatLapin{

    public void GererSaison(){
        Lapin.getContext().CreerLapin();
        // System.out.println("    new baby " + Lapin.getContext().getNbNewAnimaux());
    }

    public Adult(Lapin lapinou){
        lap = lapinou;
    }
}