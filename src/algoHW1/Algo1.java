package algoHW1;

import java.util.Scanner;

public class Algo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first num: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second num: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third num: ");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;


        System.out.println("Сумма чисел: " + sum);


    }
}



