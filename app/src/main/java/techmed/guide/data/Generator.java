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
        items.add(new Examen("Arteriographie", "Visualiser les arteres", "L’artériographie permet d’obtenir des images des artères et de leurs ramifications ainsi que du territoire qu’elles irriguent. L’examen peut ainsi mettre en évidence l’obstruction d’une artère, le nombre d’artères obstruées ou encore la sévérité de ces obstructions. Par exemple, l’artériographie d’un organe permet de caractériser sa vascularisation et la présence de lésions artérielles (rétrécissement, occlusions, malformations, ruptures à l’origine d’hémorragies, etc.)."));
        items.add(new Examen("Coronarographie", "Visualiser les arteres coronaires et les vaisseaux irriguant le coeur", "La coronarographie est une luminographie qui permet de voir les artères coronaires en 2D. Elle se fait selon différentes incidences qui permettent de dégager toutes les branches des artères coronaires. En général, entre 5 et 8 incidences pour la coronaire gauche et entre 3 et 4 pour la coronaire droite suffisent à explorer les 2 réseaux et établir un diagnostic. Le bilan coronarographique d'un patient ponté nécessite l'utilisation de cathéters différents pour rechercher les pontages veineux ou artériels. Il est indispensable de connaître le nombre et le type de pontage (double/triple pontage, VSI/artériel)"));
        items.add(new Examen("Echocardiographie", "Visualiser les tissus et la cinétique",""));
        items.add(new Examen("Scanner coronaire", R.drawable.scanner_coronnaire1, "Visualiser les artères coronaires", "Le coroscanner ou coronaroscanner est une coronarographie virtuelle.\n" +
                "Après injection intra-veineuse de produit de contraste, l’acquisition des images couplée à un ECG dure moins de 10 secondes.\n" +
                "La simplicité de l’examen permet un dépistage facilement accessible, notamment en cas de douleurs thoraciques atypiques, de dyspnée et chez les patients présentant des facteurs de risque personnels ou familiaux.\n" +
                "\n" +
                "Ces principales indications sont : les sténoses ou occlusion des coronaires (tronc commun), un bilan ischémique du myocarde, la surveillance de stents, la surveillance de pontages aorto-coronariens, un bilan de cardiomyopathie, un bilan de valvulopathie.\n" +
                "Dans le bilan des cardiopathies ischémiques, le scanner cardiaque est, actuellement, la technique non invasive, la plus performante pour l’exploration des artères coronaires. Par son acquisition volumique, le scanner s’affirme comme le moyen d’explorer en ambulatoire de façon reproductible non seulement les artères coronaires mais aussi toutes les structures cardiaques. Le scanner cardiaque est entrain de devenir un examen de routine qui trouve progressivement sa place parmi les différentes explorations cardiaques.   \n" +
                "\n"));
        items.add(new Examen("Echographie-Doppler des artères", "Visualiser les tissus et la cinétique", ""));
        items.add(new Examen("chographie transoesophagienne", "Visualiser parfaitement l’ensemble des tissus qui constituent le cœur", ""));
        items.add(new Examen("Echographie-Doppler des veines", "Analyser la structure des veines et le flux sanguin", ""));
        items.add(new Examen("Scintigraphie cardiaque", "Evaluer la fonction du muscle cardiaque, donne des renseignements sur ses capacités de contraction", ""));
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
        items.add(new Examen("IRM du cerveau", R.drawable.irm_cerveau,"Permet de visualiser la partie superficielle, la partie profonde les ventricules et la vascularisation veineuse et artérielle",""));
        items.add(new Examen("Tomodensitométrie", R.drawable.tomodensitometrie_cerveau,"Utilisée dans un contexte de traumatologie (recherche d'hématome sous-dural/extra-dural), d'hémorragie sous-arachnoïdienne ou intra-parenchymateuse",""));
        items.add(new Examen("Imagerie par résonance magnétique fonctionnelle(IRMf)", R.drawable.irmf_cerveau,"Obtenir le taux d'oxygénation du sang dans le cerveau",""));
        items.add(new Examen("Tomographie par émission de positrons(TEP)", R.drawable.tep_cerveau,"Mesurer les modifications du débit sanguin",""));
        return items;
    }

}
