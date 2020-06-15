package com.example.diargrkat;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Day.class, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract DayDao dayDao();

    private static volatile AppDatabase db;

    public static AppDatabase getDb(Context context){
        AppDatabase result = db;
        if (result == null){
            synchronized (AppDatabase.class){
                if (db == null){
                    db = result = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class, "days-database").build();
                }
            }
        }
        return result;
    }

}
