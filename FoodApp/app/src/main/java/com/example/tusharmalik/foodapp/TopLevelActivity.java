package com.example.tusharmalik.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        AdapterView.OnItemClickListener itemClickListener= new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> listView, View v, int i, long l) {
                if(i==0)
                {
                    Intent intent = new Intent(TopLevelActivity.this,FoodCategoryActivity.class);
                    startActivity(intent);
                }
                else if(i==1)
                {
                    Intent intent1 = new Intent(TopLevelActivity.this,playCategory.class);
                    startActivity(intent1);
                }
                else if(i==2)
                {
                    Intent intent = new Intent(TopLevelActivity.this,ReadCategory.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = findViewById(R.id.list_item);
        listView.setOnItemClickListener(itemClickListener);
    }
}
