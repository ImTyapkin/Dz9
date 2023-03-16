import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива (целое число): ");
        int size = input.nextInt(); // Ввод размера массива
        double doubleArray[] = new double[size];
        System.out.println("Введите элементы массива (формат ввода десятичного числа - '1,1'): ");
                for (int i = 0; i < size; i++) {
                    doubleArray[i] = input.nextDouble(); // Ввод элементов массива
        }
        System.out.println ("Введённые элементы массива: ");
        for (int i = 0; i < size; i++) {
            System.out.println (" " + doubleArray[i]); // Вывод элементов массива
        }
        System.out.println();

        double mid = doubleArray[doubleArray.length / 2];
        System.out.println ("Среднее арифметическое: " + mid);

        System.out.println ("Элементы массива умноженные на среднее арифметическое: ");
        for (int i = 0; i < size; i++) {

            System.out.println (" " + doubleArray[i] * mid);
        }
        System.out.println();

    }
}
