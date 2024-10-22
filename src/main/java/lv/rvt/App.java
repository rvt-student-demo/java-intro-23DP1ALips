package lv.rvt;

import java.util.*;

public class App
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(Integer.valueOf(scanner.nextLine()));

        int i = Integer.valueOf(scanner.nextLine());

        while(numberList.get(numberList.size()-1) != 1) {
            numberList.add(Integer.valueOf(scanner.nextLine()));
        }

        System.out.println("From where?");
        int f = Integer.valueOf(scanner.nextLine());

        while (numberList.size()- 1 < f || f < 0) {
            f = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("To where?");
        int t = Integer.valueOf(scanner.nextLine());

        while (numberList.size() - 1 < t || t < 0) {
            t = Integer.valueOf(scanner.nextLine());
        }

        while (f <= t) {
            System.out.println(numberList.get(f));
            f++;
        }
    }
}