package com.example.numbercalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewNumber;
    private Button buttonNumber;
    private EditText editTextNumber;
    private int doubleNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initListeners();
    }

    private void initUI() {
        textViewNumber = findViewById(R.id.textViewNumber);
        buttonNumber = findViewById(R.id.buttonNumber);
        editTextNumber = findViewById(R.id.editTextNumber);
    }

    private void initListeners() {
        buttonNumber.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonNumber) {
            if (editTextNumber.getText().toString().matches("")) {
                editTextNumber.setError("you must write something!");
                textViewNumber.setText("");
            } else {
                doubleNum = Integer.parseInt(editTextNumber.getText().toString()) * Integer.parseInt(editTextNumber.getText().toString());
                textViewNumber.setText(String.valueOf(doubleNum));
            }
        }
    }

}
