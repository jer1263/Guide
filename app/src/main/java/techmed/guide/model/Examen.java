package techmed.guide.model;

import java.io.Serializable;

/**
 * Created by Jerome on 09/01/2017.
 */

public class Examen implements Serializable, Comparable<Examen> {
    private String name;
    private String description;
    private int imageId;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

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
        this.imageId = 0;
    }

    public Examen(String name, int resId, String description) {
        this.name = name;
        this.imageId = resId;
        this.description = description;
    }

    @Override
    public int compareTo(Examen another) {
        return this.name.compareTo(another.name);
    }
}
