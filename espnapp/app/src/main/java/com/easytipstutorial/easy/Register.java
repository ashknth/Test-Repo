package com.easytipstutorial.easy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    public EditText mEmail;
    public EditText mPhone;
    public EditText mPass;
    public Button mRegBtn;
    public TextView btn_sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mEmail= findViewById(R.id.name);
        mPhone  = findViewById(R.id.faculty);
        mPass  = findViewById(R.id.semester);
        mRegBtn= findViewById(R.id.add);
        btn_sign=findViewById(R.id.sign_btn);

        btn_sign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), UserLogin.class));
            }
        });
    }
}