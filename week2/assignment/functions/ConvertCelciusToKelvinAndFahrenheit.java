package week2.assignment.functions;

import java.util.Scanner;

public class ConvertCelciusToKelvinAndFahrenheit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float celcius = sc.nextFloat();
    sc.close();

    float kelvin = convertToKelvin(celcius);
    float fahrenheit = convertToFahrenheit(celcius);
    System.out.println("kelvin: " +  kelvin);
    System.out.println("fahrenheit: " +  fahrenheit);
  }

  private static float convertToFahrenheit(float celcius) {
    return celcius * 9/5 + 32;
  }

  private static float convertToKelvin(float celcius) {
    return celcius + 273.15f;
  }
  
}
