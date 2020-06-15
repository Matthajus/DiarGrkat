package com.example.diargrkat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

public class DayListAdapter extends ListAdapter<Day, DayViewHolder> {

    private DayOnClickListener dayOnClickListener;

    public DayListAdapter(DayOnClickListener dayOnClickListener){
        super(new DayDiff());
        this.dayOnClickListener = dayOnClickListener;
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_line, parent, false);

        return new DayViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {
        holder.bind(getItem(position), dayOnClickListener);
    }
}
