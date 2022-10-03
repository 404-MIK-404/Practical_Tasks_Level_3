import java.util.Arrays;
import java.util.Scanner;

public class Task29 {

    /**
     *
     * Создайте функцию, которая принимает массив чисел и возвращает среднее значение (average) всех этих чисел.
     *
     * Пример:
     * mean([1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3]) ➞ 2.55
     *
     * mean([2, 3, 2, 3]) ➞ 2.50
     *
     * mean([3, 3, 3, 3, 3]) ➞ 3.00
     *
     *
     */

    public static void main(String[] args)
    {
        int value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        value = ui.nextInt();
        int[] array = new int[value];
        for (int i = 0; i < array.length;i++)
        {
            array[i] = (int)(Math.random() * 5);
        }

        float result = (float) Arrays.stream(array).sum() / array.length;
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.format("Результат %.2f", result);

    }

}
