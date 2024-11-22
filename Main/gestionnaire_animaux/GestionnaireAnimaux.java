package gestionnaire_animaux;

import java.util.ArrayList;

public abstract class GestionnaireAnimaux{
    protected int nbAnimaux = 0;
    protected ArrayList<Animaux> animaux = new ArrayList<Animaux>();

    protected int nbNewAnimaux;
    protected ArrayList<Animaux> newAnimaux = new ArrayList<Animaux>();

    protected String type;

    public String getType(){
        return type;
    }

    public int getNbAnimaux(){
        return nbAnimaux;
    }

    public void setNbAnimaux(int n){
        nbAnimaux=n;
    }

    public ArrayList<Animaux> getAnimaux(){
        return animaux;
    }

    public void addAnimaux(Animaux an){
        this.nbAnimaux+=1;
        animaux.add(an);
    }

    public Animaux removeAnimaux(int an){
        this.nbAnimaux-=1;
        return animaux.remove(an);
    }

    public int getNbNewAnimaux(){
        return nbNewAnimaux;
    }

    public void setNbNewAnimaux(int n){
        nbNewAnimaux=n;
    }

    public ArrayList<Animaux> getNewAnimaux(){
        return newAnimaux;
    }

    public void addNewAnimaux(Animaux an){
        this.nbNewAnimaux+=1;
        newAnimaux.add(an);
    }

    public Animaux removeNewAnimaux(int an){
        return newAnimaux.remove(an);
    }

    public void GererSaison(){
        for(Animaux an : this.animaux){
            an.GererSaison();
        }
    }

    public void updateAnimaux(){
        for(int i=0; i<this.nbNewAnimaux; i++){
            this.addAnimaux(this.removeNewAnimaux(0));
        }
        this.setNbNewAnimaux(0);
    }
}