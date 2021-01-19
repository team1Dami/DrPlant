package interfaces;

import java.util.List;

import classes.Equipment;
import classes.Equipments;
import enumerations.Use;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EquipmentInterface {

    @POST
    public void create(@Body Equipment equipment) ;

    @PUT
    public void edit(@Body Equipment equipment);

    @DELETE("/{id}")
    public void remove(@Path("id") Long id);

    @GET ("/{id}")
    public Equipment find(@Path("id") Long id);

    @GET ("equipment_name/{equipment_name}")
    public List<Equipments> findEquipmentByName(@Path("equipment_name") String equipment_name);

    @GET ("uses/{uses}")
    public List<Equipments> findEquipmentByUse(@Path("uses") Use uses);

    @GET
    public List<Equipments> findAllEquipment(@Body List<Equipment> equipments);
}
