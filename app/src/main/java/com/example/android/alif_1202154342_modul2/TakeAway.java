package com.example.android.alif_1202154342_modul2;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    // method untuk mengarahkan ke aktivitas selanjutnya
    public void onClickOrder(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void onDate(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.date_picker));
    }

    public void onTime(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(),
                getString(R.string.time_picker));
    }
}
