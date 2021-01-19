package interfaces;

import java.util.List;

import classes.Plague;
import classes.Plagues;
import enumerations.PlagueType;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PlagueInterface {

    @POST
    public void create(@Body Plague plague);

    @PUT
    public void edit(@Body Plague plague);

    @DELETE ("{id}")
    public void remove(@Path("id") String id);

    @GET ("{id}")
    public Plague find(@Path("id") String id);

    @GET
    public List<Plagues> findAllPlagues(@Body List<Plague> plagues);

    @GET("findPlagueByCommonName/{commonName}")
    public Plague findPlagueByCommonName(@Path("commonName") String commonName);

    // PREGUNTAR A BORJA SI EN LA LLAMADA DEBE IR UN @Body List<Plague> plagues  ????
    @GET ("findPlaguesByType/{type}")
    public List<Plagues> findPlaguesByType(@Path("type") PlagueType type);


}
