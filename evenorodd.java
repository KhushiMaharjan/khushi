package EVENORODD;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter any number");
        number = scanner.nextInt();
        if(number % 2==0){
            System.out.println("EVen");
        }
        else{
            System.out.println("Odd");
        }
    }
}
