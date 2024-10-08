package lv.rvt;

public class App

{
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            System.out.print('*');
        i++;
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            printStars(size);
        i++;
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
        i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i <= size) {
            printStars(i);
        i++;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        printTriangle(4);
    }
}