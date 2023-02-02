import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[scanner.nextInt()]; //задаем длинну массива
        int number = scanner.nextInt(); // вводим число

        for (int i = 0; i < a.length; i++) { //заполняем масив числами с консоли
            a[i] = scanner.nextInt();

        }

        for (int i = 0; i < a.length; i++) { // перебираем каждый наш элемент массива
            if (a[i] == number) { // находим тот что нам нужен и определяем его индекс
                System.out.println(i);// вывожим на экран индекс
                break;

            }


        }

    }
}