package chapter4;

import java.util.Scanner;

public class AddNumbers1 {
    public static void main(String[] args) {
        boolean again;
        do{
            System.out.println("Please enter the first number");
            Scanner scanner = new Scanner(System.in);
            double num1= scanner.nextDouble();

            System.out.println("Please enter the second number");
            double num2  = scanner.nextDouble();

            double sum =num1+num2;
            System.out.println("The sum of the 2 numbers is: " + sum);

            System.out.println("Would you like to start over? True or false");
            again=scanner.nextBoolean();

        }while (again);

    }
}
