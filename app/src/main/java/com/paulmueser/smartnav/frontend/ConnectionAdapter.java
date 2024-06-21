package com.paulmueser.smartnav.frontend;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import com.paulmueser.smartnav.api.ApiService;
import com.paulmueser.smartnav.api.IResponseReceived;
import org.jetbrains.annotations.NotNull;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConnectionAdapter extends RecyclerView.Adapter<ConnectionAdapter.ViewHolder> {
    // TODO replace with connection class (create it)
    private final ArrayList<String> connectionList;

    public ConnectionAdapter(ArrayList<String> list) {
        this.connectionList = list;
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
