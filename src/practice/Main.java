package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tax;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary:");
        if (scan.hasNextInt()) {
            int salary = scan.nextInt();
            if (salary >= 0 && salary <= 10_000) {
                tax = salary * 25 * 1.0 / 1000;
            } else if (salary > 10_000 && salary <= 25_000) {
                tax = salary * 43 * 1.0 / 1000;
            } else {
                tax = salary * 67 * 1.0 / 1000;
            }
            System.out.printf("Your monthly tax is %.2f", tax);
        } else {
            System.out.println("You entered a wrong value!!!");
        }
    }
}