package com.example.PROJETTP;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NavigationActivity extends AppCompatActivity {

    ViewPager slideViewPager;
    ViewPagerAdapter viewPagerAdapter;
    Button backbutton , nextbutton;
    LinearLayout dotIndicator;
    TextView[] dots;

    int scenesLength;


    Scene[] texts ;

    ViewPager.OnPageChangeListener viewPagerListener = new ViewPager.OnPageChangeListener(){

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {


            setDotIndicator(position);
            if(position==scenesLength-1){
                nextbutton.setText("Terminer");
            }



        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();

        Parcelable[] parcelables = getIntent().getParcelableArrayExtra("scenes");


        texts= new Scene[parcelables.length];
        for (int j = 0; j < parcelables.length; j++) {
            texts[j] = (Scene) parcelables[j];
        }


        setContentView(R.layout.activity_navigation);
        backbutton= findViewById(R.id.backbutton);
        nextbutton = findViewById(R.id.nextbutton);

         backbutton.setOnClickListener(view ->{
             if(getItem(0) > 0 ){
                 slideViewPager.setCurrentItem(getItem(-1) , true);
             }
             else {
                 Intent intent = new Intent(this , MainActivity.class);
                 startActivity(intent);
                 finish();

             }
         });

         nextbutton.setOnClickListener(view ->{
             if(getItem(0) < scenesLength-1){
                 slideViewPager.setCurrentItem(getItem(1) , true);
             }
             else {
                 Intent intent = new Intent(this , MainActivity.class);
                 startActivity(intent);
                 finish();

             }
         });

         slideViewPager = (ViewPager) findViewById(R.id.viewpager);
         dotIndicator = (LinearLayout) findViewById(R.id.dotIndicator);
         viewPagerAdapter = new ViewPagerAdapter(this ,texts );
         slideViewPager.setAdapter(viewPagerAdapter);
         setDotIndicator(0);
         slideViewPager.addOnPageChangeListener(viewPagerListener);
        Intent intentt = getIntent();
        scenesLength = intentt.getIntExtra("numscenes", 0);
    }

    public void setDotIndicator(int position){



        dots = new TextView[scenesLength];
        dotIndicator.removeAllViews();

        for(int i=0 ; i<dots.length ; i++){
            dots[i] = new TextView(this);
            dots[i].setTextSize(35);
            dotIndicator.addView(dots[i]);
        }


    }


    private int getItem(int i){
        return slideViewPager.getCurrentItem()+i;
    }
}