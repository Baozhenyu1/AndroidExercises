package com.example.simplesearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private SearchAdapter mSearchAdapter = new SearchAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mSearchAdapter);

        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("Item No." + String.valueOf(i));
        }
        mSearchAdapter.notifyItems(items);
    }
}