package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class login extends AppCompatActivity {

    private EditText login = null;
    private EditText password = null;
    private CheckBox remember = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void GetLogin(View view){

        login =(EditText) findViewById(R.id.email);
    }

    private void GetSenha(View view){
        password = (EditText) findViewById(R.id.editTextPassword);
    }
    private void HasAccount(View view){

    }

    public void Send(View view)
    {
        if(password != null  && login != null)
        {
            Intent i = new Intent(this, TelaInicial.class);
            startActivity(i);
        }
        else
        {
            //redefinir senhas
        }

    }

}