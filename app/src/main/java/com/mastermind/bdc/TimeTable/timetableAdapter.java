package com.mastermind.bdc.TimeTable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastermind.bdc.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

class timetableAdapter extends RecyclerView.Adapter<timetableAdapter.ViewHolder> {

    Context context;
    ArrayList<timetableModel> alist;

    private ItemClickListener itemClickListener;

    public interface ItemClickListener{
        void onItemClickListener(int position);
    }

    public void setItemClickListener(ItemClickListener listener){
        itemClickListener= listener;
    }

    int pos=0;

    public timetableAdapter(Context cont,ArrayList<timetableModel> list){
        context = cont;
        this.alist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.adapter_timetable,parent,false);

        return new timetableAdapter.ViewHolder(v, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.dname.setText(alist.get(position).getS1());
        holder.image.setImageDrawable(alist.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return alist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView dname;
        ImageView image;

        public ViewHolder(@NonNull View itemView, final ItemClickListener listener) {
            super(itemView);

            dname = itemView.findViewById(R.id.D_name);
            image = itemView.findViewById(R.id.image);

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
