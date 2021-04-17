package com.easytipstutorial.easy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddedData extends AppCompatActivity {

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String KEY_NAME = "name";
    public static final String KEY_FACULTY = "faculty";
    public static final String KEY_SEMESTER = "semester";
    public EditText student_name;
    public EditText student_faculty;
    public EditText student_semester;
    public Button add_record;

    SharedPreferences sharedpreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added_data);

            student_name=findViewById(R.id.name);
            student_faculty=findViewById(R.id.faculty);
            student_semester=findViewById(R.id.semester);
            add_record=findViewById(R.id.add);

            sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

            final String name=sharedpreferences.getString(KEY_NAME,null);
            final String faculty=sharedpreferences.getString(KEY_FACULTY,null);
            final String semester=sharedpreferences.getString(KEY_SEMESTER,null);

            add_record.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v)
                {
                    student_name.setText("Name" +name);
                    student_faculty.setText("Faculty" + faculty);
                    student_semester.setText("Semester" + semester);
            }

            });
    }

    }
