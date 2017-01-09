package techmed.guide.data;

import java.util.ArrayList;
import java.util.List;

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
        items.add(new Organe("Cerveau", listExamensCoeur()));
        items.add(new Organe("Coeur"));
        items.add(new Organe("Foie"));
        items.add(new Organe("Poumons"));
        items.add(new Organe("Reins"));
        return items;
    }

    public static final List<Examen> listExamensCoeur(){
        ArrayList<Examen> items = new ArrayList<>();
        items.add(new Examen("Arteriographie", "Visualiser les arteres"));
        items.add(new Examen("Coronarographie", "Visualiser les arteres coronaires et les vaisseaux irriguant le coeur"));
        items.add(new Examen("Echographie Dopler du coeur", "Visualiser les tissus et la cinétique"));
        return items;
    }


}
