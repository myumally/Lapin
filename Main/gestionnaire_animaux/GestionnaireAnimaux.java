package gestionnaire_animaux;

import java.util.ArrayList;

public abstract class GestionnaireAnimaux{
    protected int nbAnimaux = 0;
    protected ArrayList<Animaux> animaux = new ArrayList<Animaux>();

    protected int nbNewAnimaux = 0;
    protected ArrayList<Animaux> newAnimaux = new ArrayList<Animaux>();

    protected int nbFatedToDie = 0;
    protected ArrayList<Integer> FatedToDie = new ArrayList<Integer>();

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
        this.nbNewAnimaux-=1;
        return newAnimaux.remove(an);
    }

    public int getNbFatedToDie(){
        return nbFatedToDie;
    }

    public void setNbFatedToDie(int n){
        nbFatedToDie=n;
    }

    public ArrayList<Integer> getFatedToDie(){
        return FatedToDie;
    }

    public void addFatedToDie(int id){
        this.nbFatedToDie+=1;
        FatedToDie.add(id);
    }

    public int removeFatedToDie(int n){
        this.nbFatedToDie-=1;
        return FatedToDie.remove(n);
    }

    public void GererSaison(){
        for(Animaux an : this.animaux){
            an.GererSaison();
        }
    }

    public void updateAnimaux(){
        System.out.printf("\n%s :   new : %d   dead : %d\n", type, nbNewAnimaux, nbFatedToDie);

        System.out.printf("ftd %s : ", this.type);
        for(Integer n : this.FatedToDie){
            System.out.printf("%d   ", n);
        }

        System.out.printf("\nid : ");
        for(Animaux an : animaux){
            System.out.printf("%d   ",an.getId());
        }

        System.out.printf("\n\n");

        int id=-1;
        int i=0;
        while(this.nbFatedToDie>0){
            i=0;
            id=this.removeFatedToDie(0);
            while((i>=0) && (i<nbAnimaux)){
                if(id==getAnimaux().get(i).getId()){
                    this.removeAnimaux(i);
                    i=-1;
                }
                else{
                    i+=1;
                }
            }
            
        }
        while(this.nbNewAnimaux>0){
            this.addAnimaux(this.removeNewAnimaux(0));
        }
    }
}