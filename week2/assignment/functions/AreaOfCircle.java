package week2.assignment.functions;

import java.util.Scanner;

public class AreaOfCircle {

  public static float findCircleArea(float radius) {
    float area = (float)(3.14 * radius * radius);
    return area;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float radius = sc.nextFloat();
    sc.close();

    float area = findCircleArea(radius);
    System.out.println("Area of cirle is: " + area);
  }
  
}
