package com.isabelpalomar.appportfolio;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class ApplicationsRecyclerAdapter extends RecyclerView.Adapter<ApplicationsRecyclerAdapter.ApplicationViewHolder> {

    List<Application> applications;
    Context context;

    public ApplicationsRecyclerAdapter(Context context, List<Application> applications) {
        this.applications = applications;
        this.context = context;
    }

    @Override
    public ApplicationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.application_item, parent, false);
        return new ApplicationViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ApplicationViewHolder holder, final int position) {

        holder.tvAppName.setText(applications.get(position).getName());
        holder.cvApp.setCardBackgroundColor(ContextCompat.getColor(context, applications.get(position).getLayoutColor()));

        holder.cvApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, context.getString(R.string.app_launcher_msg, applications.get(position).getName()), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return applications.size();
    }

    public class ApplicationViewHolder extends RecyclerView.ViewHolder {
        CardView cvApp;
        TextView tvAppName;

        public ApplicationViewHolder(View itemView) {
            super(itemView);
            cvApp = (CardView) itemView.findViewById(R.id.cvApplication);
            tvAppName = (TextView) itemView.findViewById(R.id.tvApplicationName);
        }
    }
}
