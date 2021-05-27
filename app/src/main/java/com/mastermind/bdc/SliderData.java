package com.mastermind.bdc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

class SliderData extends SliderViewAdapter<SliderData.Holder> {

    int[] images;

    public SliderData(int[] images){
        this.images = images;
    }


    @Override
    public Holder onCreateViewHolder(ViewGroup parent) {

        //initialize view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.imageslider,parent,false);

        //return view
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder viewHolder, int position) {
        //set image on image view
        viewHolder.imageView.setImageResource(images[position]);

    }

    @Override
    public int getCount() {
        //return images length
        return images.length;
    }

    public class Holder extends SliderViewAdapter.ViewHolder{

        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.slider_images);
        }
    }

}
