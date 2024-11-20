package lapin;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Adult extends EtatLapin{

    public void SeReproduire(){
        Lapin.getContext().CreerLapin();
    }

    public void GererSaison(){
        SeReproduire();
    }

    public Adult(Lapin lapinou){
        lap = lapinou;
    }
}