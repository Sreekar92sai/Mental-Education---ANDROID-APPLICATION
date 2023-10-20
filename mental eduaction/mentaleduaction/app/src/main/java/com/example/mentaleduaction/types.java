package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class types extends AppCompatActivity {
Button button4,button5,button6,anxiety,behavior,bipolar,eating,OCD,PTSD,NPD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);
        button4= findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        anxiety=findViewById(R.id.anxiety);
        behavior=findViewById(R.id.Behavioraldisorder);
        bipolar=findViewById(R.id.Bipolardisorder);
        eating=findViewById(R.id.eatingdisorders);
        OCD=findViewById(R.id.OCD);
        PTSD=findViewById(R.id.PTSD);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent=new Intent(types.this,depression.class);
                        startActivity(intent);
                    }
                });
        anxiety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,anxiety2.class);
                startActivity(intent);
            }
        });
        behavior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,behavioraldisorder.class);
                startActivity(intent);
            }
        });
        bipolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,Bipolar.class);
                startActivity(intent);
            }
        });
        eating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,eatingdisorders.class);
                startActivity(intent);
            }
        });
        OCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,OCD.class);
                startActivity(intent);
            }
        });
        PTSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,PTSD.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(types.this,Aboutapp.class);
                startActivity(intent);
            }
        });

    }
}