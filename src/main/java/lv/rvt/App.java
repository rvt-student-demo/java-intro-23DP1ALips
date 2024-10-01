package lv.rvt;

import java.util.Scanner;

public class App

{
    public static void main( String[] args ) {
        divisibleByThree(3, 6);
    }

    public static void divisibleByThree(int beggining, int end) {
        while (beggining <= end) {
            if (beggining % 3 == 0) {
                System.out.println(beggining);
            }
            beggining++;
        }
    }
}