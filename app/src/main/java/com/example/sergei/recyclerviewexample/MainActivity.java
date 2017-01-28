package com.example.sergei.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView cardsRecycle;
    GridLayoutManager gridLayoutManager;
    CardAdapter cardsAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardsRecycle = (RecyclerView) findViewById(R.id.recycler_cards);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        cardsRecycle.setLayoutManager(gridLayoutManager);
        cardsAdapter = new CardAdapter(getApplicationContext());
        cardsAdapter.addCards(ItemMenuCards.newInstance("New", R.mipmap.ic_launcher));
        cardsAdapter.addCards(ItemMenuCards.newInstance("Go", R.mipmap.ic_launcher));
        cardsAdapter.addCards(ItemMenuCards.newInstance("Fuck", R.mipmap.ic_launcher));
        cardsAdapter.addCards(ItemMenuCards.newInstance("Super", R.mipmap.ic_launcher));
        cardsRecycle.setAdapter(cardsAdapter);

    }
}
