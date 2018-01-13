package com.example.tusharmalik.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ReadActivity extends AppCompatActivity {

    public static final String READNO = "readno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int readno = (int) getIntent().getExtras().get(READNO);

        food foo = food.read[readno];

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        ImageView img = findViewById(R.id.image);

        name.setText(foo.getName());
        desc.setText(foo.getDescription());
        img.setImageResource(foo.getImageid());
    }
}
