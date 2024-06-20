package com.paulmueser.smartnav;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.paulmueser.smartnav.api.ApiService;
import com.paulmueser.smartnav.api.IResponseReceived;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ApiService apiService = new ApiService();

        setContentView(R.layout.activity_main);
        Log.i("SmartNav", "Started");
        ApiService.sendRequest(new IResponseReceived() {
            @Override
            public void onSuccess(String response) {
                Log.i("SmartNav", response);
            }

            @Override
            public void onError(String error) {
                Log.e("SmartNav", error);
            }
        });
    }
}
