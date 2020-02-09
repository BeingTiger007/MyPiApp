package com.example.mypiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar BoatServo = (SeekBar) findViewById(R.id.boat_servo);
        SeekBar DiskServo = (SeekBar) findViewById(R.id.disk_servo);
        SeekBar GripServo = (SeekBar) findViewById(R.id.grip_servo);
        SeekBar VhandServo = (SeekBar) findViewById(R.id.v_hand_servo);
        SeekBar HhandServo = (SeekBar) findViewById(R.id.h_hand_servo);

        Button AutoMode = (Button) findViewById(R.id.auto_mode_btn);
        Button MotorState = (Button) findViewById(R.id.motor_state_btn);
    }
}
