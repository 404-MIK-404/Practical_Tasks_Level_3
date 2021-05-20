import java.util.Arrays;
import java.util.Scanner;

public class Task29 {


    public static void main(String[] args)
    {
        int value;
        float temp = 0;
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        value = ui.nextInt();
        float[] array = new float[value];
        for (int i = 0; i < array.length;i++)
        {
            array[i] = (int)(Math.random() * 5);
            temp += array[i];
        }
        System.out.println("Массив: " + Arrays.toString(array));
        float d = (float)(temp/array.length);
        System.out.print("Результат: " + d);

    }

}
