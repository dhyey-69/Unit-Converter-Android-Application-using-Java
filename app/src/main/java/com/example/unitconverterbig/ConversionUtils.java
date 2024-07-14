package com.example.unitconverterbig;

public class ConversionUtils {

    // Length conversions
    public static double convertLength(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Meter":
                switch (toUnit) {
                    case "Centimeter":
                        result = value * 100;
                        break;
                    case "Millimeter":
                        result = value * 1000;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Centimeter":
                switch (toUnit) {
                    case "Meter":
                        result = value / 100;
                        break;
                    case "Millimeter":
                        result = value * 10;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Millimeter":
                switch (toUnit) {
                    case "Meter":
                        result = value / 1000;
                        break;
                    case "Centimeter":
                        result = value / 10;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Weight conversions
    public static double convertWeight(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Kilogram":
                switch (toUnit) {
                    case "Gram":
                        result = value * 1000;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Gram":
                switch (toUnit) {
                    case "Kilogram":
                        result = value / 1000;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Temperature conversions
    public static double convertTemperature(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Celsius":
                switch (toUnit) {
                    case "Fahrenheit":
                        result = (value * 9 / 5) + 32;
                        break;
                    case "Kelvin":
                        result = value + 273.15;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Fahrenheit":
                switch (toUnit) {
                    case "Celsius":
                        result = (value - 32) * 5 / 9;
                        break;
                    case "Kelvin":
                        result = (value + 459.67) * 5 / 9;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Kelvin":
                switch (toUnit) {
                    case "Celsius":
                        result = value - 273.15;
                        break;
                    case "Fahrenheit":
                        result = (value * 9 / 5) - 459.67;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Volume conversions
    public static double convertVolume(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Liter":
                switch (toUnit) {
                    case "Milliliter":
                        result = value * 1000;
                        break;
                    case "Gallon":
                        result = value * 0.264172;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Milliliter":
                switch (toUnit) {
                    case "Liter":
                        result = value / 1000;
                        break;
                    case "Gallon":
                        result = value * 0.000264172;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Gallon":
                switch (toUnit) {
                    case "Liter":
                        result = value * 3.78541;
                        break;
                    case "Milliliter":
                        result = value * 3785.41;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Area conversions
    public static double convertArea(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Square Meter":
                switch (toUnit) {
                    case "Square Foot":
                        result = value * 10.7639;
                        break;
                    case "Square Kilometer":
                        result = value * 0.000001;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Square Foot":
                switch (toUnit) {
                    case "Square Meter":
                        result = value * 0.092903;
                        break;
                    case "Square Kilometer":
                        result = value * 9.2903e-8;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Square Kilometer":
                switch (toUnit) {
                    case "Square Meter":
                        result = value * 1000000;
                        break;
                    case "Square Foot":
                        result = value * 10763910.4;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Speed conversions
    public static double convertSpeed(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Meter/Second":
                switch (toUnit) {
                    case "Kilometer/Hour":
                        result = value * 3.6;
                        break;
                    case "Miles/Hour":
                        result = value * 2.23694;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Kilometer/Hour":
                switch (toUnit) {
                    case "Meter/Second":
                        result = value / 3.6;
                        break;
                    case "Miles/Hour":
                        result = value / 1.60934;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Miles/Hour":
                switch (toUnit) {
                    case "Meter/Second":
                        result = value / 2.23694;
                        break;
                    case "Kilometer/Hour":
                        result = value * 1.60934;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Time conversions
    public static double convertTime(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "Second":
                switch (toUnit) {
                    case "Minute":
                        result = value / 60;
                        break;
                    case "Hour":
                        result = value / 3600;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Minute":
                switch (toUnit) {
                    case "Second":
                        result = value * 60;
                        break;
                    case "Hour":
                        result = value / 60;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Hour":
                switch (toUnit) {
                    case "Second":
                        result = value * 3600;
                        break;
                    case "Minute":
                        result = value * 60;
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Number System conversions
    public static String convertNumberSystem(String value, String fromUnit, String toUnit) {
        String result = value;
        switch (fromUnit) {
            case "Decimal":
                switch (toUnit) {
                    case "Binary":
                        result = Integer.toBinaryString(Integer.parseInt(value));
                        break;
                    case "Hexadecimal":
                        result = Integer.toHexString(Integer.parseInt(value));
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Binary":
                switch (toUnit) {
                    case "Decimal":
                        result = String.valueOf(Integer.parseInt(value, 2));
                        break;
                    case "Hexadecimal":
                        result = Integer.toHexString(Integer.parseInt(value, 2));
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "Hexadecimal":
                switch (toUnit) {
                    case "Decimal":
                        result = String.valueOf(Integer.parseInt(value, 16));
                        break;
                    case "Binary":
                        result = Integer.toBinaryString(Integer.parseInt(value, 16));
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }

    // Currency conversions
    public static double convertCurrency(double value, String fromUnit, String toUnit) {
        double result = 0.0;
        switch (fromUnit) {
            case "USD":
                switch (toUnit) {
                    case "EUR":
                        result = value * 0.85; // Example conversion rate
                        break;
                    case "GBP":
                        result = value * 0.75; // Example conversion rate
                        break;
                    case "INR":
                        result = value * 74.50; // Example conversion rate
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "EUR":
                switch (toUnit) {
                    case "USD":
                        result = value / 0.85; // Example conversion rate
                        break;
                    case "GBP":
                        result = value * 1.17; // Example conversion rate
                        break;
                    case "INR":
                        result = value * 88.11; // Example conversion rate
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "GBP":
                switch (toUnit) {
                    case "USD":
                        result = value / 0.75; // Example conversion rate
                        break;
                    case "EUR":
                        result = value / 1.17; // Example conversion rate
                        break;
                    case "INR":
                        result = value * 94.36; // Example conversion rate
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            case "INR":
                switch (toUnit) {
                    case "USD":
                        result = value / 74.50; // Example conversion rate
                        break;
                    case "EUR":
                        result = value / 88.11; // Example conversion rate
                        break;
                    case "GBP":
                        result = value / 94.36; // Example conversion rate
                        break;
                    // Add more conversions as needed
                    default:
                        result = value; // Default to returning the input value
                        break;
                }
                break;
            // Add more cases for other units as needed
            default:
                result = value; // Default to returning the input value
                break;
        }
        return result;
    }
}
