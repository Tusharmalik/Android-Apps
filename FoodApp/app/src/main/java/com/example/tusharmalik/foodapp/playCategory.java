package com.example.tusharmalik.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class playCategory extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listPlay = getListView();

        ArrayAdapter<food> listAdapter = new ArrayAdapter<food>(this,android.R.layout.simple_list_item_1,food.play);
//        ArrayAdapter<play> listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,play.playes);
        listPlay.setAdapter(listAdapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(playCategory.this,PlayActivity.class);
        intent.putExtra(PlayActivity.PLAYNO,(int) id);
        startActivity(intent);
    }
}
