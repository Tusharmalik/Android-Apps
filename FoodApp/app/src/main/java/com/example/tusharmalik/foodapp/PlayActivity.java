package com.example.tusharmalik.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    public static final String PLAYNO = "playno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int playno = (int) getIntent().getExtras().get(PLAYNO);

        food foo = food.play[playno];

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        ImageView img = findViewById(R.id.image);

        name.setText(foo.getName());
        desc.setText(foo.getDescription());
        img.setImageResource(foo.getImageid());
    }
}
