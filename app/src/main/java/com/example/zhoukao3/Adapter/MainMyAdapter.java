package com.example.zhoukao3.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhoukao3.R;
import com.example.zhoukao3.app.MyApp;
import com.example.zhoukao3.base.bean.MainBean;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by 杨运泽 on 2018/6/25.
 */

public class MainMyAdapter extends RecyclerView.Adapter<MainMyAdapter.MyViewHolder> {
       private List<MainBean.JsonBean> list;

    public MainMyAdapter(List<MainBean.JsonBean> list) {
        this.list = list;
    }

    @Override
    public MainMyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_activity, parent, false);


        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MainMyAdapter.MyViewHolder holder, int position) {


        holder.textView01.setText(list.get(position).getName());
        ImageLoader.getInstance().displayImage(list.get(position).getImage(),holder.imageView, MyApp.getOptions());
        holder.textView02.setText(list.get(position).getPrice());
        holder.textView03.setText(list.get(position).getAgio());

    }

    @Override
    public int getItemCount() {
        return list==null ? 0 :list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
      private ImageView imageView;
      private TextView textView01,textView02,textView03;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item_image);
            textView01 = itemView.findViewById(R.id.item_name);
            textView02=itemView.findViewById(R.id.item_price);
            textView03=itemView.findViewById(R.id.item_price2);
        }
    }
}
