package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class behavioraldisorder extends AppCompatActivity {
    Button togoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_behavioraldisorder);
        togoback=findViewById(R.id.button8);
        togoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(behavioraldisorder.this,types.class);
                startActivity(intent);
            }
        });
    }
}