package techmed.guide.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jerome on 05/01/2017.
 */

public class Organe implements Serializable {
    private String name;
    private List<Examen> examens;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Examen> getExamens() {
        return examens;
    }

    public Organe(String name) {
        this.name = name;
        this.examens = new ArrayList<>();
    }

    public Organe(String name, List<Examen> examens) {
        this.name = name;
        this.examens = examens;
    }
}
