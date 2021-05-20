import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task21 {

    private static int value;
    private static String nameCity;
    private static int naselenie;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество элементов в массиве: ");
        value = ui.nextInt();
        Map<String,Integer> array = new HashMap<String,Integer>();
        for (int i = 0; i < value; i++)
        {
            System.out.print("Название города: ");
            ui.nextLine();
            nameCity = ui.nextLine();
            System.out.print("Население: " );
            naselenie = ui.nextInt();
            array.put(nameCity,naselenie);
        }
        millionsRounding(array);
    }

    public static void millionsRounding(Map<String,Integer> array)
    {
        for (Map.Entry<String, Integer> entry : array.entrySet())
        {
            array.put(entry.getKey(),Math.round((float)entry.getValue()/1000000)* 1000000);
            System.out.print("[" +entry.getKey() + ", " + entry.getValue() + "]");
        }

    }


}
