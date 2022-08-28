package com.example.finaltask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;

//imageView:
//https://acervolima.com/imageview-no-android-com-exemplo/#:~:text=Para%20adicionar%20uma%20imagem%20do%20Android%20Studio%20Arraste,imagem%20diferente%20de%20recursos%20drawable%20do%20Android%20Studio%3A

public class MainActivity extends AppCompatActivity {
private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        // The activity is created

        start = (Button) findViewById(R.id.StartButton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NextPage(v);
            }
        });
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

    public void NextPage(View view)
    {
        Intent i = new Intent(this, login.class);
        startActivity(i);
    }
}