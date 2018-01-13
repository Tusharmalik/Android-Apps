package com.example.tusharmalik.foodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodno = (int) getIntent().getExtras().get(EXTRA_FOODNO);

        food foo = food.foods[foodno];

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        ImageView img = findViewById(R.id.image);

        name.setText(foo.getName());
        desc.setText(foo.getDescription());
        img.setImageResource(foo.getImageid());

    }
}
