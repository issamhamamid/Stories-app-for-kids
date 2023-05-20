package com.example.PROJETTP;

import static android.content.Intent.getIntent;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<StoryModel> storieslist;

    private final RecyclerViewInterface recyclerViewInterface;

    public Adapter(List<StoryModel> storieslist, RecyclerViewInterface recyclerViewInterface) {
        this.storieslist = storieslist;
        this.recyclerViewInterface = recyclerViewInterface;
    }



    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_design , parent , false);
        return new ViewHolder(view );
    }

    @SuppressLint("SuspiciousIndentation")
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int imagee = storieslist.get(position).getImage();
        String tittre = storieslist.get(position).getTitre();
        holder.setData(imagee , tittre);
        if(!storieslist.get(position).isFavoriteStatus())
        holder.favbtn.setImageResource(R.drawable.favorite_border_icon);
        else
            holder.favbtn.setImageResource(R.drawable.favorite_icon);

    }

    @Override
    public int getItemCount() {
        return storieslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        ImageButton favbtn;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pelican);
            textView = itemView.findViewById(R.id.titre);
            favbtn = itemView.findViewById(R.id.playbtn);

            itemView.setOnClickListener(view->{
                if(recyclerViewInterface !=null){
                    int pos = getBindingAdapterPosition();
                    if( pos !=RecyclerView.NO_POSITION){
                        recyclerViewInterface.onStoryClicked(pos);
                    }
                }
            });

            favbtn.setOnClickListener(view->{
                if(recyclerViewInterface !=null){
                    int pos = getBindingAdapterPosition();

                    if( pos !=RecyclerView.NO_POSITION){
                        recyclerViewInterface.onFavoritebtnClicked(pos);
                    }






                }
            });





        }

        public void setData(int imagee, String tittre) {
            imageView.setImageResource(imagee);
            textView.setText(tittre);
        }
    }
}