package com.example.PROJETTP;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<StoryModel> storieslist;
    Adapter adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();



    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(storieslist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {

        storieslist = new ArrayList<>();
        storieslist.add(new StoryModel(R.drawable.avril , "Le premier avril" ) );
        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ) );
        storieslist.add(new StoryModel(R.drawable.pelican , "L’éléphant et le pélican" ) );
        storieslist.add(new StoryModel(R.drawable.tango , "À la recherche de tango" ) );
        storieslist.add(new StoryModel(R.drawable.bol , "Bol de fer et bol de ver" ) );
        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ) );
        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ) );
        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ) );
        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ) );
        storieslist.add(new StoryModel(R.drawable.loup , "Le loup et L'agneau" ) );

        
    }
}