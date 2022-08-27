package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

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
    private void HasAccount(View view){

    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox_LembrarEmail:
                if (checked){
                    remember = login;
                }
            else
                break;
        }
    }

    public void NextPage(View view)
    {
        if(password != null  && login != null)
        {
            Intent i = new Intent(this, TelaInicial.class);
            startActivity(i);
        }
       /* else
        {
            //redefinir senhas
        }*/
    }
}