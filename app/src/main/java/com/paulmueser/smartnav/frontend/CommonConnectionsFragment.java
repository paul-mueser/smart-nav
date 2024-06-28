package com.paulmueser.smartnav.frontend;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.data.SearchParameterData;
import com.paulmueser.smartnav.databinding.CommonConnectionsBinding;

import java.util.ArrayList;

public class CommonConnectionsFragment extends Fragment {

    private RecyclerView            recyclerViewCommonConnections;
    private CommonConnectionAdapter commonConnectionAdapter;

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

        ArrayList<SearchParameterData> tmp = new ArrayList<>();
        tmp.add(new SearchParameterData("8000105", "TmpTest", "", null, "", "", true));

        recyclerViewCommonConnections = view.findViewById(R.id.list_common_connections);
        recyclerViewCommonConnections.setLayoutManager(new LinearLayoutManager(getContext()));
        commonConnectionAdapter = new CommonConnectionAdapter(getActivity(), tmp);
        recyclerViewCommonConnections.setAdapter(commonConnectionAdapter);

        return view;
    }
}