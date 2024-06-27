package com.paulmueser.smartnav.frontend;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.api.ApiService;
import com.paulmueser.smartnav.api.IResponseReceived;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.*;

public class CommonConnectionAdapter extends RecyclerView.Adapter<CommonConnectionAdapter.ViewHolder> {
    // TODO replace with connection class (create it)
    private final ArrayList<String> connectionList;
    private static FragmentActivity activity;

    public CommonConnectionAdapter(FragmentActivity activity, ArrayList<String> list) {
        this.connectionList = list;
        this.activity = activity;
    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_common_connection, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        String curConnection = connectionList.get(position);

        holder.title.setText(curConnection);

        holder.title.setOnClickListener(view -> RequestConnection(view, curConnection));
    }

    private static void RequestConnection(View view, String curConnection) {
        Context context = view.getContext();

        // region Get current date and time
        Date currentTime = Calendar.getInstance().getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd", Locale.getDefault());
        String date = dateFormat.format(currentTime);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH", Locale.getDefault());
        String hour = timeFormat.format(currentTime);
        // endregion

        ApiService.requestPlan(new IResponseReceived() {
            @Override
            public void onSuccess(String response) {
                // TODO open new fragment with the connection
                Log.i("SmartNav", response);

                // Create new fragment and transaction
                Fragment newFragment = new ConnectionResultsFragment();
                Bundle   args        = new Bundle();
                args.putString("Response", response);
                newFragment.setArguments(args);

                FragmentTransaction transaction = activity.getSupportFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack
                transaction.replace(R.id.nav_host_fragment, newFragment);
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();
            }

            @Override
            public void onError(String error) {
                // TODO handle error
                Log.e("SmartNav", error);
            }
        }, "8000105", date, hour);
    }

    @Override
    public int getItemCount() {
        return connectionList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //declaring the views
        private final TextView  title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.txt_common_connection_title);
        }
    }
}
