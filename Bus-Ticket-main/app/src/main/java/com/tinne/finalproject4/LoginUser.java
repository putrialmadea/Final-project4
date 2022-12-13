package com.tinne.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginUser extends AppCompatActivity {

    private EditText userEmail, userPassword;
    EditText Emailuser;
    EditText Passworduser;
    Button btnLoginuser, btnSignUpuser ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        Emailuser= (EditText) findViewById(R.id.userEmail);
        Passworduser= (EditText) findViewById(R.id.userPassword);
        btnSignUpuser= (Button) findViewById(R.id.btnSignUpuser);
        btnLoginuser= (Button) findViewById(R.id.btnLoginuser);
        btnSignUpuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginUser.this, RegisterUser.class));
                finish();
            }
        });

    }
}