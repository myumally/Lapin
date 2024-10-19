import lapin.*;
import gestionnaire_animaux.*;

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
        
        (Lapin.getContext()).addAnimaux((Animaux)Lapin.getContext().CreerLapin());
        (Lapin.getContext()).addAnimaux((Animaux)Lapin.getContext().CreerLapin());

        rou.addGestionnaire(gl);

        for(int i=0; i<5; i++){
            SaisonPasse(rou);
        }
    }
}