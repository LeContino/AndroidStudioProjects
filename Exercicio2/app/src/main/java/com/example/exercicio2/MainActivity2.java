package com.example.exercicio2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private TextView ed1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ed1 = (TextView) findViewById(R.id.txt2);
        String data = getIntent().getStringExtra("data");
        ed1.setText(data);
    }
}