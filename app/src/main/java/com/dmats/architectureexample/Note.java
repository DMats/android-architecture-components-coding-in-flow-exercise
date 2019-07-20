package com.dmats.architectureexample;

import androidx.room.Entity;

@Entity(tableName = "note_table")
public class Note {

    private int id;

    private String title;

    private String description;

    private int priority;
}
