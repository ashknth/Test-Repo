package com.easytipstutorial.easy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.easytipstutorial.easy.UserLogin.MyPREFERENCES;

public class AddDataActivity extends AppCompatActivity {
    public static final String MyPREFERENCES = "MyPrefs";
    public static final String KEY_NAME = "name";
    public static final String KEY_FACULTY = "faculty";
    public static final String KEY_SEMESTER = "semester";
 public EditText student_name;
 public EditText student_faculty;
 public EditText student_semester;
 public Button add_record;
    public String st_name;
    public String st_faculty;
    public String st_semester;

    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        student_name=findViewById(R.id.name);
        student_faculty=findViewById(R.id.faculty);
        student_semester=findViewById(R.id.semester);
        add_record=findViewById(R.id.add);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        st_name=student_name.getText().toString();
        st_faculty=student_faculty.getText().toString();
        st_semester=student_semester.getText().toString();

        add_record.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {

                String name = sharedpreferences.getString(KEY_NAME, st_name);
                String faculty = sharedpreferences.getString(KEY_FACULTY, st_faculty);
                String semester = sharedpreferences.getString(KEY_SEMESTER, st_semester);
                editor.apply();

                Intent intent=new Intent(AddDataActivity.this,AddedData.class);
                startActivity(intent);

                Toast.makeText(AddDataActivity.this, "Data Added", Toast.LENGTH_LONG).show();


                editor.putString(KEY_NAME,st_name);
                editor.putString(KEY_NAME,st_faculty);
                editor.putString(KEY_NAME,st_semester);
            }
        });
    }
}