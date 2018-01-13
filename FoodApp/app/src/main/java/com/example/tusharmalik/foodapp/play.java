package com.example.tusharmalik.foodapp;

import android.util.EventLogTags;

/**
 * Created by tusharmalik on 4/1/18.
 */

public class play {
    private String name,description;

    public static final play [] playes={
        new play("Cricket","Cricket is a fun game"),
        new play("Football","There are 11 players in a team"),
        new play("Badminton","Net is needed to play badminton")
    };

    public play(String name,String description)
    {
        this.name=name;
        this.description=description;
    }

    public String getName() { return name;}

    public String getDescription() { return description;}

    public String toString() { return this.name;}
}
