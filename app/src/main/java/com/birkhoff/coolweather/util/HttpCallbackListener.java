package com.birkhoff.coolweather.util;

/**
 * Created by Birkhoff on 2016/7/28.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
