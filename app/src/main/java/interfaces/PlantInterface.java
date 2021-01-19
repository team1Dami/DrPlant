package interfaces;

import java.util.List;

import classes.Plant;
import classes.Plants;
import enumerations.Climate;
import enumerations.PetFriendly;
import enumerations.PlantType;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PlantInterface {

    @POST
    public void create(@Body Plant plant) ;

    @PUT
    public void edit(@Body Plant plant);

    @DELETE ("{id}")
    public void remove(@Path("id") String id);

    @GET ("{id}")
    public Plant find(@Path("id") String id);

    @GET
    public List<Plants> getAllPlants(@Body List<Plant> plants);

    @GET ("plantType/{plantType}")
    public List<Plants> getPlantByType(@Path("plantType") PlantType plantType);

    @GET ("petFriendly/{petFriendly}")
    public List<Plants> getPlantByPetFriendly(@Path("petFriendly") PetFriendly petFriendly);

    @GET ("climate/{climate}")
    public List<Plants> getPlantByClimate(@Path("climate") Climate climate);

    @GET ("TypeAndPetFriendly/{plantType}/{petFriendly}")
    public List<Plants> getPlantByTypeAndPetFriendly(@Path("plantType") PlantType plantType, @Path("petFriendly") PetFriendly petFriendly);

    @GET ("TypeAndClimate/{plantType}/{climate}")
    public List<Plants> getPlantByTypeAndClimate(@Path("plantType") PlantType plantType, @Path("climate") Climate climate);

    @GET ("getPlantByPetFriendlyAndClimate/{petFriendly}/{climate}")
    public List<Plants> getPlantByPetFriendlyAndClimate(@Path("petFriendly") PetFriendly petFriendly, @Path("climate") Climate climate);

    @GET ("getPlantWithAll/{plantType}/{petFriendly}/{climate}")
    public List<Plants> getPlantWithAll(@Path("plantType") PlantType plantType, @Path("petFriendly") PetFriendly petFriendly, @Path("climate") Climate climate);

    @GET ("getPlantByCommonName/{commonName}")
    public List<Plants> getPlantByCommonName(@Path("commonName") String commonName);
}
