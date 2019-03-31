package com.example.arpit.learndroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView vGroup;
    ImageView v;
    ImageView lifecycle;
    ImageView mfest;
    ImageView toast;
    ImageView intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vGroup = (ImageView) findViewById(R.id.view_groups);
        v = (ImageView) findViewById(R.id.views);
        lifecycle = (ImageView) findViewById(R.id.activity_lifecycle);
        mfest = (ImageView) findViewById(R.id.manifest);
        toast = (ImageView) findViewById(R.id.toast);
        intent = (ImageView) findViewById(R.id.intents);


        vGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ViewGroup.class);
                startActivity(i);
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, com.example.arpit.learndroid.View.class);
                startActivity(i);
            }
        });

        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, ActivityLifecycle.class);
                startActivity(i);
            }
        });

        mfest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Manifest.class);
                startActivity(i);
            }
        });


        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Toast.class);
                startActivity(i);
            }
        });

        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, com.example.arpit.learndroid.Intent.class);
                startActivity(i);
            }
        });
    }
}
