package com.easytipstutorial.easy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    public EditText uname;
    public String un;
    public EditText password;
    public String pass;
    public Button login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        uname = findViewById(R.id.userName);
        password = findViewById(R.id.userName);
        login_btn = findViewById(R.id.btn_login);

        login_btn.setOnClickListener(this);

    }



    public void onClick(View view) {
        un = uname.getText().toString();
        pass = uname.getText().toString();
        if (un.isEmpty() && pass.isEmpty()) {
            Toast.makeText(this, "enter your username", Toast.LENGTH_LONG).show();
        }


    }












    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    }

