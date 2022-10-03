import java.util.Scanner;

public class Task28 {
    /**
     * Напишите функцию, которая принимает топливо (литры), расход топлива (литры/100 км), пассажиров, кондиционер (логическое значение) и возвращает максимальное расстояние, которое может проехать автомобиль.
     *
     * топливо-это количество литров топлива в топливном баке.
     * Расход топлива-это базовый расход топлива на 100 км (только с водителем внутри).
     * Каждый дополнительный пассажир увеличивает базовый расход топлива на 5%.
     * Если кондиционер включен, то его общий (не базовый) расход топлива увеличивается на 10%.
     *
     * Пример:
     * totalDistance(70.0, 7.0, 0, false) ➞ 1000.0
     *
     * totalDistance(36.1, 8.6, 3, true) ➞ 331.83
     *
     * totalDistance(55.5, 5.5, 5, false) ➞ 807.3
     *
     */


    public static void main(String[] args)
    {
        float oil,oilrasxod;
        int pass;
        boolean condi = false;
        Scanner ui = new Scanner(System.in);
        System.out.print("Введите топливо: ");
        oil = ui.nextFloat();
        System.out.print("Введите расход топлива: ");
        oilrasxod = ui.nextFloat();
        System.out.print("Количество пассажиров: ");
        pass = ui.nextInt();
        System.out.print("Включить кондиционер: (Да - 1/ Нет - 2) \n");
        switch (ui.nextInt())
        {
            case 1:
                condi = true;
                break;

            case 2:
                condi = false;
                break;

            default:
                break;
        }
        System.out.print("Максимальная дистанция: " + totalDistance(oil,oilrasxod,pass,condi));
    }

    public static float totalDistance(float oil,float oilrasxod, int pass,boolean condi)
    {
       float value = oilrasxod * (100 + (pass*5))/100;
       if (condi)
       {
           float value1 = (value * 110) / 100;
           return (oil/value1) * 100;
       }
       return (oil/value) * 100;
    }

}
