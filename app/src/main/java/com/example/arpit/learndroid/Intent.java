package com.example.arpit.learndroid;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Intent extends SensorActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        ImageView home = (ImageView) findViewById(R.id.Home);
        home.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.content.Intent i = new android.content.Intent(Intent.this, MainActivity.class);
                startActivity(i);
            }
        });

        sensorManager =  (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);

        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY), SensorManager.SENSOR_DELAY_NORMAL);
    }
}
