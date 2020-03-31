package com.eztech.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView txtA, txtB, txtKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Refactor();
        View.OnClickListener myClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnCong:
                        Cong();
                        break;
                    case R.id.btnTru:
                        Tru();
                        break;
                    case R.id.btnNhan:
                        Nhan();
                        break;
                    case R.id.btnChia:
                        Chia();
                        break;
                }
            }
        };
        btnCong.setOnClickListener(myClick);
        btnTru.setOnClickListener(myClick);
        btnNhan.setOnClickListener(myClick);
        btnChia.setOnClickListener(myClick);
    }

    @SuppressLint("SetTextI18n")
    private void Cong() {
        String soA = txtA.getText().toString();
        String soB = txtB.getText().toString();
        double a = Double.parseDouble(soA);
        double b = Double.parseDouble(soB);
        txtKq.setText(getString(R.string.kql) + (a + b));
    }
    @SuppressLint("SetTextI18n")
    private void Tru() {
        String soA = txtA.getText().toString();
        String soB = txtB.getText().toString();
        double a = Double.parseDouble(soA);
        double b = Double.parseDouble(soB);
        txtKq.setText(getString(R.string.kql) + (a - b));
    }
    @SuppressLint("SetTextI18n")
    private void Nhan() {
        String soA = txtA.getText().toString();
        String soB = txtB.getText().toString();
        double a = Double.parseDouble(soA);
        double b = Double.parseDouble(soB);
        txtKq.setText(getString(R.string.kql) + (a * b));
    }
    @SuppressLint("SetTextI18n")
    private void Chia() {
        String soA = txtA.getText().toString();
        String soB = txtB.getText().toString();
        double a = Double.parseDouble(soA);
        double b = Double.parseDouble(soB);
        txtKq.setText(getString(R.string.kql) + (a / b));
    }

    private void Refactor() {
        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        txtA = findViewById(R.id.txtA);
        txtB = findViewById(R.id.txtB);
        txtKq = findViewById(R.id.lblKQ);
    }
}
