package com.tinne.finalproject4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterUser extends AppCompatActivity {

    private EditText edEmailregister, edPasswordregister1, edPasswordregister2 ;
    EditText Emailregister;
    EditText Passwordregister1;
    EditText Passwordregister2;
    Button btnSignUpregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        Emailregister = (EditText) findViewById(R.id.edEmailregister);
        Passwordregister1 = (EditText) findViewById(R.id.edPasswordregister1);
        Passwordregister2 = (EditText) findViewById(R.id.edPasswordregister2);
        btnSignUpregister = (Button) findViewById(R.id.btnSignUpregister);
        btnSignUpregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterUser.this, LoginUser.class));
                finish();
            }
        });
    }
}