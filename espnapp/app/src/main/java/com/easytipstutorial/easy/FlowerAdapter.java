package com.easytipstutorial.easy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> {

    private Context context;
   // private RowClickListener rowClickListener;

    private List<Flower> flowers;

    public FlowerAdapter(Context context, List<Flower> flowers) {
        this.context = context;
        this.flowers = flowers;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //xml file lai inflate gardaixa
        View view= LayoutInflater.from(context).inflate(R.layout.item_flower_list,parent,false);

        //findview by id garna ka laagi pass gareko
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //Flower vanne list ma vako specific position ko data pull garxa, floer 2 lai tanna postion 2 rakhne, default ma sabai linxa
        Flower flower= flowers.get(position);
        //holder ma vako items haru lai extract garnako lagi both tvdate ra tvtitle .
        holder.tvDate.setText(flower.getDate());
        holder.tvTitle.setText(flower.getTitle());
    }

    @Override
    public int getItemCount() {
        //number of flower jati xa sabai return garxa
        return flowers.size();
    }

    public void setData(List<Flower> flowers)
    {
        this.flowers.clear();
        this.flowers.addAll(flowers);
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDate,tvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //xml file list ko data pull gareko
            tvDate=itemView.findViewById(R.id.tv_date);
            tvTitle=itemView.findViewById(R.id.tv_title);
        }


    }

 /*public interface RowClickListener {
            void onRowClick(Flower flower);
            void onEditClick(Flower flower);
            void onDeleteClick(Flower flower);

        }*/
    }


