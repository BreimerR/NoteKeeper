package com.gmail.brymher.notekeeper.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gmail.brymher.notekeeper.R;
import com.gmail.brymher.notekeeper.adapters.DataManager;
import com.gmail.brymher.notekeeper.adapters.Note;

import java.util.List;

public class Notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // sets the activity view
        setContentView(R.layout.activity_notes);
        // get toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        // set toolbar to this activity
        setSupportActionBar(toolbar);
        // initialize the listView since it covers all the window
        initializeDisplayContent();
    }

    private void initializeDisplayContent() {
        ListView notesListView = (ListView) findViewById(R.id.notes_list);

        List<Note> notes = DataManager.getInstance().getNotes();

        ArrayAdapter<Note> notesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notes);

        notesListView.setAdapter(notesAdapter);

    }

}
