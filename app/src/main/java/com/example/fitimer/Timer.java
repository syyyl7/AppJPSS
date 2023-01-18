package com.example.fitimer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Timer extends AppCompatActivity {
    Button button7;
    Button button8;

    Button button9;

    MediaPlayer mediaPlayer;

    SeekBar seekBar;

    TextView textView9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Timer.this, HomePageActivity.class);
                startActivity(intent7);
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }

        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go();

            }
            
        });

        seekBar = findViewById(R.id.seekBar);
        textView9 = findViewById(R.id.textView9);
        button9 = findViewById(R.id.button9);

        seekBar.setMax(180);
        seekBar.setProgress(30);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                updateTimer(i, textView9);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    public void go() {
        seekBar.setEnabled(false);
        CountDownTimer countDownTimer = new CountDownTimer(seekBar.getProgress() * 1000, 1000) {
            @Override
            public void onTick(long l) {
                updateTimer((int) (l / 1000), textView9);

            }

            @Override
            public void onFinish() {
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alarm);
                mediaPlayer.start();

            }
        }.start();

    }

    private void updateTimer(int secondsLeft, TextView textView9) {
        int minutes = secondsLeft / 60;
        int seconds = secondsLeft - (minutes * 60);

        textView9.setText(String.format("%02d", minutes) + ":" + String.format("%02d", seconds));
    }

    }





