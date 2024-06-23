package com.paulmueser.smartnav;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import com.paulmueser.smartnav.api.ApiService;
import com.paulmueser.smartnav.api.IResponseReceived;
import com.paulmueser.smartnav.data.MultipleStationData;
import com.paulmueser.smartnav.data.Timetable;
import com.paulmueser.smartnav.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);
        request();
    }

    // TODO this is the way to call the request method
    private void request() {
        ApiService.requestKnownChanges(new IResponseReceived() {
            @Override
            public void onSuccess(String response) {
                Log.i("SmartNav", response);
                Timetable t = Parser.parseTimetableStop(response);
                Log.i("SmartNav", t + "");
            }

            @Override
            public void onError(String error) {
                Log.e("SmartNav", error);
            }
        }, "8000105");
    }
}
