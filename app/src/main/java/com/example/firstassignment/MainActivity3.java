package com.example.firstassignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    private LinearLayout math;
    private LinearLayout science;
    private LinearLayout IQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        math =(LinearLayout) findViewById(R.id.math);
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct2();
            }
        });

        science =(LinearLayout) findViewById(R.id.science);
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct3();
            }
        });
        IQ =(LinearLayout) findViewById(R.id.IQ);
        IQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAct4();
            }
        });

    }
    public void openAct2(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openAct3(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void openAct4(){
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}