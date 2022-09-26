package com.example.session1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {
    EditText demoEditText;
    TextView demoTextView;
    Button demoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        demoEditText = findViewById(R.id.edittext);
        demoTextView=findViewById(R.id.id1);
        demoButton = findViewById(R.id.demoButton);
        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = demoEditText.getText().toString();
                demoTextView.setText(s);
            }
        });

    }
}