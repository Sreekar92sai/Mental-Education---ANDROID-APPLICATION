package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class anxiety2 extends AppCompatActivity {
    Button togoback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety2);
        togoback=findViewById(R.id.button7);
        togoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(anxiety2.this,types.class);
                startActivity(intent);
            }
        });
    }
}
