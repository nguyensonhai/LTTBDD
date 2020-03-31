package com.eztech.lab_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radGr;
    RadioButton radXemBongDa, radXemPhim, radNgheNhac, radChoiGame;
    Button btnVote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Refactor();
        btnVote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showVote();
            }
        });
    }
    private void showVote() {
        int idChecked = radGr.getCheckedRadioButtonId();
        switch (idChecked) {
            case R.id.radXemBongDa:
                Toast.makeText(getApplicationContext(), "Sở thích của bạn là Xem Bóng Đá" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.radXemPhim:
                Toast.makeText(getApplicationContext(), "Sở thích của bạn là Xem Phim" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.radNgheNhac:
                Toast.makeText(getApplicationContext(), "Sở thích của bạn là Nghe Nhạc" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.radChoiGame:
                Toast.makeText(getApplicationContext(), "Sở thích của bạn là Chơi Game" , Toast.LENGTH_SHORT).show();
                break;
        }
    }
    private void Refactor() {
        radGr = findViewById(R.id.radGr);
        radXemBongDa = findViewById(R.id.radXemBongDa);
        radXemPhim = findViewById(R.id.radXemPhim);
        radNgheNhac = findViewById(R.id.radNgheNhac);
        radChoiGame = findViewById(R.id.radChoiGame);
        btnVote = findViewById(R.id.btnVote);
    }
}
