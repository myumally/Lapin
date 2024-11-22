package gestionnaire_animaux;

public abstract class Animaux{

    protected int genre; // 0 : femelle / 1 : male / 2 : autre
    protected int age; // en saison

    public void setAge(int n){
        age=n;
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

    public abstract void GererSaison();
}