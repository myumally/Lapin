package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class Bateau{
    private int nbPassagers = 0;
    private int nbCaisses = 0;
    private ArrayList<Animaux> passagers = new ArrayList<Animaux>();
    private ArrayList<CaisseAnimaux<? extends Animaux>> caisses = new ArrayList<CaisseAnimaux<? extends Animaux>>();

    public void setNbPassagers(int nb){
        nbPassagers = nb;
    }

    public int getNbPassagers(){
        return nbPassagers;
    }

    public void setNbCaisses(int nb){
        nbCaisses = nb;
    }

    public int getNbCaisses(){
        return nbCaisses;
    }

    public ArrayList<Animaux> getPassagers(){
        return passagers;
    }

    public ArrayList<CaisseAnimaux<? extends Animaux>> getCaisses(){
        return caisses;
    }

    public void AddPassager(Animaux pass){
        passagers.add(pass);
        nbPassagers+=1;
    }

    public Animaux RemovePassager(int pass){
        return passagers.remove(pass);
    }

    public <A extends Animaux> void AddCaisse(CaisseAnimaux<A> c){
        caisses.add(c);
        nbCaisses+=1;
    }

    public CaisseAnimaux<? extends Animaux> RemoveCaisse(int c){
        return caisses.remove(c);
    }

    public void MaintenanceCaisses(){
        for(CaisseAnimaux<? extends Animaux> caisse : this.caisses){
            caisse.Maintenance();
        }
    }
}
