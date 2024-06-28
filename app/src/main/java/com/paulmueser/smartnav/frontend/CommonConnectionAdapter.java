package com.paulmueser.smartnav.frontend;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.api.ApiService;
import com.paulmueser.smartnav.api.IResponseReceived;
import com.paulmueser.smartnav.data.Parser;
import com.paulmueser.smartnav.data.SearchParameterData;
import com.paulmueser.smartnav.data.apidata.Timetable;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CommonConnectionAdapter extends RecyclerView.Adapter<CommonConnectionAdapter.ViewHolder> {
    private static FragmentActivity               activity;
    // TODO replace with connection class (create it)
    private final  ArrayList<SearchParameterData> connectionList;

    public CommonConnectionAdapter(FragmentActivity activity, ArrayList<SearchParameterData> list) {
        this.connectionList = list;
        this.activity       = activity;
    }

    private static void RequestConnection(View view, SearchParameterData data) {
        // region Get current date and time
        Date currentTime = Calendar.getInstance().getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd", Locale.getDefault());
        String           date       = dateFormat.format(currentTime);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH", Locale.getDefault());
        String           hour       = timeFormat.format(currentTime);
        // endregion

        Bundle   args        = new Bundle();
        args.putBoolean("IsDirect", data.isDirectConnection());

        if (data.isDirectConnection()) {
            // TODO rework when implementing indirect connections

            ApiService.requestPlan(new IResponseReceived() {
                @Override
                public void onSuccess(String response) {
                    Timetable t = (Timetable) Parser.parseTimetableStop(response, Timetable.class);

                    Fragment newFragment = new ConnectionResultsFragment();
                    args.putString("Response", response);
                    newFragment.setArguments(args);
                    FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.nav_host_fragment, newFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();
                }

                @Override
                public void onError(String error) {
                    // TODO handle error
                    Log.e("SmartNav", error);
                    Toast.makeText(view.getContext(), "Error: " + error, Toast.LENGTH_LONG).show();
                }
            }, data.getRouteStartEvaNr(), date, hour);
        } else {
            // TODO handle indirect connection
        }
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_common_connection, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        SearchParameterData data = connectionList.get(position);

        holder.title.setText(data.getRouteStartName());

        holder.title.setOnClickListener(view -> RequestConnection(view, data));
    }

    @Override
    public int getItemCount() {
        return connectionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //declaring the views
        private final TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_common_connection_title);
        }
    }
}
