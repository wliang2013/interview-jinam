
package com.example.interview.interview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Small {

    @SerializedName("https")
    @Expose
    private String https;

    public String getHttps() {
        return https;
    }

    public void setHttps(String https) {
        this.https = https;
    }

}
