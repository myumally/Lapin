import bateau.*;
import croco.*;
import gestionnaire_animaux.*;
import lapin.*;
import humains.*;
import pirate.*;

public class Main{

    public static void SaisonPasse(Routine rou){
        rou.NouvelleSaison();
        for(GestionnaireAnimaux ga : rou.getGestionnaires()){
            System.out.println(ga.getType()+ " : " + ga.getNbAnimaux());
        }
    }


    public static void main(String[] argv){
        Routine rou= new Routine();
        
        GestionnaireLapin gl = new GestionnaireLapin();
        Lapin.setContext(gl);

        gl.updateAnimaux();
        
        Lapin.getContext().CreerLapin();

        GestionnaireCroco gc = new GestionnaireCroco();
        Croco.setContext(gc);

        gl.updateAnimaux();

        rou.addGestionnaire(gl);
        rou.addGestionnaire(gc);

        Bateau bat = new Bateau();

        CaisseAnimaux<Croco> caisss = new CaisseAnimaux<Croco>(3,bat);
        bat.AddCaisse(caisss);

        caisss.AddAnimal(gc.CreerCroco());
        caisss.SeCasse();
        System.out.println("getClass : " + caisss.getEtat().getClass());

        for(int i=0; i<7; i++){ // 1, 1, 2, 3, 5, 8, 13 et 21
            System.out.println("saison : "+ i);
            SaisonPasse(rou);
            System.out.println("\n");
        }

        for(int i=0; i<10; i++){
            caisss.Maintenance();
            gc.CreerCroco();
            caisss.AddAnimal(gc.CreerCroco());
            System.out.println("dans la caisse : "+ caisss.getNbAnimaux());
            System.out.println("se balade sur le bateau : "+ bat.getNbPassagers());
            System.out.println("\n");
        }

        for(int i=0; i<7; i++){
            System.out.println("saison : "+ i);
            SaisonPasse(rou);
            System.out.println("\n");
        }
    }
}
