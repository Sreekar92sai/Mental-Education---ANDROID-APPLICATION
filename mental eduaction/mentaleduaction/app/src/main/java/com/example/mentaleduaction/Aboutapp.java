package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Aboutapp extends AppCompatActivity {
Button button3,button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutapp);
        button3=findViewById(R.id.button3);
        button=findViewById(R.id.button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Aboutapp.this,types.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Aboutapp.this, "Loged out", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(Aboutapp.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}