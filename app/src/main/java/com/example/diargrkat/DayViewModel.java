package com.example.diargrkat;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class DayViewModel extends AndroidViewModel {

    private LiveData<List<Day>> days;

    private DayDao dayDao;

    private AppDatabase db;

    public DayViewModel(@NonNull Application application) {
        super(application);
        db = AppDatabase.getDb(application);
        dayDao = db.dayDao();
        days = dayDao.getAll();
    }

    public LiveData<List<Day>> getDays() {
        return days;
    }

    public void addDay(Day day){
        db.getTransactionExecutor().execute(() -> dayDao.addDay(day));
    }

    public void updateDay(Day day){
        db.getTransactionExecutor().execute(() -> dayDao.updateDay(day));
    }

}
