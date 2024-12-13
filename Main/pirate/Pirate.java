package pirates;

import humains.*;
import bateau.*;


public abstract class Pirate extends Humains{
    private Bateau bat;

    public void setBateau(Bateau bat){
        bateau=bat;
    }

    public Bateau getBateau(){
        return bateau;
    }

    public abstract void GererSaison();
}