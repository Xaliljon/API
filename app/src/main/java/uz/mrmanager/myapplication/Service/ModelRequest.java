package uz.mrmanager.myapplication.Service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelRequest {
    @SerializedName("username")
    @Expose
    private String username;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("getaction")
    @Expose
    private int getaction;

    @SerializedName("userid")
    @Expose
    private int userid;

    public ModelRequest(String username, String password, int getaction, int userid) {
        this.username = username;
        this.password = password;
        this.getaction = getaction;
        this.userid = userid;
    }
}
