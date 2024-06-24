package com.paulmueser.smartnav.frontend;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.databinding.CommonConnectionsBinding;

import java.util.ArrayList;

public class CommonConnectionsFragment extends Fragment {

    private RecyclerView recyclerViewCommonConnections;
    private ConnectionAdapter connectionAdapter;

    public CommonConnectionsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        CommonConnectionsBinding binding = CommonConnectionsBinding.inflate(inflater, container, false);
        View                     view    = binding.getRoot();

        ArrayList<String> tmp = new ArrayList<>();
        tmp.add("Connection 1");
        tmp.add("Connection 2");

        recyclerViewCommonConnections = view.findViewById(R.id.list_common_connections);
        recyclerViewCommonConnections.setLayoutManager(new LinearLayoutManager(getContext()));
        connectionAdapter = new ConnectionAdapter(getActivity(), tmp);
        recyclerViewCommonConnections.setAdapter(connectionAdapter);

        return view;
    }
}