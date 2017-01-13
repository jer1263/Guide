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
        items.add(new Examen("Arteriographie", R.drawable.arteriographie_aorte,"Visualiser les arteres", "L’artériographie permet d’obtenir des images des artères et de leurs ramifications ainsi que du territoire qu’elles irriguent. L’examen peut ainsi mettre en évidence l’obstruction d’une artère, le nombre d’artères obstruées ou encore la sévérité de ces obstructions. Par exemple, l’artériographie d’un organe permet de caractériser sa vascularisation et la présence de lésions artérielles (rétrécissement, occlusions, malformations, ruptures à l’origine d’hémorragies, etc.)."));
        items.add(new Examen("Coronarographie", R.drawable.coronarographie_normale,"Visualiser les arteres coronaires et les vaisseaux irriguant le coeur", "La coronarographie est une luminographie qui permet de voir les artères coronaires en 2D. Elle se fait selon différentes incidences qui permettent de dégager toutes les branches des artères coronaires. En général, entre 5 et 8 incidences pour la coronaire gauche et entre 3 et 4 pour la coronaire droite suffisent à explorer les 2 réseaux et établir un diagnostic. Le bilan coronarographique d'un patient ponté nécessite l'utilisation de cathéters différents pour rechercher les pontages veineux ou artériels. Il est indispensable de connaître le nombre et le type de pontage (double/triple pontage, VSI/artériel)"));
        items.add(new Examen("Echocardiographie", R.drawable.echocardiographie,"Visualiser les tissus et la cinétique",""));

        items.add(new Examen("Scanner coronaire", R.drawable.scanner_coronnaire1, "Visualiser les artères coronaires", "Le coroscanner ou coronaroscanner est une coronarographie virtuelle.\n" +
                "Après injection intra-veineuse de produit de contraste, l’acquisition des images couplée à un ECG dure moins de 10 secondes.\n" +
                "La simplicité de l’examen permet un dépistage facilement accessible, notamment en cas de douleurs thoraciques atypiques, de dyspnée et chez les patients présentant des facteurs de risque personnels ou familiaux.\n" +
                "\n" +
                "Ces principales indications sont : les sténoses ou occlusion des coronaires (tronc commun), un bilan ischémique du myocarde, la surveillance de stents, la surveillance de pontages aorto-coronariens, un bilan de cardiomyopathie, un bilan de valvulopathie.\n" +
                "Dans le bilan des cardiopathies ischémiques, le scanner cardiaque est, actuellement, la technique non invasive, la plus performante pour l’exploration des artères coronaires. Par son acquisition volumique, le scanner s’affirme comme le moyen d’explorer en ambulatoire de façon reproductible non seulement les artères coronaires mais aussi toutes les structures cardiaques. Le scanner cardiaque est entrain de devenir un examen de routine qui trouve progressivement sa place parmi les différentes explorations cardiaques.   \n" +
                "\n"));

        items.add(new Examen("Echographie-Doppler des artères", "Visualiser les tissus et la cinétique", "L'écho-Doppler artériel permet de visualiser les artères et les flux sanguins qui les parcourent, en temps réel.C'est l'examen complémentaire de référence pratiqué dans le bilan des artérites des membres inférieurs et dans leur suivi.\n" +
                "L'échographoe-Doppler se pratique sur les principaux troncs artériels qui peuvent être atteint par la maladie athéromateuse, à savoir les carotides, les artères des membres inférieurs et l'aorte. La personne est en position allongée et chaque artère est explorée séparément avec la sonde d'échographie."));

        items.add(new Examen("Echographie transoesophagienne", "Visualiser parfaitement l’ensemble des tissus qui constituent le cœur", "Cet examen spécialisé, explore le cœur,\n" +
                "les valves et les cavités cardiaques, selon les\n" +
                "pour visualiser votre œsophage ou votre estomac).\n" +
                "Il s’agit en fait d’une voie privilégiée pour obtenir des images du cœur puisque l’œsophage\n" +
                "(dans lequel la sonde est introduite) est accolé au cœur : les images sont de très bonne qualité,\n" +
                "ce qui n’est pas toujours le cas en échographie trans-thoracique.\n" +
                "L’échographie trans-œsophagienne permet l’étude du cœur et de l’aorte, et surtout des petites structures cardiaques qui sont parfois inaccessibles non seulement à l’échographie trans-thoracique mais aussi à d’autres méthodes d’imagerie radiologique (scanner, par exemple). Les renseignements obtenus vont permettre de confirmer ou d’éliminer un diagnostic qui était suspecté (infection de valve, caillot, problème à l’aorte...), d’évaluer la sévérité d’une atteinte des valves (valve « d’origine » ou prothèse), de guider certaines décisions d’intervention."));

        items.add(new Examen("Echographie-Doppler des veines", "Analyser la structure des veines et le flux sanguin", "L’écho-Doppler est l’examen de base permettant l’exploration du réseau veineux. Il est indispensable avant tout traitement de varices, mais il est aussi parfois pratiqué en urgence en cas de suspicion de thrombose veineuse ou « phlébite » (obstruction de veines par un caillot).\n" +
                "L'écho-Doppler veineux permet en temps réel de visualiser les veines ainsi que les flux sanguins qui les parcourent. Il se pratique essentiellement aux membres inférieurs, sur les trajets veineux des mollets, des cuisses et de l’aine, en remontant parfois même jusqu’à l’abdomen (pour explorer les veines iliaques et la veine cave inférieure).\n" +
                "Plus rarement, ce sont les veines du membre supérieur qui sont explorées, par exemple en cas de suspicion de thrombose veineuse du bras."));

        items.add(new Examen("Scintigraphie cardiaque", R.drawable.scintigraphie,"Evaluer la fonction du muscle cardiaque, donne des renseignements sur ses capacités de contraction", "Le but de cet examen est d’évaluer la vascularisation régionale du muscle cardiaque à l’effort et le plus souvent au repos. \n" +
                "Cet examen permet de déterminer une lésion du muscle cardiaque (infarctus du myocarde) ou un flux sanguin insuffisant au cours de l’effort (ischémie myocardique). \n" +
                "Ce test est prescrit par votre cardiologue, compte tenu de vos antécédents, de vos facteurs de risque vasculaire ou de votre symptomatologie."));

        return items;
    }

    public static final List<Examen> listExamensFoie(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Echographie",R.drawable.echographie_abdominale ,"Analyser l'ensemble de l'abdomen", "L'échographie abdominale utilise les ultrasons émis par une sonde, réfléchis par les organes en fonction de leur densité et récupérés par un récepteur situé également dans la sonde.\n"+
                "L'échographie abdominale fournit de nombreux renseignements, bien plus riches que la radiographie standard, sur les organes abdominaux.\n"+
                "Pour le foie elle permet de renseigner : taille et homogénéité (cirrhose, stéatose), kystes, abcès, tumeurs, métastases de cancers non hépatiques"));
        items.add(new Examen("Tomodensitometrie",R.drawable.tomodensitometrie_foie ,"Mesurer l'absorption des rayons X par les tissus pour reconstruire des images 2D ou 3D", "La tomodensitométrie permet de mesurer l'absorption des rayons X par les tissus. Avec ces mesures il est possible de recreer en 2D ou 3D des images du foie.\n"+
                "L'examen peut nécessiter une injection intraveineuse d'un produit de contraste iodé.\n"+
                "Comme pour toute radiographie, l'exposition répétée aux rayons X peut être nocive pour l'organisme, mais le rapport bénéfice/risque lié à l'irradiation penche largement en faveur de la tomodensitométrie, lorsque la demande d'examen est justifiée, ce qui en fait une technique d'imagerie médicale de plus en plus pratiquée"));
        items.add(new Examen("IRM Hépatique",R.drawable.irm_foie ,"Discriminer les differents tissus mous et obtenir un maximum de détails sur l'abdomen", "L'IRM est devenue un examen de référence dans l'exploration de la pathologie hépatique. La qualité d'image s'est améliorée grâce aux hypergradients et aux séquences d' imagerie rapide et ultra-rapide, qui permettent une exploration en apnée et une étude dynamique après injection de produit de contraste. L'IRM est donc concurrentielle de la tomodensitometrie, en complément de l'échographie, dans l'étude des lésions parenchymateuses hépatiques, des structures canalaires hépatobiliaires et des structures vasculaires hépatiques.\n"+
                "Grâce aux différentes séquences, on peut observer les tissus mous avec des contrastes plus élevés qu'avec la tomodensitométrie"));
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
