package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program
{

  public static void main (String[]args)
  {
    Locale.setDefault (Locale.US);
    Scanner input = new Scanner (System.in);

//              Calculator calc = new Calculator();

      System.out.print ("Enter radius: ");
    double radius = input.nextDouble ();

    double circumference = Calculator.circumference (radius);
    double volume = Calculator.volume (radius);

      System.out.printf ("Circumference: %.2f%n", circumference);
      System.out.printf ("Volume: %.2f%n", volume);
      System.out.printf ("PI value: %.2f%n", Calculator.pi);

      input.close ();
  }

}
