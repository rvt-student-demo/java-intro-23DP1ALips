package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter you're name: ");
        String name = scanner.nextLine();
        System.out.println("Enter you're lastname: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter you're age: ");
        String age = scanner.nextLine();
        System.out.println("Enter you're group: ");
        String group = scanner.nextLine();

        String start = ("You're name is " + name + " " + lastName);
        String mid = (". You are " + age + " years old. ");
        String end = ("You're group is " + group + ".");
        System.out.println(start + mid + end);

    }

}