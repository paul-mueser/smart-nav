package com.paulmueser.smartnav;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.paulmueser.smartnav.api.ApiService;
import com.paulmueser.smartnav.api.IResponseReceived;
import com.paulmueser.smartnav.data.apidata.Timetable;
import com.paulmueser.smartnav.frontend.CommonConnectionsFragment;
import com.paulmueser.smartnav.frontend.FindConnectionFragment;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create new fragment and transaction
        Fragment newFragment = new CommonConnectionsFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.add(R.id.nav_host_fragment, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();

        // Set up the bottom navigation bar
        findViewById(R.id.nav_btn_common_connections).setOnClickListener(v -> {
            Fragment f = new CommonConnectionsFragment();
            FragmentTransaction t = getSupportFragmentManager().beginTransaction();
            t.replace(R.id.nav_host_fragment, f);
            t.addToBackStack(null);
            t.commit();

            v.getRootView().findViewById(R.id.nav_btn_common_connections).setClickable(false);
            v.getRootView().findViewById(R.id.nav_btn_common_connections).setSelected(true);

            v.getRootView().findViewById(R.id.nav_btn_find_connection).setClickable(true);
            v.getRootView().findViewById(R.id.nav_btn_find_connection).setSelected(false);
        });

        findViewById(R.id.nav_btn_find_connection).setOnClickListener(v -> {
            Fragment f = new FindConnectionFragment();
            FragmentTransaction t = getSupportFragmentManager().beginTransaction();
            t.replace(R.id.nav_host_fragment, f);
            t.addToBackStack(null);
            t.commit();

            v.getRootView().findViewById(R.id.nav_btn_find_connection).setClickable(false);
            v.getRootView().findViewById(R.id.nav_btn_find_connection).setSelected(true);

            v.getRootView().findViewById(R.id.nav_btn_common_connections).setClickable(true);
            v.getRootView().findViewById(R.id.nav_btn_common_connections).setSelected(false);
        });

        request();
    }

    // TODO this is the way to call the request method
    private void request() {
        ApiService.requestKnownChanges(new IResponseReceived() {
            @Override
            public void onSuccess(String response) {
                Log.i("SmartNav", response);
                Timetable t = (Timetable) Parser.parseTimetableStop(response, Timetable.class);
                Log.i("SmartNav", t + "");
            }

            @Override
            public void onError(String error) {
                Log.e("SmartNav", error);
            }
        }, "8000105");
    }
}
