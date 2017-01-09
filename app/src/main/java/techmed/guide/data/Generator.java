package techmed.guide.data;

import java.util.ArrayList;
import java.util.List;

import techmed.guide.R;
import techmed.guide.model.Examen;
import techmed.guide.model.ItemPrincipal;
import techmed.guide.model.Organe;

/**
 * Created by Jerome on 05/01/2017.
 */

public class Generator {

    public static final List<ItemPrincipal> itemPrincipaux(){
        ArrayList<ItemPrincipal> items = new ArrayList<>();
        items.add(new ItemPrincipal("Examens"));
        items.add(new ItemPrincipal("Organes"));
        return items;
    }

    public static final List<Organe> listOrganes(){
        ArrayList<Organe> items = new ArrayList<>();
        items.add(new Organe("Cerveau", listExamensCerveau()));
        items.add(new Organe("Coeur", listExamensCoeur()));
        items.add(new Organe("Foie", listExamensFoie()));
        items.add(new Organe("Poumons"));
        items.add(new Organe("Reins"));
        return items;
    }

    public static final List<Examen> listExamensCoeur(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Arteriographie", "Visualiser les arteres"));
        items.add(new Examen("Coronarographie", "Visualiser les arteres coronaires et les vaisseaux irriguant le coeur"));
        items.add(new Examen("Echographie Dopler du coeur", "Visualiser les tissus et la cinétique"));
        items.add(new Examen("Scanner coronaire", R.drawable.scanner_coronnaire1, "Visualiser les artères coronaires"));
        items.add(new Examen("Echographie-Doppler des artères", "Visualiser les tissus et la cinétique"));
        items.add(new Examen("Echographie-Doppler du coeur par voie transoesophagienne", "Visualiser parfaitement l’ensemble des tissus qui constituent le cœur"));
        items.add(new Examen("Echographie-Doppler des veines", "Analyser la structure des veines et le flux sanguin"));
        items.add(new Examen("Scintigraphie cardiaque", "Evaluer la fonction du muscle cardiaque, donne des renseignements sur ses capacités de contraction"));
        return items;
    }

    public static final List<Examen> listExamensFoie(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Echographie abdominale", "Analyser l'ensemble de l'abdomen"));
        items.add(new Examen("IRM abdominale", "Discriminer les differents tissus mous et obtenir un maximum de détails sur l'abdomen"));
        items.add(new Examen("Tomodensitométrie", ""));
        return items;
    }

    public static final List<Examen> listExamensCerveau(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Histologie et examen post-mortem", ""));
        items.add(new Examen("IRM anatomique", ""));
        items.add(new Examen("CT-scan", ""));
        items.add(new Examen("Tomographie à émission mono-photonique", ""));
        items.add(new Examen("Voxel-based morphometry", ""));
        items.add(new Examen("Imagerie par résonance magnétique fonctionnelle", "Obtenir le taux d'oxygénation du sang dans le cerveau"));
        items.add(new Examen("Tomographie par émission de positrons", "Mesurer les modifications du débit sanguin"));
        items.add(new Examen("Imagerie optique", ""));
        items.add(new Examen("Imagerie spectroscopique proche infrarouge", ""));
        items.add(new Examen("Mesure du signal optique évoqué ", ""));

        return items;
    }

}
