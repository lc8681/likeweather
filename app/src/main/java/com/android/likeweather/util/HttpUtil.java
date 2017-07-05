package com.android.likeweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by momo_lichen on 2017/7/4.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
