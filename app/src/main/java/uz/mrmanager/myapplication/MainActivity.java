package uz.mrmanager.myapplication;


import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import uz.mrmanager.myapplication.Adapter.PostsAdapter;
import uz.mrmanager.myapplication.Service.ModelRequest;
import uz.mrmanager.myapplication.Service.MyResponse;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<MyResponse> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        posts = new ArrayList<>();

        recyclerView = findViewById(R.id.posts_recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        PostsAdapter adapter = new PostsAdapter(posts);
        recyclerView.setAdapter(adapter);

        App.getApi().getData(new ModelRequest("userApi", "userPSWD123", 1, 5)).enqueue(new Callback<List<MyResponse>>() {
            @Override
            public void onResponse(Call<List<MyResponse>> call, Response<List<MyResponse>> response) {
                posts.addAll(response.body());
                Toast.makeText(MainActivity.this, "data size " + response.body().size(), Toast.LENGTH_LONG).show();
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<MyResponse>> call, Throwable t) {

            }
        });
    }
}