package com.paulmueser.smartnav.api;

public interface IResponseReceived {
    void onSuccess(String response);
    void onError(String error);
}
