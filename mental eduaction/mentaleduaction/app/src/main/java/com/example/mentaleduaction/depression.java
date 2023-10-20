package com.example.mentaleduaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class depression extends AppCompatActivity {
Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depression);
        setupHyperlink();
        button6=findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(depression.this,types.class);
                startActivity(intent);
            }
        });
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.thelink);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}