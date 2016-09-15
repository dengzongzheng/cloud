package com.dzz.websocket;

/**
 * Created by dzz on 16/8/5.
 */
public class DzzResponse  {

    private String responseMessage;

    public DzzResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
