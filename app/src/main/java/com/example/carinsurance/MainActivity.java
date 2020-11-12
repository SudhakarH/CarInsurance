package com.example.carinsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        EditText name = (EditText) findViewById(R.id.name_field);
        String value = name.getText().toString();
        EditText number = (EditText) findViewById(R.id.car_number_field);
        String value1 = number.getText().toString();

        EditText model = (EditText) findViewById(R.id.car_model_field);
        String value2 = model.getText().toString();

        EditText year = (EditText) findViewById(R.id.year_field);
        String value3 = year.getText().toString();


        int amt = 0;
        if(value2 == "Nano") {
            amt = getRandomInteger(4000, 3000);
        }
        if(value2 == "swift") {
            amt = getRandomInteger(5000, 4000);
        }
        if(value2 == "Eeco") {
            amt = getRandomInteger(7000, 5000);
        }
        if(value2 == "i20") {
            amt = getRandomInteger(10000, 7000);
        }
        else {
            amt = 100000;
        }
        String details = "\n Owner Name: " + value + "\n Car Number: "+ value1 + "\n Car Model: "+ value2 + "\n Year of Model: " + value3;

        String s=String.valueOf(amt);
        String amount = "\n Insurance amount: "+ s;

        Intent intent = new Intent(MainActivity.this, Summary.class);

        intent.putExtra("summary", details);
        intent.putExtra("amt", amount);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }


}