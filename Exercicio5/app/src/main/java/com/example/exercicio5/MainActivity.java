package com.example.exercicio5;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import 	android.location.Location;
import android.Manifest;
import	android.widget.Button;
import android.view.View;
import android.location.LocationListener;


public class MainActivity extends Activity implements LocationListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button getGPSBtn = (Button) findViewById(R.id.getGPSBtn);
        ActivityCompat.requestPermissions(MainActivity.this, new
                String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 123);
        getGPSBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            GPSTracker g = new GPSTracker(getApplicationContext());
            Location l = g.getLocation();
            if (l != null) {
                double lat = l.getLatitude();
                double longi = l.getLongitude();
                Toast.makeText(getApplicationContext(), "LAT: " + lat + "LONG: " +
                        longi, Toast.LENGTH_LONG).show();
            }
        }
    });}
    @Override
    public void onLocationChanged(Location location) {
    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }
    @Override
    public void onProviderEnabled(String provider) {
    }
    @Override
    public void onProviderDisabled(String provider) {
    }
}
