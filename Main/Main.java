import lapin.*;
import croco.*;
import gestionnaire_animaux.*;
import bateau.*;

import java.util.ArrayList;

public class Main{

    public static void SaisonPasse(Routine rou){
        rou.NouvelleSaison();
        for(GestionnaireAnimaux ga : rou.getGestionnaires()){
            System.out.println(ga.getNbAnimaux());
        }
    }


    public static void main(String[] argv){
        Routine rou= new Routine();
        
        GestionnaireLapin gl = new GestionnaireLapin();
        Lapin.setContext(gl);
        Lapin lapinou1 = gl.CreerLapin();
        Lapin lapinou2 = gl.CreerLapin();
        Lapin lapinou3 = gl.CreerLapin();
        Lapin lapinou4 = gl.CreerLapin();
        
        (Lapin.getContext()).addAnimaux((Animaux)Lapin.getContext().CreerLapin());
        (Lapin.getContext()).addAnimaux((Animaux)Lapin.getContext().CreerLapin());

        GestionnaireCroco gc = new GestionnaireCroco();
        Croco.setContext(gc);
        Croco crocodilou1 = gc.CreerCroco();
        Croco crocodilou = gc.CreerCroco();

        rou.addGestionnaire(gl);
        rou.addGestionnaire(gc);

        Bateau bat = new Bateau();

        CaisseAnimaux<Lapin> caisss = new CaisseAnimaux<Lapin>(3,bat);
        bat.AddCaisse(caisss);

        caisss.AddAnimal(lapinou1);
        System.out.println(caisss.getNbAnimaux()); //1
        System.out.println(bat.getNbPassagers()); //0

        caisss.AddAnimal(lapinou2);
        System.out.println(caisss.getNbAnimaux()); //2
        System.out.println(bat.getNbPassagers()); //0

        caisss.AddAnimal(lapinou3);
        System.out.println(caisss.getNbAnimaux()); //3
        System.out.println(bat.getNbPassagers()); //0

        caisss.AddAnimal(lapinou4);
        System.out.println(caisss.getNbAnimaux()); //0
        System.out.println(bat.getNbPassagers()); //4

        for(int i=0; i<5; i++){
            SaisonPasse(rou);
        }
    }
}