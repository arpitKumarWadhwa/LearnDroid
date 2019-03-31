package com.example.arpit.learndroid;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Switch extends SensorActivity{

    android.widget.ImageView prev,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        prev = (ImageView)findViewById(R.id.previous);
        next = (ImageView) findViewById(R.id.next);

        ImageView home = (ImageView) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Switch.this, MainActivity.class);
                startActivity(i);
            }
        });

        prev.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                android.content.Intent i = new android.content.Intent(Switch.this, ToggleButton.class);
                startActivity(i);
            }
        });

        next.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent i = new Intent(Switch.this, WebView.class);
                startActivity(i);
            }
        });

        sensorManager =  (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL);
    }
}
