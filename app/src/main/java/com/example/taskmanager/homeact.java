package com.example.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class homeact extends AppCompatActivity {

    private Toolbar toolbar;

    private FloatingActionButton btnfab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeact);

        toolbar = findViewById(R.id.hometoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("TaskManager");

        btnfab = findViewById(R.id.btnfab);

        btnfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
