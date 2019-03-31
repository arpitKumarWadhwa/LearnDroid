package com.example.arpit.learndroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        android.widget.Button b = findViewById(R.id.b0);
        Button btn = findViewById(R.id.b1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FirstPage.this, register.class);
                startActivity(i);
            }
        });
    }

    public void fun(View v){
        Intent i =new Intent(FirstPage.this, MainActivity.class);
        startActivity(i);
    }
}

