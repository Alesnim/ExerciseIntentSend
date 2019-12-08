package com.itschool.practise271.exerciseintentsend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tv_name, tv_old, tv_food, tv_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        tv_name = findViewById(R.id.tw_name);
        tv_old = findViewById(R.id.tw_old);
        tv_food = findViewById(R.id.tw_food);
        tv_number = findViewById(R.id.tw_number);

        String name = getIntent().getStringExtra("name_str");
        tv_name.setText(name);

        int old = getIntent().getIntExtra("old_int", 1);
        tv_old.setText(Integer.toString(old));


        String food = getIntent().getStringExtra("food_str");
        tv_food.setText(food);

        int number = getIntent().getIntExtra("number_int", 0);
        tv_number.setText(Integer.toString(number));

    }
}
