package uz.mrmanager.myapplication.Service;

import com.google.gson.annotations.SerializedName;

public class MyResponse {
    @SerializedName("ID")
    String id;
    @SerializedName("USER_ID")
    String userId;
    @SerializedName("ACTION_TYPE")
    String actionType;
    @SerializedName("DATE")
    String date;


    public MyResponse(String id, String userId, String actionType,String date) {
        this.id = id;
        this.userId = userId;
        this.actionType = actionType;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }
}
