package com.example.exercicio3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    TextView coordinate_x,coordinate_y,coordinate_z;
    float[] array = new float[3];
    boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coordinate_x = (TextView) findViewById(R.id.txt_x_1);
        coordinate_y = (TextView) findViewById(R.id.txt_y_1);
        coordinate_z = (TextView) findViewById(R.id.txt_z_1);

    }
    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);

    }
    @Override
    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.sensor.getType()== Sensor.TYPE_ACCELEROMETER) {
            float sensorX = event.values[0];
            float sensorY = event.values[1];
            float sensorZ = event.values[2];
            coordinate_x.setText("X: "+ " " +Float.toString(sensorX));
            coordinate_y.setText("Y: "+ " " +Float.toString(sensorY));
            coordinate_z.setText("Z: "+ " " +String.valueOf(sensorZ));
            if(firstTime){
                array[0] = sensorX;
                array[1] = sensorY;
                array[2] = sensorZ;
                firstTime = false;
            }
            else{
                if(sensorX > array[0]|| sensorY >  array[1] || sensorZ > array[2]){
                    Send();
                }
            }
        }
    }
    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // The activity is about to become visible.
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // The activity is no longer visible (now it is "stopped")
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // The activity is about to be destroyed.
    }
    public void Send()
    {
        Intent i = new Intent(this, MainActivity2.class);
        //i.putExtra("data", findViewById(R.id.txt_resp).toString());
        startActivity(i);
    }
}