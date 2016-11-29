package jp.techacademy.haruki.saburi.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    double calcNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView1);

        Intent intent = getIntent();
        calcNumber = intent.getDoubleExtra("calc",0);

        textView.setText(String.valueOf(calcNumber));

    }
}
