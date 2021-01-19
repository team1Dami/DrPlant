package classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.Set;

import enumerations.Climate;
import enumerations.PetFriendly;
import enumerations.PlantType;

@Root ( name = "plant")
public class Plant implements Serializable {

    @Element ( name = "scienceName", required = true)
    private String scienceName;
    @Element ( name = "commonName")
    private String commonName;
    @Element ( name = "description")
    private String description;
    @Element ( name = "cares")
    private String cares;
    @Element (name = "wateringFrequence")
    private float wateringFrequence;
    @Element ( name = "petfriendly")
    private PetFriendly petfriendly;
    @Element ( name = "plantType")
    private PlantType plantType;
    @Element ( name = "climate")
    private Climate climate;
    @Element ( name = "image")
    private byte[] image;
    @Element (name = "users")
    private Set<UserPlant> users;
    @Element ( name = "shops")
    private Set<Shop> shops;
    @Element ( name = "plagues")
    private Set<Plague> plagues;

    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

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

    public String getCares() {
        return cares;
    }

    public void setCares(String cares) {
        this.cares = cares;
    }

    public float getWateringFrequence() {
        return wateringFrequence;
    }

    public void setWateringFrequence(float wateringFrequence) {
        this.wateringFrequence = wateringFrequence;
    }

    public PetFriendly getPetfriendly() {
        return petfriendly;
    }

    public void setPetfriendly(PetFriendly petfriendly) {
        this.petfriendly = petfriendly;
    }

    public PlantType getPlantType() {
        return plantType;
    }

    public void setPlantType(PlantType plantType) {
        this.plantType = plantType;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Set<UserPlant> getUsers() {
        return users;
    }

    public void setUsers(Set<UserPlant> users) {
        this.users = users;
    }

    public Set<Shop> getShops() {
        return shops;
    }

    public void setShops(Set<Shop> shops) {
        this.shops = shops;
    }

    public Set<Plague> getPlagues() {
        return plagues;
    }

    public void setPlagues(Set<Plague> plagues) {
        this.plagues = plagues;
    }
}
