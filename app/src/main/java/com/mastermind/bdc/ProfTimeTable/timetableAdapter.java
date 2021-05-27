package com.mastermind.bdc.ProfTimeTable;

import android.content.Context;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.ValueEventListener;
import com.mastermind.bdc.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

class timetableAdapter extends RecyclerView.Adapter<timetableAdapter.ViewHolder> {

    private Context context;
    private ArrayList<timetableModel> alist;

    private ItemClickListener itemClickListener;

    public interface ItemClickListener{
        void onItemClickListener(int position);

        void onDeleteClick(int position);

    }

    public void setItemClickListener(ItemClickListener listener){
        itemClickListener= listener;
    }

    int pos=0;

    public timetableAdapter(Context cont,ArrayList<timetableModel> list){
        context = cont;
        alist = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.adapter_timetable_prof,parent,false);

        return new ViewHolder(v, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        timetableModel uploadcurrent = alist.get(position);

        holder.dname.setText(uploadcurrent.getS1());
        Picasso.get().load(uploadcurrent.getImage()).placeholder(R.mipmap.ic_launcher).fit().centerCrop().into(holder.image);

    }

    @Override
    public int getItemCount() {
        return alist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        private TextView dname;
        private ImageView image;

        public ViewHolder(@NonNull View itemView, final ItemClickListener listener) {
            super(itemView);

            dname = itemView.findViewById(R.id.D_name);
            image = itemView.findViewById(R.id.image);

            itemView.setOnClickListener(this);
            itemView.setOnCreateContextMenuListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            menu.setHeaderTitle("Select Action");
            MenuItem delete = menu.add(Menu.NONE,1,1,"Delete");

           delete.setOnMenuItemClickListener(this);

        }

        @Override
        public boolean onMenuItemClick(MenuItem item) {
            if(itemClickListener != null){
                int position = getAdapterPosition();
                if(position != RecyclerView.NO_POSITION){

                    switch (item.getItemId()){
                        case 1:
                            itemClickListener.onDeleteClick(position);
                            return true;
                    }
                    return false;
                }
            }
            return false;
        }

        @Override
        public void onClick(View v) {
            if(itemClickListener != null){
                int position = getAdapterPosition();
                if(position != RecyclerView.NO_POSITION){
                    itemClickListener.onItemClickListener(position);
                }
            }
        }
    }
}
