package com.example.mypiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        final DatabaseReference dBoatServo = database.getReference("BoatServo");
        final DatabaseReference dDiskServo = database.getReference("DiskServo");
        final DatabaseReference dGripServo = database.getReference("GripServo");
        final DatabaseReference dVhandServo = database.getReference("VerticalHandServo");
        final DatabaseReference dHhandServo = database.getReference("HorizontalHandServo");

        final DatabaseReference dAutoMode = database.getReference("AutoMode");
        final DatabaseReference dMotorState = database.getReference("MotorState");

        SeekBar BoatServo = (SeekBar) findViewById(R.id.boat_servo);
        SeekBar DiskServo = (SeekBar) findViewById(R.id.disk_servo);
        SeekBar GripServo = (SeekBar) findViewById(R.id.grip_servo);
        SeekBar VhandServo = (SeekBar) findViewById(R.id.v_hand_servo);
        SeekBar HhandServo = (SeekBar) findViewById(R.id.h_hand_servo);

        Switch AutoMode = (Switch) findViewById(R.id.auto_mode_btn);
        Switch MotorState = (Switch) findViewById(R.id.motor_state_btn);

        AutoMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    //Do something when Switch button is on/checked
                    dAutoMode.setValue(1);
                }
                else
                {
                    //Do something when Switch is off/unchecked
                    dAutoMode.setValue(0);
                }
            }
        });

        MotorState.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    //Do something when Switch button is on/checked
                    dMotorState.setValue(1);
                }
                else
                {
                    //Do something when Switch is off/unchecked
                    dMotorState.setValue(0);
                }
            }
        });

        BoatServo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Boat Servo value "+progress, Toast.LENGTH_SHORT).show();
                dBoatServo.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "Seekbar touch started", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this, "Seekbar touch stopped", Toast.LENGTH_SHORT).show();
            }
        });

        DiskServo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Disk Servo value "+progress, Toast.LENGTH_SHORT).show();
                dDiskServo.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        GripServo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Grip Servo value "+progress, Toast.LENGTH_SHORT).show();
                dGripServo.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        HhandServo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Horizontal Servo value "+progress, Toast.LENGTH_SHORT).show();
                dHhandServo.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        VhandServo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Vertical Servo value "+progress, Toast.LENGTH_SHORT).show();
                dVhandServo.setValue(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
