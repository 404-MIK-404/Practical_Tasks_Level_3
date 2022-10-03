import java.util.Arrays;
import java.util.Scanner;

public class Task24 {


    /**
     *
     *  Идет великая война между четными и нечетными числами. Многие уже погибли в этой войне, и ваша задача-положить этому конец. Вы должны определить, какая группа суммируется больше: четная или нечетная. Выигрывает большая группа.
     *
     * Создайте функцию, которая берет массив целых чисел, суммирует четные и нечетные числа отдельно, а затем возвращает разницу между суммой четных и нечетных чисел.
     *
     * Пример:
     * warOfNumbers([2, 8, 7, 5]) ➞ 2
     * // 2 + 8 = 10
     * // 7 + 5 = 12
     * // 12 is larger than 10
     * // So we return 12 - 10 = 2
     *
     * warOfNumbers([12, 90, 75]) ➞ 27
     *
     * warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
     *
     *
     *
     *
     */

    public static void main(String[] args)
    {
        int value;
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        value = ui.nextInt();
        int[] array  = new int[value];
        for (int i = 0; i < array.length; i++)
        {
            array[i]=(int)(Math.random() * 100);
        }
        System.out.println("Массив: "+ Arrays.toString(array));
        warOfNumbers(array);

    }

    public static void warOfNumbers(int[] array)
    {
        int evenNumbers = Arrays.stream(array).filter(e->e%2 == 0).sum();
        int oddNumbers = Arrays.stream(array).filter(e->e%2 != 0).sum();
        if (evenNumbers > oddNumbers){
            System.out.print("Победили чётные числа: " + (evenNumbers - oddNumbers));
        } else System.out.print("Победили нечётные числа: " + (oddNumbers - evenNumbers));
    }

}
