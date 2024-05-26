package com.example.sampledatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TaskDao {

    @Insert
    void insertTask(Task task);

    @Query("SELECT * FROM Task")
    List<Task> getAll();

    @Delete
    void deleteTask(Task task);

    @Update
    void updateTask(Task task);

}
