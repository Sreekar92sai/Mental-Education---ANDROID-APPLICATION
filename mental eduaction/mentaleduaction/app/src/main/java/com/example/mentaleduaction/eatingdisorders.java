package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class eatingdisorders extends AppCompatActivity {
    Button togoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eatingdisorders);
        togoback=findViewById(R.id.button10);
        togoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(eatingdisorders.this,types.class);
                startActivity(intent);
            }
        });
    }
}