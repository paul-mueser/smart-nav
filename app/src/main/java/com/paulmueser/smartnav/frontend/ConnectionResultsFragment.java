package com.paulmueser.smartnav.frontend;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.data.SearchParameterData;
import com.paulmueser.smartnav.databinding.ConnectionResultsBinding;

import java.util.ArrayList;

public class ConnectionResultsFragment extends Fragment {
    private RecyclerView             recyclerViewConnectionResults;
    private ConnectionResultsAdapter connectionResultsAdapter;

    public ConnectionResultsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle              args          = getArguments();
        String              res           = args.getString("Response");
        if (args.getBoolean("IsDirect")) {
            Log.i("SmartNav", "Response: " + res);
            // TODO implement direct connections
        } else {
            // TODO implement indirect connections
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ConnectionResultsBinding binding = ConnectionResultsBinding.inflate(inflater, container, false);
        View                     view    = binding.getRoot();

        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Connection 1");

        recyclerViewConnectionResults = view.findViewById(R.id.list_connection_results);
        recyclerViewConnectionResults.setLayoutManager(new LinearLayoutManager(getContext()));
        connectionResultsAdapter = new ConnectionResultsAdapter(getActivity(), tmp);
        recyclerViewConnectionResults.setAdapter(connectionResultsAdapter);

        return view;
    }
}