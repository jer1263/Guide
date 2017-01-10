package techmed.guide.data;

import java.util.ArrayList;
import java.util.Collections;
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
        //items.add(new Organe("Poumons"));
        //items.add(new Organe("Reins"));
        return items;
    }

    public static final List<Examen> listExamens(){
        ArrayList<Examen> items = new ArrayList<>();
        items.addAll(listExamensCerveau());
        items.addAll(listExamensCoeur());
        items.addAll(listExamensFoie());
        Collections.sort(items);
        return items;
    }

    public static final List<Examen> listExamensCoeur(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Arteriographie",R.drawable.arteriographie_aorte ,"Visualiser les arteres"));
        items.add(new Examen("Coronarographie", R.drawable.coronarographie_normale,"Visualiser les arteres coronaires et les vaisseaux irriguant le coeur"));
        items.add(new Examen("Echocardiographie", "Visualiser les tissus et la cinétique"));
        items.add(new Examen("Scanner coronaire", R.drawable.scanner_coronnaire1, "Visualiser les artères coronaires"));
        items.add(new Examen("Echographie-Doppler des artères", "Visualiser les tissus et la cinétique"));
        items.add(new Examen("Echographie transoesophagienne", "Visualiser parfaitement l’ensemble des tissus qui constituent le cœur"));
        items.add(new Examen("Echographie-Doppler des veines", "Analyser la structure des veines et le flux sanguin"));
        items.add(new Examen("Scintigraphie cardiaque", "Evaluer la fonction du muscle cardiaque, donne des renseignements sur ses capacités de contraction"));
        return items;
    }

    public static final List<Examen> listExamensFoie(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Echographie",R.drawable.echographie_abdominale ,"Analyser l'ensemble de l'abdomen", ""));
        items.add(new Examen("Tomodensitometrie",R.drawable.tomodensitometrie_foie ,"Mesurer l'absorption des rayons X par les tissus pour reconstruire des images 2D ou 3D", ""));
        items.add(new Examen("IRM",R.drawable.irm_foie ,"Discriminer les differents tissus mous et obtenir un maximum de détails sur l'abdomen", ""));
        return items;
    }

    public static final List<Examen> listExamensCerveau(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("IRM du cerveau", R.drawable.irm_cerveau,"Permet de visualiser la partie superficielle, la partie profonde les ventricules et la vascularisation veineuse et artérielle"));
        items.add(new Examen("Tomodensitométrie", R.drawable.tomodensitometrie_cerveau,"Utilisée dans un contexte de traumatologie (recherche d'hématome sous-dural/extra-dural), d'hémorragie sous-arachnoïdienne ou intra-parenchymateuse"));
        items.add(new Examen("Imagerie par résonance magnétique fonctionnelle(IRMf)", R.drawable.IRMf_cerveau,"Obtenir le taux d'oxygénation du sang dans le cerveau"));
        items.add(new Examen("Tomographie par émission de positrons(TEP)", R.drawable.TEP_cerveau,"Mesurer les modifications du débit sanguin"));
        return items;
    }

}
