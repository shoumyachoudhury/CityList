package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView text = (TextView)findViewById(R.id.cityView);
        Button button = (Button) findViewById(R.id.button);

        String city = getIntent().getStringExtra("city");

        if(!city.isEmpty())
        {
            text.setText(city);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShowActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}