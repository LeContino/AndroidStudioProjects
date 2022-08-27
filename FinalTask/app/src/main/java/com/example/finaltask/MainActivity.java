package com.example.finaltask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
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
import android.os.Bundle;
import android.widget.Toast;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

//imageView:
//https://acervolima.com/imageview-no-android-com-exemplo/#:~:text=Para%20adicionar%20uma%20imagem%20do%20Android%20Studio%20Arraste,imagem%20diferente%20de%20recursos%20drawable%20do%20Android%20Studio%3A

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // The activity is created
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        //The activity has become visible (now it "resumes").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Focus on another activity (this activity is about to be "stopped").
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

    public void Send(View view)
    {
        Button bt = (Button) findViewById(R.id.StartButton);
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}