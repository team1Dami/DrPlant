package retroFit;

import classes.Plague;
import interfaces.PlagueInterface;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class PlagueAPIClient {
    private static String API_BASE_URL = "http://192.168.20.142:8080/drplantServer/webresources/plague/";

}
