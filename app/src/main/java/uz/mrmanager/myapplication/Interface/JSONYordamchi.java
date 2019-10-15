package uz.mrmanager.myapplication.Interface;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import uz.mrmanager.myapplication.Service.ModelRequest;
import uz.mrmanager.myapplication.Service.MyResponse;

public interface JSONYordamchi {
    @POST("api.php")
    Call<List<MyResponse>> getData(@Body ModelRequest login);

}
