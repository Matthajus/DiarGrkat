package com.example.diargrkat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DayViewHolder extends RecyclerView.ViewHolder{

    private TextView denTextView;
    private TextView mesiacTextView;
    private TextView meninyTextView;
    private TextView poznamkaTextView;
    private TextView nazovDnaTextView;
    private TextView svatyTextView;
    private TableLayout tableLayout;

    public DayViewHolder(@NonNull View layout) {
        super(layout);

        denTextView = layout.findViewById(R.id.denTextView);
        mesiacTextView = layout.findViewById(R.id.mesiacTextView);
        meninyTextView = layout.findViewById(R.id.meninyTextView);
        poznamkaTextView = layout.findViewById(R.id.poznamkaTextView);
        nazovDnaTextView = layout.findViewById(R.id.nazovDnaTextView);
        svatyTextView = layout.findViewById(R.id.svatyTextView);
        tableLayout = layout.findViewById(R.id.tableLayout);

    }

    @SuppressLint("SetTextI18n")
    public void bind(final Day day, final DayOnClickListener dayOnClickListener){
        denTextView.setText(day.getDen());
        mesiacTextView.setText(day.getMesiac());
        meninyTextView.setText(day.getMeniny());
        poznamkaTextView.setText(day.getPoznamka());
        nazovDnaTextView.setText(day.getNazovDna());
        if (day.isNedela_sviatok()){
            svatyTextView.setTextColor(Color.RED);
        } else {
            svatyTextView.setTextColor(Color.BLACK);
        }
        svatyTextView.setText(day.getSvaty());
        tableLayout.setOnClickListener(v -> dayOnClickListener.onDayClick(day));

    }

}
