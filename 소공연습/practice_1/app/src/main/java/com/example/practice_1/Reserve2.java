package com.example.practice_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Reserve2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve2);



        Button prebtn5 = findViewById(R.id.prebtn5);
        prebtn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reserve2.this, Reserve_1.class);
                startActivity(intent);
            }
        });


        Button Nextbtn1 = findViewById(R.id.Nextbtn1);
        Nextbtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reserve2.this, Reserve_3.class);
                startActivity(intent);
            }
        });
    }
}