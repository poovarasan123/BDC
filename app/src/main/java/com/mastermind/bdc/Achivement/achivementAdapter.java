package com.mastermind.bdc.Achivement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastermind.bdc.R;
import java.util.ArrayList;

class achivementAdapter extends RecyclerView.Adapter<achivementAdapter.ViewHolder> {

    Context context;
    ArrayList<achivementModel> elist;

    private achivementAdapter.ItemClickListener itemClickListener;

    public interface ItemClickListener{
        void onItemClickListener(int position);
    }

    public void setItemClickListener(achivementAdapter.ItemClickListener listener){
        itemClickListener= listener;
    }

    int pos=0;

    public achivementAdapter(Context cont,ArrayList<achivementModel> list){
        context = cont;
        this.elist = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.adapter_achivement,parent,false);

        return new achivementAdapter.ViewHolder(v,itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.sname.setText(elist.get(position).getSname());
        holder.dname.setText(elist.get(position).getDname());
        holder.ename.setText(elist.get(position).getEname());
        holder.achive.setText(elist.get(position).getPlace());
        holder.venue.setText(elist.get(position).getVenue());

    }

    @Override
    public int getItemCount() {
        return elist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView sname,dname,ename,achive,venue;

        public ViewHolder(@NonNull View itemView, final ItemClickListener listener) {
            super(itemView);

            sname = itemView.findViewById(R.id.sname);
            dname = itemView.findViewById(R.id.dsy);
            ename = itemView.findViewById(R.id.event);
            achive = itemView.findViewById(R.id.achive);
            venue = itemView.findViewById(R.id.collname);

            itemView.setOnClickListener(v -> {
                if(listener != null){
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        listener.onItemClickListener(position);
                    }
                }
            });
        }
    }
}
