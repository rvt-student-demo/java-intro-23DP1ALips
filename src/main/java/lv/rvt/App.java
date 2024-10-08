package lv.rvt;

public class App

{
    public static void printStars(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print('*');
        }
        
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++){
            printStars(size);
            System.out.println();
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 1; i <= height; i++) {
            printStars(width);
            System.out.println();
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
            System.out.println();
        }
    }

    public static void printSpaces(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(' ');
        }
    }

    public static void printTriangleTwo(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size -i);
            printStars(i);
            System.out.println();
        }
    }

    public static void printChristmasTree(int height) {
        int j = 1;
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(j);
            j += 2;
        System.out.println();
        }
        printSpaces(height - 2);
        printStars(3);
        System.out.println();
        printSpaces(height - 2);
        printStars(3);
        System.out.println();
    }
    
    public static void main(String[] args) {
        printChristmasTree(10);
    }
}