package com.easytipstutorial.easy;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Student.class}, version = 1)
public abstract class StudentDatabase extends RoomDatabase{


    private Context context;

    public abstract StudentDAO studentDao();

    private static StudentDatabase studentDatabase;


    public static synchronized StudentDatabase getInstance(Context context)
    {
        if(studentDatabase==null) {
            studentDatabase= Room.databaseBuilder(context.getApplicationContext(),
                    StudentDatabase.class,
                    "student_database")
                    .allowMainThreadQueries()
                    .build();
        }
        return studentDatabase;
    }
}
