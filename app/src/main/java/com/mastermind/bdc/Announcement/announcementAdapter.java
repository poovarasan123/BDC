package com.mastermind.bdc.Announcement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastermind.bdc.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

class announcementAdapter extends RecyclerView.Adapter<announcementAdapter.ViewHolder> {

    Context context;
    ArrayList<announcementModel> alist;

    public announcementAdapter(Context cont,ArrayList<announcementModel> list){
        context = cont;
        this.alist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.adapter_announcement,parent,false);

        return new announcementAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tdate.setText(alist.get(position).getDate());
        holder.ttitle.setText(alist.get(position).getTitle());
        holder.tmessage.setText(alist.get(position).getMessage());

    }

    @Override
    public int getItemCount() {
        return alist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tdate, ttitle, tmessage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tdate = itemView.findViewById(R.id.date);
            ttitle = itemView.findViewById(R.id.title);
            tmessage = itemView.findViewById(R.id.message);
        }
    }
}
