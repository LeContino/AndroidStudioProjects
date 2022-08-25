package example.com;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView result;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editTextNumber); // ID from component
        Toast.makeText(this, "Value: " + et1.getText().toString(), Toast.LENGTH_SHORT).show();
        // The activity is

        et2 = (EditText) findViewById(R.id.editTextNumber2); // ID from component
        Toast.makeText(this, "Value: " + et2.getText().toString(), Toast.LENGTH_SHORT).show();
        // The activity is created
    }

    public void sum(View view){
        int soma;

        try {
            soma = Integer.parseInt(et1.getText().toString());
            soma = soma + Integer.parseInt(et2.getText().toString());
            result = (TextView) findViewById(R.id.txt_result); // ID from component
            result.setText(String.valueOf(soma));
        } catch(NumberFormatException nfe) {
            System.out.println("Could not parse " + nfe);
        }
    }
}

