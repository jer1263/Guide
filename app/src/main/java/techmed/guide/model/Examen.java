package techmed.guide.model;

/**
 * Created by Jerome on 09/01/2017.
 */

public class Examen {
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Examen(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
