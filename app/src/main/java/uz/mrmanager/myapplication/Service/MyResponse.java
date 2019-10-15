package uz.mrmanager.myapplication.Service;

import com.google.gson.annotations.SerializedName;

public class MyResponse {
    @SerializedName("ID")
    String id;
    @SerializedName("USER_ID")
    String userId;
    @SerializedName("ACTION_TYPE")
    String actionType;

    public MyResponse(String id, String userId, String actionType) {
        this.id = id;
        this.userId = userId;
        this.actionType = actionType;
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
