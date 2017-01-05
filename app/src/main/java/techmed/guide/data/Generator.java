package techmed.guide.data;

import java.util.ArrayList;
import java.util.List;

import techmed.guide.model.ItemPrincipal;

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
}
