package lv.rvt;

import java.io.BufferedReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();
        while (true) {
            System.out.println(timer);
            timer.advance();
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}