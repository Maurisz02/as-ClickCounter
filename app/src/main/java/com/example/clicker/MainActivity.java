package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private Button pluszButton;
    private Button minuszButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        pluszButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(textView.getText().toString());
                num++;
                if (num==0){
                    textView.setTextColor(Color.rgb(0,0,255));
                }else if (num<0){
                    textView.setTextColor(Color.rgb(255,0,0));
                }else{
                    textView.setTextColor(Color.rgb(0,255,0));
                }
                textView.setText(String.valueOf(num));
            }
        });

        minuszButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(textView.getText().toString());
                num--;
                if (num==0){
                    textView.setTextColor(Color.rgb(0,0,255));
                }else if (num<0){
                    textView.setTextColor(Color.rgb(255,0,0));
                }else{
                    textView.setTextColor(Color.rgb(0,255,0));
                }
                textView.setText(String.valueOf(num));
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.rgb(0,0,255));
                textView.setText(String.valueOf(0));

            }
        });
    }

    private void init(){
        layout = findViewById(R.id.layoutA);
        pluszButton = findViewById(R.id.pluszButton);
        minuszButton = findViewById(R.id.minuszButton);
        textView = findViewById(R.id.textView);
    }
}