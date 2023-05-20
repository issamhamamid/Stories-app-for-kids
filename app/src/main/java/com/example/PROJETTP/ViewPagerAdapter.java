package com.example.PROJETTP;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends PagerAdapter {

    Context context;
    Scene[] texts;

    public ViewPagerAdapter(Context context, Scene[] texts) {
        this.context = context;
        this.texts = texts;
    }

    @Override
    public int getCount() {
        return texts.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.scene_view , container , false);
        TextView scenetextt = (TextView) view.findViewById(R.id.scenetext);
        ImageView sceneimagee = (ImageView) view.findViewById(R.id.simg);
        scenetextt.setText(this.texts[position].getScenetext());
        sceneimagee.setImageResource(this.texts[position].getImage());
        container.addView(view);


        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object );
    }
}
