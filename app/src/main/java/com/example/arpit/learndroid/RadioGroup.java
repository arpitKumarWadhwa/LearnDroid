package com.example.arpit.learndroid;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RadioGroup extends SensorActivity {

    ImageView prev,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        prev = (ImageView) findViewById(R.id.previous);
        next = (ImageView) findViewById(R.id.next);

        ImageView home = (ImageView) findViewById(R.id.Home);
        home.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RadioGroup.this, MainActivity.class);
                startActivity(i);
            }
        });

        prev.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                android.content.Intent i = new android.content.Intent(RadioGroup.this, CheckBox.class);
                startActivity(i);
            }
        });

        next.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {

                android.content.Intent i = new Intent(RadioGroup.this, Img.class);
                startActivity(i);
            }
        });

        sensorManager =  (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL);
    }
}
