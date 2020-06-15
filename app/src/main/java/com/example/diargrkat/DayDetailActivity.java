package com.example.diargrkat;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.lifecycle.ViewModelProvider;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DayDetailActivity extends AppCompatActivity {

    private TextView detailDenTextView;
    private TextView detailMesiacTextView;
    private TextView detailMeninyTextView;
    private TextView detailPoznamkaTextView;
    private TextView detailNazovDnaTextView;
    private TextView detailSvatyTextView;
    private TextView detailCitanieTextView;
    private Button detailUlozitButton;
    private EditText detailKomentarEditText;

    DayViewModel dayViewModel;
    private final String CHANNEL_ID = "personal_notification";
    private final int NOTIFICATION_ID = 001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_detail);

        detailDenTextView = findViewById(R.id.detailDenTextView);
        detailMesiacTextView = findViewById(R.id.detailMesiacTextView);
        detailMeninyTextView = findViewById(R.id.detailMeninyTextView);
        detailPoznamkaTextView = findViewById(R.id.detailPoznamkaTextView);
        detailNazovDnaTextView = findViewById(R.id.detailNazovDnaTextView);
        detailSvatyTextView = findViewById(R.id.detailSvatyTextView);
        detailCitanieTextView = findViewById(R.id.detailCitanieTextView);
        detailKomentarEditText = findViewById(R.id.detailKomentarEditText);
        detailUlozitButton = findViewById(R.id.detailUlozitButton);

        Intent intent = getIntent();
        Day day = (Day) intent.getSerializableExtra("day");


        detailDenTextView.setText(day.getDen());
        detailMesiacTextView.setText(day.getMesiac());
        detailMeninyTextView.setText(day.getMeniny());
        detailPoznamkaTextView.setText(day.getPoznamka());
        detailNazovDnaTextView.setText(day.getNazovDna());
        detailSvatyTextView.setText(day.getSvaty());
        detailCitanieTextView.setText(day.getCitania());
        detailKomentarEditText.setText(day.getKomentar());

        ViewModelProvider.AndroidViewModelFactory viewModelFactory = new ViewModelProvider.AndroidViewModelFactory(getApplication());
        ViewModelProvider viewModelProvider = new ViewModelProvider(this, viewModelFactory);
        dayViewModel = viewModelProvider.get(DayViewModel.class);

        detailUlozitButton.setOnClickListener(v -> {
            Day updatedDay = new Day();
            updatedDay.setId(day.getId());
            updatedDay.setDen(detailDenTextView.getText() + "");
            updatedDay.setMesiac(detailMesiacTextView.getText() + "");
            updatedDay.setMeniny(detailMeninyTextView.getText() + "");
            updatedDay.setPoznamka(detailPoznamkaTextView.getText() + "");
            updatedDay.setNazovDna(detailNazovDnaTextView.getText() + "");
            updatedDay.setSvaty(detailSvatyTextView.getText() + "");
            updatedDay.setCitania(detailCitanieTextView.getText() + "");
            updatedDay.setKomentar(detailKomentarEditText.getText() +"");



            new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.AlertDialogCustom))
                    .setTitle("Poznámka")
                    .setMessage("Chcete uloziť poznámku?")
                    .setPositiveButton("Áno", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dayViewModel.updateDay(updatedDay);
                            displayNotification(updatedDay);
                            dialog.dismiss();
                        }
                    })
                    .setNegativeButton("Zrušiť", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create().show();
        });

    }

    public void displayNotification(Day day){

        createNotificationChannel();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_cross_notification);
        builder.setContentTitle("Poznámka");
        builder.setContentText("Poznámka k dňu "+ day.getDen() + ". " + day.getMesiac() + " bola úspešne uložená.");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(NOTIFICATION_ID, builder.build());
    }

    public void createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence name = "Notification";
            String description = "Description";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel =  new NotificationChannel(CHANNEL_ID, name, importance);
            notificationChannel.setDescription(description);

            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }
}