package com.example.calender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCalendarView materialCalendarView;
        materialCalendarView=findViewById((R.id.calendarView));
        materialCalendarView.addDecorators(
                new SaturdayDecorator(),
                new SundayDecorator(),
                new TodayDecorator(),
                new MySelectorDecorator(this)
        );

        Button button=(Button) findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),MainAddressActivity.class);
                startActivity(intent);
            }

        });
    }
}
