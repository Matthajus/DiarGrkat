package com.example.diargrkat;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DayDao {

    @Query("SELECT * from days")
    LiveData<List<Day>> getAll();

    @Insert
    void addDay(Day day);

    @Update
    void updateDay(Day day);

}
