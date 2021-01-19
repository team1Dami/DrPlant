package classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.Set;

import enumerations.PlagueType;

@Root(name = "plague")
public class Plague implements Serializable {

    private static final long serialVersionUID = 1L;

    @Element ( name = "scienceName", required = true)
    private  String scienceName;
    @Element ( name = "commonName")
    private  String commonName;
    @Element ( name = "description")
    private  String description;
    @Element ( name = "control")
    private  String control;
    @Element ( name = "remedy")
    private  String remedy;
    @Element ( name = "type")
    private PlagueType type;
    @Element ( name = "photo")
    private  byte[] photo;
    @Element ( name = "plants")
    private Set<Plant> plants;

    public String getScienceName() { return scienceName; }

    public void setScienceName(String scienceName) { this.scienceName = scienceName; }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getRemedy() {
        return remedy;
    }

    public void setRemedy(String remedy) {
        this.remedy = remedy;
    }

    public PlagueType getType() {
        return type;
    }

    public void setType(PlagueType type) {
        this.type = type;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Set<Plant> getPlants() {
        return plants;
    }

    public void setPlants(Set<Plant> plants) {
        this.plants = plants;
    }
}
