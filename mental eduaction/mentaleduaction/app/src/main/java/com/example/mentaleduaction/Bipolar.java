package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bipolar extends AppCompatActivity {
    Button togoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bipolar);
        togoback=findViewById(R.id.button9);
        togoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Bipolar.this,types.class);
                startActivity(intent);
            }
        });
    }
}