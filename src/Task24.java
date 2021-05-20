import java.util.Arrays;
import java.util.Scanner;

public class Task24 {


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
        int valuechet = 0;
        int valuenotchet = 0;
        for (int i = 0;i<array.length;i++)
        {
            if (i%2 == 0)
            {
                valuechet += array[i];
            }
            else
            {
                valuenotchet += array[i];
            }
        }
        if (valuechet > valuenotchet)
        {
            System.out.print("Выиграла четная группа: " + (valuechet - valuenotchet));
        }
        else
        {
            System.out.print("Выиграла нечётная группа: " + (valuenotchet - valuechet));
        }

    }

}
