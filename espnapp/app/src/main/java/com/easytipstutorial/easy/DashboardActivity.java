package com.easytipstutorial.easy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
 public Button add_button;
 public ImageView logout_btn;
 public TextView users_name;

 SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        logout_btn=findViewById(R.id.btn_logout);
        add_button=findViewById(R.id.btn_add);
        users_name=findViewById(R.id.usersName);

       add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(DashboardActivity.this, AddDataActivity.class));
            }
        });



       logout_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(DashboardActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                editor.clear();
                editor.apply();
               startActivity(new Intent(DashboardActivity.this, UserLogin.class));
               finish();

            }
        });

       users_name.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               users_name.setText("Name" ); //kaam garna baaki xa
           }
       });
    }

}