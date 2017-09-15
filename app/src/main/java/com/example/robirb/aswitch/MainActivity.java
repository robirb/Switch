package com.example.robirb.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch switch1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        switch1 = (Switch) (Switch) findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) this);

        if (switch1.isChecked()){
            textView.setText("switch on");
        }else{
            textView.setText("switch off");
        }


    }

}
