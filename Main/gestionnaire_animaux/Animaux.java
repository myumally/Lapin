package gestionnaire_animaux;

import agents.*;

public abstract class Animaux extends Agents{

    protected int genre; // 0 : femelle / 1 : male / 2 : autre
    protected int age=0; // en saison

    public void setAge(int n){
        age=n;
    }

    public void grow(){
        age+=1;
    }

    public int getAge(){
        return age;
    }

    public void setGenre(int n){
        genre=n;
    }

    public int getGenre(){
        return genre;
    }

    public abstract void setId(int n);
    public abstract int getId();

    public abstract void GererSaison();
}
