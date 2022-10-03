import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task21 {


    /**
     *  Учитывая массив городов и населения, верните массив, в котором все население округлено до ближайшего миллиона.
     *
     *  Пример:
     *  millionsRounding([
     *   ["Nice", 942208],
     *   ["Abu Dhabi", 1482816],
     *   ["Naples", 2186853],
     *   ["Vatican City", 572]
     *  ]) ➞ [
     *
     *   ["Nice", 1000000],
     *   ["Abu Dhabi", 1000000],
     *   ["Naples", 2000000],
     *   ["Vatican City", 0]
     *
     * ]
     *
     * millionsRounding([
     *   ["Manila", 13923452],
     *   ["Kuala Lumpur", 7996830],
     *   ["Jakarta", 10770487]
     * ]) ➞ [
     *
     *   ["Manila", 14000000],
     *   ["Kuala Lumpur", 8000000],
     *   ["Jakarta", 11000000]
     *
     *  ]
     *
     *
     *
     *
     */


    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество городов: ");
        int value = ui.nextInt();
        Map<String,Integer> array = new HashMap<String,Integer>();
        for (int i = 0; i < value; i++)
        {
            System.out.print("Название города: ");
            ui.nextLine();
            String nameCity = ui.nextLine();
            System.out.print("Население: " );
            int naselenieValue = ui.nextInt();
            array.put(nameCity,naselenieValue);
        }
        millionsRounding(array);
    }

    public static void millionsRounding(Map<String,Integer> array)
    {
        for (Map.Entry<String, Integer> entry : array.entrySet())
        {
            array.put(entry.getKey(),Math.round((float)entry.getValue()/1000000)* 1000000);
            System.out.println("[" +entry.getKey() + ", " + entry.getValue() + "]");
        }

    }


}
