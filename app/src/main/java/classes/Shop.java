package classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.Set;

@Root ( name = "shop")
public class Shop implements Serializable {

    @Element ( name = "id_shop", required = true)
    private Long id_shop;
    @Element ( name = "shop_name")
    private String shop_name;
    @Element ( name = "url")
    private String url;
    @Element ( name = "location")
    private String location;
    @Element ( name = "commission")
    private float commission;
    @Element ( name = "email")
    private String email;
    @Element ( name = "plants")
    private Set<Plant> plants;
    @Element ( name = "equipments")
    private Set<Equipment> equipments;

    public Long getId_shop() {
        return id_shop;
    }

    public void setId_shop(Long id_shop) {
        this.id_shop = id_shop;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Plant> getPlants() {
        return plants;
    }

    public void setPlants(Set<Plant> plants) {
        this.plants = plants;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }
}
