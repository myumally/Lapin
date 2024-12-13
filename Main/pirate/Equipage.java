package pirates;

import java.util.ArrayList;

public class Equipage extends Pirate{
    private int nbPirates = 0;
    private ArrayList<Pirate> equipage = new ArrayList<Pirate>();

    public int getNbPirates(){
        return nbPirates;
    }

    public void setNbPirates(int n){
        nbPirates=n;
    }

    public ArrayList<Pirate> getEquipage(){
        return equipage;
    }

    public void addPirate(Pirate pir){
        this.nbPirates+=1;
        equipage.add(pir);
    }

    public Pirate removePirate(int pir){
        this.nbPirates-=1;
        return equipage.remove(pir);
    }

    public void GererSaison(){
        for(Pirate pir : this.equipage){
            pir.GererSaison();
        }
    }
}