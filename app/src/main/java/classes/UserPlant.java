package classes;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;
import java.sql.Timestamp;

@Root ( name = "user_plant")
public class UserPlant implements Serializable {

    @Element ( name = "id", required = true)
    private UserPlantId id;
    @Element ( name = "user")
    private User user;
    @Element ( name = "plant")
    private Plant plant;
    @Element ( name = "dateWatering")
    private Timestamp dateWatering;

    public UserPlantId getId() {
        return id;
    }

    public void setId(UserPlantId id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    public Timestamp getDateWatering() {
        return dateWatering;
    }

    public void setDateWatering(Timestamp dateWatering) {
        this.dateWatering = dateWatering;
    }
}
