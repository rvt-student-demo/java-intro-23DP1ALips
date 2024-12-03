package lv.rvt;
import java.nio.file.StandardOpenOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet jūsu vārdu: ");
        String name = scanner.nextLine();
        System.out.println("Ievadiet jūsu vecumu: ");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet jūsu svaru: ");
        int weight = Integer.valueOf(scanner.nextLine());
        System.out.println("Ievadiet jūsu augstumu: ");
        int height = Integer.valueOf(scanner.nextLine());

        Person person = new Person(name, age, weight, height);

        PersonManager.addPerson(person);
        System.out.println("Paldies par reģistrāciju!");
    }
    public static void modify(Person person) {
        person.setName("Modified!");
    }
}