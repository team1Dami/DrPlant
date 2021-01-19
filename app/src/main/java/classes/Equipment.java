package classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.util.Set;

import enumerations.Use;

@Root( name = "equipment")
public class Equipment implements Serializable {

    @Element ( name = "id_equipment", required = true)
    private Long id_equipment;
    @Element ( name = "equipment_name")
    private String equipment_name;
    @Element ( name = "equipment_description")
    private String equipment_description;
    @Element (name = "price")
    private float price;
    @Element ( name = "image")
    private byte[] image;
    @Element ( name = "uses")
    private Use uses;
    @Element ( name = "shop")
    private Shop shop;
    @Element ( name = "usuarios")
    private Set<User> usuarios;

    public Long getId_equipment() {
        return id_equipment;
    }

    public void setId_equipment(Long id_equipment) {
        this.id_equipment = id_equipment;
    }

    public String getEquipment_name() {
        return equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        this.equipment_name = equipment_name;
    }

    public String getEquipment_description() {
        return equipment_description;
    }

    public void setEquipment_description(String equipment_description) {
        this.equipment_description = equipment_description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Use getUses() {
        return uses;
    }

    public void setUses(Use uses) {
        this.uses = uses;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Set<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<User> usuarios) {
        this.usuarios = usuarios;
    }
}
