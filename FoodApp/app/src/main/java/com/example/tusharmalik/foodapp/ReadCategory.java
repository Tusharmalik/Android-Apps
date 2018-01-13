package com.example.tusharmalik.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReadCategory extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ListView readView = getListView();

        ArrayAdapter<food> listAdapter = new ArrayAdapter<> (this,android.R.layout.simple_list_item_1,food.read);
        readView.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(ReadCategory.this,ReadActivity.class);
        intent.putExtra(ReadActivity.READNO,(int) id);
        startActivity(intent);
    }
}
