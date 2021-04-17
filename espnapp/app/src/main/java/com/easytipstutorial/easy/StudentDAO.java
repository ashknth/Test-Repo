package com.easytipstutorial.easy;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
public interface StudentDAO {
    @Query("SELECT * FROM Student")
    List<Student> getAll();

    @Insert
    void insertAll(Student... students);


}
