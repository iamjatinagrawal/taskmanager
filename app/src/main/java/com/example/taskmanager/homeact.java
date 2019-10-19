package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class homeact extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeact);

        toolbar = findViewById(R.id.hometoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("TaskManager");
    }
}
