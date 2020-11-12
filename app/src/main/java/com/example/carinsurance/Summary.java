package com.example.carinsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {
    TextView summaryText;
    TextView amountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        summaryText = (TextView)findViewById(R.id.summary);
        summaryText.setText(getIntent().getStringExtra("summary"));
        amountText = (TextView)findViewById(R.id.amt);
        amountText.setText(getIntent().getStringExtra("amt"));
    }
}
