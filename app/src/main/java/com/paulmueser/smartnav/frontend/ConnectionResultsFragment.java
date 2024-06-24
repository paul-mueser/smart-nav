package com.paulmueser.smartnav.frontend;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.databinding.ConnectionResultsBinding;

public class ConnectionResultsFragment extends Fragment {

    public ConnectionResultsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle args = getArguments();
        String res = args.getString("Response");
        Log.i("SmartNav", "Response: " + res);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ConnectionResultsBinding binding = ConnectionResultsBinding.inflate(inflater, container, false);
        View                     view    = binding.getRoot();

        return view;
    }
}