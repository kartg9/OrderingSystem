package com.example.kartg.orderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity01 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main01);
        Button nextPageBtn = (Button)findViewById(R.id.button);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity01.this , Page2.class);
                startActivity(intent);
            }
        });
            Button nextPageBtn2 = (Button)findViewById(R.id.button2);
            nextPageBtn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent2 = new Intent();
                    intent2.setClass(MainActivity01.this , Page3.class);
                    startActivity(intent2);
                    MainActivity01.this.finish();

                }
            });

    }
}
