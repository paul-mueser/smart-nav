package com.paulmueser.smartnav.frontend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ConnectionAdapter extends RecyclerView.Adapter<ConnectionAdapter.ViewHolder> {
    private final        ArrayList<String> connectionList;

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

        // TODO logic to get the connection
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
