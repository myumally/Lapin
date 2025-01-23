import bateau.*;
import croco.*;
import gestionnaire_animaux.*;
import lapin.*;
import humains.*;
import pirates.*;

public class Main{

    public static void SaisonPasse(Routine rou, Bateau bat){
        rou.NouvelleSaison();
        for(GestionnaireAnimaux ga : rou.getGestionnaires()){
            System.out.println(ga.getType()+ " : " + ga.getNbAnimaux());
        }
        for(Pirate pir : rou.getPirates()){
            System.out.println(pir.getClass());
        }
        int c = 1;
        System.out.println("Nombre de caisses : "+ bat.getNbCaisses());
        for(CaisseAnimaux caisss : bat.getCaisses()){
            System.out.println("dans la caisse " + c + " : " + caisss.getNbAnimaux());
            c++;
        }
        System.out.println("se balade sur le bateau : "+ bat.getNbPassagers());
        System.out.println("\n");
    }


    public static void main(String[] argv){
        // Création de la routine
        Routine rou= new Routine();

        // initialisation gestionnaire lapin
        GestionnaireLapin gl = new GestionnaireLapin();
        Lapin.setContext(gl);

        // initialisation gestionnaire lapin
        GestionnaireCroco gc = new GestionnaireCroco();
        Croco.setContext(gc);

        // ajout des gestionnaire dans la routine
        rou.addGestionnaire(gc);
        rou.addGestionnaire(gl);

        // Création du bateau
        Bateau bat = new Bateau();

        // initialisation équipage 1
        Equipage crew1 = new Equipage();
        crew1.setBateau(bat);
        for(int i = 0; i < 10; i++){
            crew1.addPirate(new Cassero());
        }

        // initialisation équipage 2
        Equipage crew2 = new Equipage();
        crew2.setBateau(bat);
        for(int i = 0; i < 10; i++){
            crew1.addPirate(new Reparo());
        }

        // Création des caisses
        for(int i = 0; i < 10; i++){
            bat.AddCaisse(new CaisseAnimaux<Lapin>(3,bat));
            for(int j = 0; j < 3; j++){
                bat.getCaisses().get(bat.getNbCaisses() - 1).AddAnimal(Lapin.getContext().CreerLapin(0,0));
            }
            bat.AddCaisse(new CaisseAnimaux<Croco>(3,bat));
            for(int j = 0; j < 3; j++){
                bat.getCaisses().get(bat.getNbCaisses() - 1).AddAnimal(Croco.getContext().CreerCroco(0,0));
            }
        }

        // update des gestionnaires
        gl.updateAnimaux();
        gc.updateAnimaux();

        // Déroulement des saisons
        for(int i=0; i<7; i++){
            System.out.println("saison : "+ i);
            SaisonPasse(rou, bat);
            System.out.println("\n");
        }
    }
}
