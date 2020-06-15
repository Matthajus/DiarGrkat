package com.example.diargrkat;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import java.util.Objects;

public class DayDiff extends DiffUtil.ItemCallback<Day> {
    @Override
    public boolean areItemsTheSame(@NonNull Day oldItem, @NonNull Day newItem) {
        return Objects.equals(oldItem.getId(), newItem.getId());
    }

    @Override
    public boolean areContentsTheSame(@NonNull Day oldItem, @NonNull Day newItem) {
        return Objects.equals(oldItem.getDen(), newItem.getDen()) &&
                Objects.equals(oldItem.getMesiac(), newItem.getMesiac()) &&
                Objects.equals(oldItem.getMeniny(), newItem.getMeniny());
    }
}
