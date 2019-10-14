package uz.mrmanager.myapplication;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import uz.mrmanager.myapplication.Interface.JSONYordamchi;

public class App extends Application {
    private static JSONYordamchi jsonYordamchi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://intservice.uz/api.php/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jsonYordamchi = retrofit.create(JSONYordamchi.class);
    }

    public static JSONYordamchi getApi(){
        return jsonYordamchi;
    }
}
