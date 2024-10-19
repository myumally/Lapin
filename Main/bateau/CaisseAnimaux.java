package bateau;
import gestionnaire_animaux.*;

import java.util.ArrayList;

public class CaisseAnimaux<A extends Animaux>{

    private static int NB_MAX_ANIMAUX;
    private int nbAnimaux;
    private ArrayList<A> animaux = new ArrayList<A>();
    private EtatCaisse<A> etat;
    private Bateau bateau;

    public static void setMax(int max){
        NB_MAX_ANIMAUX=max;
    }

    public int getMax(){
        return NB_MAX_ANIMAUX;
    }

    public void setNbAnimaux(int nb){
        nbAnimaux = nb;
    }

    public int getNbAnimaux(){
        return nbAnimaux;
    }

    public ArrayList<A> getAnimaux(){
        return animaux;
    }

    public <A extends Animaux> void AddAnimal(A an){
        etat.AddAnimal(an);
    }

    public Animaux RemoveAnimal(int an){
        return etat.RemoveAnimal(an);
    }

    public void setEtat(EtatCaisse<A> e){
        etat=e;
    }

    public EtatCaisse<A> getEtat(){
        return etat;
    }

    public void setBateau(Bateau bat){
        bateau=bat;
    }

    public Bateau getBateau(){
        return bateau;
    }

    public CaisseAnimaux(int max, Bateau bat){
        setMax(max);
        setEtat(new Vide());
        getEtat().setCaisse(this);
        nbAnimaux=0;
        setBateau(bat);
    }
}