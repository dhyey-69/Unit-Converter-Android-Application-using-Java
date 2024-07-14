package com.example.unitconverterbig;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class ConversionActivity extends AppCompatActivity {

    private TextView appTitle;
    private EditText inputValue;
    private Spinner fromUnit;
    private Spinner toUnit;
    private Button convertButton;
    private TextView resultView;

    private String[] unitArray;
    private String[] lengthUnits = {"Meter", "Centimeter", "Millimeter"};
    private String[] weightUnits = {"Kilogram", "Gram"};
    private String[] temperatureUnits = {"Celsius", "Fahrenheit", "Kelvin"};
    private String[] volumeUnits = {"Liter", "Milliliter", "Gallon"};
    private String[] areaUnits = {"Square Meter", "Square Foot", "Square Kilometer"};
    private String[] speedUnits = {"Meter/Second", "Kilometer/Hour", "Miles/Hour"};
    private String[] timeUnits = {"Second", "Minute", "Hour"};
    private String[] numberSystemUnits = {"Decimal", "Binary", "Hexadecimal"};
    private String[] currencyUnits = {"USD", "EUR", "GBP", "INR"}; // Add more currencies as needed

    private String initialCategory; // Declare initialCategory here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        appTitle = findViewById(R.id.appTitle);
        inputValue = findViewById(R.id.inputValue);
        fromUnit = findViewById(R.id.fromUnit);
        toUnit = findViewById(R.id.toUnit);
        convertButton = findViewById(R.id.convertButton);
        resultView = findViewById(R.id.resultView);

        initialCategory = getIntent().getStringExtra("categoryName");
        appTitle.setText(initialCategory + " Converter");

        // Choose units array based on the selected category
        String[] unitsArray;
        switch (initialCategory) {
            case "Length":
                unitsArray = lengthUnits;
                break;
            case "Weight":
                unitsArray = weightUnits;
                break;
            case "Temperature":
                unitsArray = temperatureUnits;
                break;
            case "Volume":
                unitsArray = volumeUnits;
                break;
            case "Area":
                unitsArray = areaUnits;
                break;
            case "Speed":
                unitsArray = speedUnits;
                break;
            case "Time":
                unitsArray = timeUnits;
                break;
            case "Number":
                unitsArray = numberSystemUnits;
                break;
            case "Currency":
                unitsArray = currencyUnits;
                break;
            default:
                unitsArray = lengthUnits; // Default to length units
                break;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, unitsArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromUnit.setAdapter(adapter);
        toUnit.setAdapter(adapter);

        fromUnit.setSelection(0); // Optional: Set initial selection
        toUnit.setSelection(1); // Optional: Set initial selection

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnits();
            }
        });
    }

    private void convertUnits() {
        String inputValueStr = inputValue.getText().toString();
        double inputValue = Double.parseDouble(inputValueStr);
        String fromUnitSelected = fromUnit.getSelectedItem().toString();
        String toUnitSelected = toUnit.getSelectedItem().toString();

        double result = 0.0;
        switch (initialCategory) {
            case "Length":
                result = ConversionUtils.convertLength(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Weight":
                result = ConversionUtils.convertWeight(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Temperature":
                result = ConversionUtils.convertTemperature(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Volume":
                result = ConversionUtils.convertVolume(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Area":
                result = ConversionUtils.convertArea(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Speed":
                result = ConversionUtils.convertSpeed(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Time":
                result = ConversionUtils.convertTime(inputValue, fromUnitSelected, toUnitSelected);
                break;
            case "Number":
                // Convert number system only if the input value is numeric
                if (inputValueStr.matches("\\d+")) {
                    result = Double.parseDouble(ConversionUtils.convertNumberSystem(inputValueStr, fromUnitSelected, toUnitSelected));
                } else {
                    // Handle non-numeric input case
                    resultView.setText("Invalid input for number system conversion");
                    return;
                }
                break;
            case "Currency":
                result = ConversionUtils.convertCurrency(inputValue, fromUnitSelected, toUnitSelected);
                break;
            default:
                resultView.setText("Invalid category");
                return;
        }

        resultView.setText(String.valueOf(result));
    }
}
