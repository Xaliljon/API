package uz.mrmanager.myapplication.Interface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;

import retrofit2.http.POST;
import uz.mrmanager.myapplication.Service.ModelRequest;
import uz.mrmanager.myapplication.Service.PostModel;

public interface JSONYordamchi {
    @POST()
    Callback<List<PostModel>> get(@Body ModelRequest login );

}
