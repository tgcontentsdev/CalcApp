package jp.techacademy.haruki.saburi.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    double number1;
    double number2;
    double number3;
    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

        Button plusButton = (Button) findViewById(R.id.plusButton);
        plusButton.setOnClickListener(this);

        Button minusButton = (Button) findViewById(R.id.minusButton);
        minusButton.setOnClickListener(this);

        Button multiButton = (Button) findViewById(R.id.multiButton);
        multiButton.setOnClickListener(this);

        Button divButton = (Button) findViewById(R.id.divButton);
        divButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        number1 = Double.parseDouble(mEditText1.getText().toString());
        number2 = Double.parseDouble(mEditText2.getText().toString());

        if (v.getId() == R.id.plusButton){
            number3 = number1 + number2;
        }else if (v.getId() == R.id.minusButton){
            number3 = number1 - number2;
        }else if (v.getId() == R.id.multiButton){
            number3 = number1 * number2;
        }else if (v.getId() == R.id.divButton){
            number3 = number1 / number2;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("calc",number3);
        intent.putExtra("calc1",number1);
        intent.putExtra("calc2",number2);
        startActivity(intent);
    }
}
