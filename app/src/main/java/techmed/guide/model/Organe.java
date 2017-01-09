package techmed.guide.model;

import java.util.List;

/**
 * Created by Jerome on 05/01/2017.
 */

public class Organe {
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
    }

    public Organe(String name, List<Examen> examens) {
        this.examens = examens;
        this.name = name;
    }
}
