package com.easytipstutorial.easy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class UserLogin extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs";
    public EditText uname;
    public String un;
    public EditText password;
    public String pass;
    public Button login_btn;
    public TextView no_account;

    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        uname = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        login_btn = findViewById(R.id.btn_login);
        no_account=findViewById(R.id.noAccount);


        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        editor = sharedpreferences.edit();
        uname.setText(sharedpreferences.getString("u", ""));
        password.setText(sharedpreferences.getString("p", ""));


        login_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                un = uname.getText().toString();
                pass = password.getText().toString();

                if (un.isEmpty() && pass.isEmpty()) {
                    Toast.makeText(UserLogin.this, "Enter Credentials", Toast.LENGTH_LONG).show();
                } else {
                    if (un.equals("abc@gmail.com") && (pass.equals("123"))) {
                        Toast.makeText(UserLogin.this, "Logged In", Toast.LENGTH_SHORT).show();
                        editor.putString("u", un);
                        editor.putString("p", pass);
                        editor.commit();

                        Intent intent = new Intent(UserLogin.this, DashboardActivity.class);
                        startActivity(intent);
                    } else
                        Toast.makeText(UserLogin.this, "Username or Password Wrong", Toast.LENGTH_LONG).show();

                }


                no_account.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), Register.class));
                    }
                });

            }
});
    }
}













