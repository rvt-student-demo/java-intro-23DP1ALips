package lv.rvt;

import java.io.BufferedReader;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scannner = new Scanner(System.in)
        BufferedReader reader = Utils.getReader("data.csv");
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}