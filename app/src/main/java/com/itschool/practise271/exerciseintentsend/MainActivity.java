package com.itschool.practise271.exerciseintentsend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_name, et_old;
    Button bt_next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_name = findViewById(R.id.et_name);
        et_old = findViewById(R.id.et_old);
        bt_next = findViewById(R.id.next);

        bt_next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                next();
            }
        });

    }

    private void next() {
        String name = et_name.getText().toString();
        int old = Integer.parseInt(et_old.getText().toString());
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name_str", name);
        intent.putExtra("old_int", old);
        startActivity(intent);
    }
}
