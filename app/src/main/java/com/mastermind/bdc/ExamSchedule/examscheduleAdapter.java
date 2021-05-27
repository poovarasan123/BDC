package com.mastermind.bdc.ExamSchedule;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mastermind.bdc.R;

import java.util.ArrayList;

class examscheduleAdapter extends RecyclerView.Adapter<examscheduleAdapter.ViewHolder> {

    Context context;
    ArrayList<examscheduleModel> elist;

    public examscheduleAdapter(Context cont,ArrayList<examscheduleModel> list){
       context = cont;
       this.elist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.adapter_exam_schedule,parent,false);

        return new examscheduleAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.ename.setText(elist.get(position).getExam());
        holder.image.setImageDrawable(elist.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return elist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView ename;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ename = itemView.findViewById(R.id.E_name);
            image = itemView.findViewById(R.id.E_image);

        }
    }
}
