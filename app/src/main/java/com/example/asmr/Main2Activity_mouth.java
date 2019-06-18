package com.example.asmr;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;

public class Main2Activity_mouth extends AppCompatActivity {
    MediaPlayer mp;
    SeekBar seekBar;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextView text1, text2, text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_mouth);
        btn1 = (Button) findViewById(R.id.button1_1);
        btn2 = (Button) findViewById(R.id.button1_2);
        btn3 = (Button) findViewById(R.id.button1_3);
        text1 = (TextView) findViewById(R.id.text1);
        mp = MediaPlayer.create(Main2Activity_mouth.this, R.raw.mouthsound);

        seekBar = (SeekBar) findViewById(R.id.playbar1);
        seekBar.setVisibility(ProgressBar.VISIBLE);
        seekBar.setMax(mp.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    mp.seekTo(progress);
                }
                int m = progress / 60000;
                int s = (progress % 60000) / 1000;
                String strTime = String.format("%02d:%02d", m, s);
                text1.setText(strTime);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

                Thread();


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.pause();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                try {
                    mp.prepare();
                } catch (IOException ie) {
                    ie.printStackTrace();
                }
                mp.seekTo(0);
            }
        });
    }
    public void Thread() {
        Runnable task = new Runnable() {


            public void run() {
                // 음악이 재생중일때
                while (mp.isPlaying()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    seekBar.setProgress(mp.getCurrentPosition());
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
