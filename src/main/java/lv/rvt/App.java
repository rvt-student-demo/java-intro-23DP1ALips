package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int sum = 0;
        int numb = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (input >= 0) {
                sum += input;
                numb += 1;
            }

            if (input % 2 == 0) {
                even++;
            }

            if (input % 2 == 1) {
                odd++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numb);
        System.out.println("Average: " + sum/numb);
        System.out.println("Even: " + even);
        System.out.println("Odd " + odd);
    }
}