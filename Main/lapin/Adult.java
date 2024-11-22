package lapin;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Adult extends EtatLapin{

    public void SeReproduire(){
        Lapin.getContext().CreerLapin();
    }

    public void GererSaison(){
        lap.grow();
        if(lap.getAge()<50){
            SeReproduire();
        }
        else{
            Die();
        }
    }

    public Adult(Lapin lapinou){
        lap = lapinou;
    }
}