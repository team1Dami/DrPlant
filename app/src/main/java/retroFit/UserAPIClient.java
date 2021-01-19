package retroFit;

import interfaces.UserInterface;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class UserAPIClient {
    private static String API_BASE_URL = "http://192.168.20.142:8080/drplantServer/webresources/user/";

    public static UserInterface findUserByLoginAndPasswd(String login, String password) {
        OkHttpClient.Builder httpClient =  new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(
                        SimpleXmlConverterFactory.create()
                );
        Retrofit retrofit = builder.client(httpClient.build()).build();
        UserInterface userInterface = retrofit.create(UserInterface.class);
        return userInterface;
    }
}
