package com.newstore.store.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UserReviewModel implements Serializable {

    @SerializedName("status")
    private String status;

    public String getStatus() {
        return status;
    }
}
