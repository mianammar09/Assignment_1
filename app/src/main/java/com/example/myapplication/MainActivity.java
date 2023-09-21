package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.loginBtn);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view){
                Intent intent =  new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                
            }
        });


    }
}
