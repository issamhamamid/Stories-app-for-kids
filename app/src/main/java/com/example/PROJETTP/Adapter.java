package com.example.PROJETTP;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<StoryModel> storieslist;

    public Adapter(List<StoryModel> storieslist) {
        this.storieslist = storieslist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_design , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int imagee = storieslist.get(position).getImage();
        String tittre = storieslist.get(position).getTitre();
        holder.setData(imagee , tittre);

    }

    @Override
    public int getItemCount() {
        return storieslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.pelican);
            textView = itemView.findViewById(R.id.titre);
        }

        public void setData(int imagee, String tittre) {
          imageView.setImageResource(imagee);
          textView.setText(tittre);
        }
    }
}
