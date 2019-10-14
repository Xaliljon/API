package uz.mrmanager.myapplication.Interface;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;
import uz.mrmanager.myapplication.Service.PostModel;

public interface JSONYordamchi {
    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("userid") int userid, @Query("getaction") int action);

}
