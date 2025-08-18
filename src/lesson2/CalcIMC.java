package lesson2;

import java.util.Scanner;

import static helper.AppHelper.console;

public class CalcIMC {
    public static void main(String[] args) {
        console("==============");
        console("IMC Calculator");
        console("==============");

        console(" ");

        var scan = new Scanner(System.in);
        var wantContinue = true;

       do {
           console("Enter with your weight (0.0)");
           var weight = scan.nextDouble();

           console("Enter with your height (0.00)");
           var height = scan.nextDouble();

           var IMC = weight / Math.pow(height, 2);

           if (IMC <= 18.5) console("Underweight");
           if (IMC > 18.5 && IMC < 24.9) console("Ideal weight");
           if (IMC > 25 && IMC < 29.9) console("Slightly overweight");
           if (IMC > 30 && IMC < 34.9) console("Grade I Obesity");
           if (IMC > 35 && IMC < 39.9) console("Grade II Obesity (Severe)");
           if (IMC >= 40) console("Grade III Obesity (Morbid)");
           console(" ");

           console("Do you want continue? (y/N)");
           var result = scan.next();
           wantContinue = result.equals("y");
       } while (wantContinue);
    }
}
