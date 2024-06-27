package com.paulmueser.smartnav.frontend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.paulmueser.smartnav.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ConnectionResultsAdapter extends RecyclerView.Adapter<ConnectionResultsAdapter.ViewHolder> {
    // TODO replace with connection class (create it)
    private final ArrayList<String> connectionResultsList;
    private static FragmentActivity activity;

    public ConnectionResultsAdapter(FragmentActivity activity, ArrayList<String> list) {
        this.connectionResultsList = list;
        this.activity              = activity;
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_connection_result, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NotNull ConnectionResultsAdapter.ViewHolder holder, int position) {
        String curConnection = connectionResultsList.get(position);

        holder.txtPlannedStartTime.setText("10:10");
        holder.txtPlannedEndTime.setText("20:20");
        holder.txtActualStartTime.setText("10:11");
        holder.txtActualEndTime.setText("20:19");
        holder.txt_con_res_train_name.setText("RE 69");
    }

    @Override
    public int getItemCount() {
        return connectionResultsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //declaring the views
        private final TextView txtPlannedStartTime;
        private final TextView txtPlannedEndTime;
        private final TextView txtActualStartTime;
        private final TextView txtActualEndTime;
        private final TextView txt_con_res_train_name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPlannedStartTime = itemView.findViewById(R.id.txt_con_res_planned_start_time);
            txtPlannedEndTime = itemView.findViewById(R.id.txt_con_res_planned_end_time);
            txtActualStartTime = itemView.findViewById(R.id.txt_con_res_actual_start_time);
            txtActualEndTime = itemView.findViewById(R.id.txt_con_res_actual_end_time);
            txt_con_res_train_name = itemView.findViewById(R.id.txt_con_res_train_name);
        }
    }
}
