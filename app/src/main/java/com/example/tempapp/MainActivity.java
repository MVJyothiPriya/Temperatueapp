package com.example.tempapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCelsius;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCelsius = findViewById(R.id.editTextCelsius);
        textViewResult = findViewById(R.id.textViewResult);
    }

    public void convertTemperature(View view) {
        try {
            // Get the temperature in Celsius from the EditText
            String celsiusString = editTextCelsius.getText().toString();
            double celsius = Double.parseDouble(celsiusString);

            // Convert Celsius to Fahrenheit
            double fahrenheit = (celsius * 9/5) + 32;

            // Display the result in TextView
            String resultText = celsius + "°C is " + fahrenheit + "°F";
            textViewResult.setText(resultText);
        } catch (NumberFormatException e) {
            textViewResult.setText("Invalid input");
        }
    }
}
