package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.tabs.TabLayout;

public class login extends AppCompatActivity {

    private EditText login = null;
    private EditText password = null;
    private EditText remember = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void GetLogin(View view){

        login =(EditText) findViewById(R.id.email);
    }

    public void GetSenha(View view){
        password = (EditText) findViewById(R.id.editTextPassword);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        if(view.getId() == R.id.checkBox_LembrarEmail ) {
            if (checked){
                remember = login;
            }
        }
    }

    public void TrocarSenha (View view) {
        Intent i = new Intent(this, RedefinicaoDeSenhas.class);
        startActivity(i);
    }

    public void NextPage(View view)
    {
       //if(password != null  && login != null)
        //{
        Intent i = new Intent(this, TelaInicial.class);
        startActivity(i);
       // }
 /*       else{

            if(password == null){
                Toast.makeText(getApplicationContext(), "Complete a senha", Toast.LENGTH_SHORT).show();
            }
            else if(login == null){
                Toast.makeText(getApplicationContext(), "Complete o login", Toast.LENGTH_SHORT).show();
            }

 */
       // }
    }
}