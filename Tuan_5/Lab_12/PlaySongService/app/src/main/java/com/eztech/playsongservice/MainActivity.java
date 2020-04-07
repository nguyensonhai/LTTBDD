package com.eztech.playsongservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPlay, btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refactor();
    }
    public void playSong(View view) {
        // Tạo ra một đối tượng Intent cho một dịch vụ (PlaySongService).
        Intent myIntent = new Intent(MainActivity.this, PlaySongService.class);
        // Gọi phương thức startService (Truyền vào đối tượng Intent)
        this.startService(myIntent);
    }

    public void stopSong(View view) {
        // Tạo ra một đối tượng Intent.
        Intent myIntent = new Intent(MainActivity.this, PlaySongService.class);
        this.stopService(myIntent);
    }

    private void refactor() {
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnStop = (Button) findViewById(R.id.btnStop);
    }
}
