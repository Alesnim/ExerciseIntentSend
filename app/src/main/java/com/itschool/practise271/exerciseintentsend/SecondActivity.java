package com.itschool.practise271.exerciseintentsend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText et_food, et_number;
    Button bt_next;
    TextView tv_extra;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        et_food =findViewById(R.id.et_food);
        et_number = findViewById(R.id.et_number);
        bt_next = findViewById(R.id.bt_next);

        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActiv();
            }
        });


        showExtra();

    }

    private void showExtra() {
        String name = getIntent().getStringExtra("name_str");
        Toast.makeText(this, (name != "")? name: "Имя не найдено",Toast.LENGTH_LONG).show();


    }

    private void nextActiv() {
            String food = et_food.getText().toString();
            int number = Integer.parseInt(et_number.getText().toString());
            String name = getIntent().getStringExtra("name_str");
            int old = getIntent().getIntExtra("old_int", 1);
            Intent intent = new Intent(this, ResultActivity.class);

            intent.putExtra("name_str", name);
            intent.putExtra("old_int", old);
            intent.putExtra("food_str", food);
            intent.putExtra("number_int", number);
            startActivity(intent);

    }
}
