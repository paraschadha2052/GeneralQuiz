package com.example.android.generalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        int score = 0;
        RadioGroup rb;

        rb = (RadioGroup) findViewById(R.id.q1);
        if(rb.getCheckedRadioButtonId()==R.id.q1op4) score += 1;

        rb = (RadioGroup) findViewById(R.id.q2);
        if(rb.getCheckedRadioButtonId()==R.id.q2op4) score += 1;

        rb = (RadioGroup) findViewById(R.id.q3);
        if(rb.getCheckedRadioButtonId()==R.id.q3op4) score += 1;

        rb = (RadioGroup) findViewById(R.id.q4);
        if(rb.getCheckedRadioButtonId()==R.id.q4op2) score += 1;

        rb = (RadioGroup) findViewById(R.id.q5);
        if(rb.getCheckedRadioButtonId()==R.id.q5op2) score += 1;

        Toast.makeText(this, "You got "+score+"/5 correct.", Toast.LENGTH_LONG).show();
    }

    public void reset(View view){
        RadioGroup rb;

        rb = (RadioGroup) findViewById(R.id.q1);
        rb.clearCheck();

        rb = (RadioGroup) findViewById(R.id.q2);
        rb.clearCheck();

        rb = (RadioGroup) findViewById(R.id.q3);
        rb.clearCheck();

        rb = (RadioGroup) findViewById(R.id.q4);
        rb.clearCheck();

        rb = (RadioGroup) findViewById(R.id.q5);
        rb.clearCheck();
    }

}
