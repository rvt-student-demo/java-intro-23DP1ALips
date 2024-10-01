package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times:");
        int num = Integer.valueOf(scanner.nextLine());
        int start = 0;

        while (num != start) {
            printText();
            num -= 1;
        }
    }
    
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}