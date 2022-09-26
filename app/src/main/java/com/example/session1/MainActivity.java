package com.example.session1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button takeMeButton;
    TextView textView;
   // int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        takeMeButton = findViewById(R.id.takeMeButton);
        textView = findViewById(R.id.tvId);
        takeMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,LogInActivity.class);
                startActivity(x);
                finish();
            }
        });
    }
}