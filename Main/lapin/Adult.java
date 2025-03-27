package lapin;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Adult extends EtatLapin{

    public void SeReproduire(Lapin lap){
        Lapin.getContext().CreerLapin(lap.getX(), lap.getY());
    }

    public void GererSaison(){
        lap.grow();
        if(lap.getAge() < 40){
            SeReproduire(lap);
        }
        else{
            Die();
        }
    }

    public Adult(Lapin lapinou){
        lap = lapinou;
    }
}
