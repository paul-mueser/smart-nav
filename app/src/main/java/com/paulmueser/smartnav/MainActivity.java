package com.paulmueser.smartnav;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("SmartNav", "Started");
        sendRequest();
    }

    //TODO move to an service, that works similar to the dog service
    private void sendRequest() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String clientId = BuildConfig.CLIENT_ID;
                    String clientSecret = BuildConfig.CLIENT_SECRET;

                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("https://apis.deutschebahn.com/db-api-marketplace/apis/timetables/v1/fchg/8000105")
                            .get()
                            .addHeader("DB-Client-Id", clientId)
                            .addHeader("DB-Api-Key", clientSecret)
                            .addHeader("accept", "application/xml")
                            .build();
                    Response response = client.newCall(request).execute();
                    if (response.code() == 200) {
                        String responseData = response.body().string();
                        Log.i("SmartNav", "Response: " + responseData);
                    } else {
                        Log.e("SmartNav", "Error: " + response.code());
                        Log.e("SmartNav", "Response: " + response.body().string());
                    }
                } catch (Exception e) {
                    Log.e("SmartNav", "Error: " + e.getMessage());
                }
            }
        }).start();
    }
}
