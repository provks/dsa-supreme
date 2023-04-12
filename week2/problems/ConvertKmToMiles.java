package week2.problems;

import java.util.Scanner;

public class ConvertKmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        sc.close();

        double miles = km/1.609;
        System.out.println(miles);
    }
    
}
