package com.example.tusharmalik.foodapp;

/**
 * Created by tusharmalik on 3/1/18.
 */

public class food {
    private String name, description;
    private int imageid;

    public static final food [] foods={

            new food("Pizza","Thin crush pizza with extra cheese",R.drawable.pizza),
            new food("Burger","Veg Burger with healthy stuff",R.drawable.burger),
            new food("Sandwich","Whole wheat sandwich",R.drawable.sandwich),

    };

    public static final food [] play={
            new food("Cricket","Cricket is a fun game",R.drawable.cricket),
            new food("Football","There are 11 players in a team",R.drawable.football),
            new food("Badminton","Net is needed to play badminton",R.drawable.badminton),
    };

    public static final food [] read={
            new food("Book","It is for learning a particular skill",R.drawable.book),
            new food("Magazine","It is for knowing about celebrities",R.drawable.magazine),
            new food("Newspaper","It is for knowing about the world",R.drawable.newspaper),
    };

    public food(String name, String description, int imageid) {
        this.name = name;
        this.description = description;
        this.imageid = imageid;
    }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public String toString() { return this.name; }

    public int getImageid() { return imageid; }

}
