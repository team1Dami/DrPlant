package interfaces;

import java.util.List;

import classes.Shop;
import classes.Shops;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ShopInterface {

    @POST
    public void create(@Body Shop entity);

    @PUT
    public void edit(@Body Shop entity);

    @DELETE ("{id}")
    public void remove(@Path("id") Long id);

    @GET("{id}")
    public Shop find(@Path("id") Long id);

    @GET
    public List<Shops> findAllShops(@Body List<Shop> shops);

    @GET ("shop_name/{shop_name}")
    public Shop getShopByName(@Path("shop_name") String shop_name);
}
